package com.example.sakshi.login_acad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView displaytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        displaytext=(TextView) findViewById(R.id.display);
        Intent i = getIntent();     //getting intent
        Bundle bundle= i.getExtras();       //getting bundle from intent
        String name = bundle.getString("username","");          //getting username with default value as null
        displaytext.setText("WELCOME "+name);           //displaying text inTextView



    }
}
