package com.example.kotoche.accountable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainMenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String applicationName = getResources().getString(R.string.app_name);

        TextView text = new TextView(this);
        applicationName = applicationName.replace("Application", "Testing app");
        text.setText("Welcome, this is an app to manage your budget");
        text.setText(applicationName);

        setContentView(text);
    }


}