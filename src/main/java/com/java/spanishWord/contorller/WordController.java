package com.java.spanishWord.contorller;

import com.java.spanishWord.entity.Word;
import com.java.spanishWord.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//@CrossOrigin(maxAge = 3600)
@RestController
public class WordController {

    @Autowired
    private WordService wordService;

    @GetMapping("/random-word")
    public Word getRandomWord() {
        return wordService.getRandomWord();
    }

    @PostMapping("/toggle-word")
    public void toggleWordCheckById(int wordId) {
        wordService.toggleWordCheckById(wordId);
    }

    @GetMapping(value = "/checked-word", produces = "application/json;charset=UTF-8")
    public List<Word> getCheckedWordList() {
        return wordService.getCheckedWordList();
    }

}
