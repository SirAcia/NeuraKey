package com.example.neurakeytaskselection;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtWelcome = findViewById(R.id.txtWelcome);
        Button btnSTA = findViewById(R.id.btnSTA);
        Button btnDTA = findViewById(R.id.btnDTA);




    }
}
