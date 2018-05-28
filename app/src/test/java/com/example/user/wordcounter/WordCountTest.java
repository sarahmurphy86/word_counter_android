package com.example.user.wordcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCountTest {

    @Test
    public void canSplitWords(){
        WordCount wordCount = new WordCount();
        assertEquals(2, wordCount.splitInputIntoSeparateWords("Hello World"));
        }
    }

