package com.example.user.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    EditText enterText;
    TextView answerText;
    Button calculateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        enterText = findViewById(R.id.enter_text);
        answerText = findViewById(R.id.answer_text);
        calculateButton = findViewById(R.id.calculate_button);

    }

    public void onCalculateButtonClicked(View button){
        String answer = enterText.getText().toString();
        WordCount wordCount = new WordCount();
        String answer = wordCount.splitInputIntoSeparateWords(answer);
        Integer.toString(answer)
        answerText.setText(answer);


    }

}
