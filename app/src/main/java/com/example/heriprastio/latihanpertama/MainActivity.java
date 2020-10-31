package com.example.heriprastio.latihanpertama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mToyListTextView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToyListTextView = findViewById(R.id.tv_toy_names);
        /*Intent intent = new Intent(this, HelloActivity.class);
        button = findViewById(R.id.buttonLanjut);
        button = startActivity(intent);*/

        ToyBox.getToyNames();
        for (String toyname : ToyBox.getToyNames()) {
            mToyListTextView.append(toyname + "\n\n\n");

        }

    }
}
