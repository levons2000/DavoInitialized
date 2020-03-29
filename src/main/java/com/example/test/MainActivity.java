package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find button from xml by id
        Button button = findViewById(R.id.main_button);
        final TextView textView = findViewById(R.id.change_text);

        //create listener object for button
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_LONG).show();
                //textView.setText(R.string.davo);
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        };

        //set listener to button
        button.setOnClickListener(listener);

        Switch mySwitch = findViewById(R.id.my_switch);
        final TextView helloText = findViewById(R.id.hello_text);

        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setText("Davo Gavno");
                    helloText.setVisibility(View.INVISIBLE);
                } else {
                    helloText.setVisibility(View.VISIBLE);
                    textView.setText("Levon Lav Txa");
                }
            }
        });
    }
}
