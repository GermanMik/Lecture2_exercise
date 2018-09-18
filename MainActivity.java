package com.example.androidaca.lecture2_exercise;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static com.example.androidaca.lecture2_exercise.PreviewPage.TEXT_DATA;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInput = findViewById(R.id.inputtext);
    }

    public void message(View view) {
        Intent intent = new Intent(this, PreviewPage.class);
        String textData = textInput.getText().toString();
        intent.putExtra(TEXT_DATA, textData);
        startActivity(intent);
    }
}
