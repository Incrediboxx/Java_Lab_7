package com.example.myapplication;

public class Answer {
    private String Answer;
    private boolean TrueOrFalse;

    public Answer(String Answer, boolean TrueOrFalse){
        this.Answer = Answer;
        this.TrueOrFalse = TrueOrFalse;
    }

    public String getAnswer() {
        return Answer;
    }

    public boolean isTrueOrFalse() {
        return TrueOrFalse;
    }
}
