package com.example.heriprastio.latihanpertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mToyListTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToyListTextView = findViewById(R.id.tv_toy_names);

        ToyBox.getToyNames();
        for (String toyname: ToyBox.getToyNames()){
            mToyListTextView.append(toyname +"\n\n\n");

        }

    }
}
