package com.example.backgroundnotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String INTENT_TEXT= "INTENT_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService();
    }

    public void startService() {
        String input = "Test123";

        Intent serviceIntent = new Intent(this, ServiceClass.class);
        serviceIntent.putExtra(INTENT_TEXT, input);

        ContextCompat.startForegroundService(this, serviceIntent);
    }

}
