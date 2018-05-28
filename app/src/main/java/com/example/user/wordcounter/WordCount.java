package com.example.user.wordcounter;

public class WordCount {

    public WordCount(){

    }

    public int splitInputIntoSeparateWords(String words){
    int noOfWords = words.split(" ").length;
    return noOfWords;
}



    }

