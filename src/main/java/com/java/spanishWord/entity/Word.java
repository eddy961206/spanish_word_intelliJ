package com.java.spanishWord.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@Getter
@ToString
@Entity
@Table(name = "words")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word_id")
    private int wordId;

    @Column(name = "main_title")
    private String mainTitle;

    @Column(name = "sub_title")
    private String subTitle;

    @Column(name = "spanish_word")
    private String spanishWord;

    @Column(name = "english_word")
    private String englishWord;

    @Column(name = "korean_word")
    private String koreanWord;

    @Column(name = "is_checked")
    private int isChecked;

}
