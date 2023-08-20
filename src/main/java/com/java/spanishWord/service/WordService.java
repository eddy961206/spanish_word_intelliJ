package com.java.spanishWord.service;

import com.java.spanishWord.entity.Word;
import com.java.spanishWord.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class WordService {
    private final WordRepository wordRepository;

    @Autowired
    public WordService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    public Word getRandomWord() {
        return wordRepository.getRandomWord();
    }
    @Transactional
    public void toggleWordCheckById(int wordId) {
        wordRepository.toggleWordCheckById(wordId);
    }

    public List<Word> getCheckedWordList() {
        return  wordRepository.getCheckedWordList();
    }
}


