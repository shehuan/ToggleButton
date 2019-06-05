package com.othershe.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton) findViewById(R.id.toggle_btn);

        toggleButton.setOnToggledListener(new ToggleListener() {
            @Override
            public void onToggled(boolean isOpen) {
                if (isOpen) {

                } else {

                }
            }
        });
    }
}
