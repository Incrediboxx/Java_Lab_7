package com.example.myapplication;

public class Question {
    private String Question;
    private Answer One, Two, Three, Four;

    public Question(String Question, Answer One, Answer Two, Answer Three, Answer Four){
        this.Question = Question;
        this.One = One;
        this.Two = Two;
        this.Three = Three;
        this.Four = Four;
    }

    public String getQuestion(){
        return Question;
    }

    public Answer getOne() {
        return One;
    }

    public Answer getTwo() {
        return Two;
    }

    public Answer getThree() {
        return Three;
    }

    public Answer getFour() {
        return Four;
    }
}
