package com.java.spanishWord.repository;

import com.java.spanishWord.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
    // 랜덤 단어를 가져오는 메소드
    @Query(value = "SELECT * FROM words ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Word getRandomWord();

    // 단어 체크 상태 업데이트 메소드
    @Modifying
    @Query("UPDATE Word w SET w.isChecked = CASE WHEN w.isChecked = 0 THEN 1 ELSE 0 END WHERE w.id = ?1")
    void toggleWordCheckById(int wordId);

    // 체크된 단어 리스트 가져오기
    @Query("SELECT w FROM Word w WHERE w.isChecked = 1")
    List<Word> getCheckedWordList();

}
