package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Question> Questions = Arrays.asList(
            new Question("С каким листом сравнивают надоедливого человека?",
                    new Answer("С кленовым", false),
                    new Answer("С тетрадным", false),
                    new Answer("С банным", true),
                    new Answer("С осенним", false)),

            new Question("Что у поросенка вместо носа?",
                    new Answer("Червонец", false),
                    new Answer("Копейка", false),
                    new Answer("Полтинник", false),
                    new Answer("Пятачок", true)),

            new Question("Что понадобилось для определения победителя в финале недавнего олимпийского хоккейного турнира?",
                    new Answer("Регтайм", false),
                    new Answer("Прайс-тайм", false),
                    new Answer("Таймс-сквер", false),
                    new Answer("Овертайм", true)),

            new Question("Кто были мамы Толи и Веры в стихотворении Михалкова «А у вас?»",
                    new Answer("Милиционеры", false),
                    new Answer("Инженеры", true),
                    new Answer("Гондольеры", false),
                    new Answer("Кавалеры", false)),

            new Question("Как называют посвящение в священнослужители?",
                    new Answer("Рукоположение", true),
                    new Answer("Рукопожатие", false),
                    new Answer("Руководство", false),
                    new Answer("Рукоприкладство", false)),

            new Question("Что в мультфильме «Летучий корабль» поют бабки-ёжки?",
                    new Answer("Колыбельную", false),
                    new Answer("Частушки", true),
                    new Answer("Романс", false),
                    new Answer("Серенаду", false)),

            new Question("В каком российском городе можно каждый год любоваться северным сиянием?",
                    new Answer("В Перми", false),
                    new Answer("В Мурманске", true),
                    new Answer("В Абакане", false),
                    new Answer("В Новороссийске", false)),

            new Question("Как звали жену итальянского кинорежиссёра Федерико Феллини?",
                    new Answer("Джульетта", true),
                    new Answer("Офелия", false),
                    new Answer("Беатриче", false),
                    new Answer("Дездемона", false)),

            new Question("Без использования чего не сшить настоящей кацавейки?",
                    new Answer("Без бисера", false),
                    new Answer("Без меха", true),
                    new Answer("Без парчи", false),
                    new Answer("Без кожи", false)),

            new Question("Как изначально Пушкин хотел назвать трагедию “Моцарт и Сальери”?",
                    new Answer("'Злодейство'", false),
                    new Answer("'Зависть'", true),
                    new Answer("'Ненависть'", false),
                    new Answer("'Коварство'", false)));

    int Current = 0, Correct = 0, Total = Questions.size();

    private void NextQuestion(){
        TextView Question = findViewById(R.id.Question);
        TextView LabelTotal = findViewById(R.id.Total);
        TextView LabelCorrect = findViewById(R.id.Correct);

        Button One = findViewById(R.id.One);
        Button Two = findViewById(R.id.Two);
        Button Three = findViewById(R.id.Three);
        Button Four = findViewById(R.id.Four);

        if(Current != Total) {
            Question.setText((Current + 1) + ". " + Questions.get(Current).getQuestion());
            LabelTotal.setText("Вопрос: " + (Current + 1) + "/" + Total);
            LabelCorrect.setText("Правильных ответов: " + Correct);
            One.setText(Questions.get(Current).getOne().getAnswer());
            Two.setText(Questions.get(Current).getTwo().getAnswer());
            Three.setText(Questions.get(Current).getThree().getAnswer());
            Four.setText(Questions.get(Current).getFour().getAnswer());
        }
        else {
            LabelCorrect.setText("Правильных ответов: " + Correct);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        NextQuestion();

        final Button One = findViewById(R.id.One);
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View A) {
                if((Current < Total)&&(Questions.get(Current).getOne().isTrueOrFalse())){
                    Correct++;
                }
                Current = (Current < (Total - 1)) ? (Current + 1) : Total;
                NextQuestion();
            }
        });

        final Button Two = findViewById(R.id.Two);
        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View A) {
                if((Current < Total)&&(Questions.get(Current).getTwo().isTrueOrFalse())){
                    Correct++;
                }
                Current = (Current < (Total - 1)) ? (Current + 1) : Total;
                NextQuestion();
            }
        });

        final Button Three = findViewById(R.id.Three);
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View A) {
                if((Current < Total)&&(Questions.get(Current).getThree().isTrueOrFalse())){
                    Correct++;
                }

                Current = (Current < (Total - 1)) ? (Current + 1) : Total;
                NextQuestion();
            }
        });

        final Button Four = findViewById(R.id.Four);
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View A) {
                if((Current < Total)&&(Questions.get(Current).getFour().isTrueOrFalse())){
                    Correct++;
                }
                Current = (Current < (Total - 1)) ? (Current + 1) : Total;
                NextQuestion();
            }
        });
    }
}

