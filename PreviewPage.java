package com.example.androidaca.lecture2_exercise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PreviewPage extends AppCompatActivity {
    public static final String TEXT_DATA = "TEXT_DATA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_page);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(TEXT_DATA);
        TextView receivedMessage = findViewById(R.id.textViewPreviewPage);
        receivedMessage.setText(messageText);
    }

    public void SendByEmail(View view) {
        TextView receivedMessage = findViewById(R.id.textViewPreviewPage);
        String emailText = (String) receivedMessage.getText();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, emailText);
        intent.putExtra(Intent.EXTRA_TITLE, getString(R.string.text_email_title));
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.text_email_subject));
        Toast.makeText(this, emailText, Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}
