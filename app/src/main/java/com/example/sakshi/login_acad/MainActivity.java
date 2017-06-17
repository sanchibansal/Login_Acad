package com.example.sakshi.login_acad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText getname, getpassword;        //declaring components
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getname=(EditText)findViewById(R.id.name);
        getpassword=(EditText)findViewById(R.id.password);      //associating components with their ID's
        Login=(Button)findViewById(R.id.login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String original_password="acadgild";        //actual password for successful login
                String name, password1;
                name=getname.getText().toString();      //getting value from name edittext field
                password1=getpassword.getText().toString();     //getting password from edit text field
                if(password1.equals(original_password)){            //condition for checking password
                    Intent i = new Intent(MainActivity.this,Main2Activity.class);
                    Bundle bundle = new Bundle();           // bundle creation
                    bundle.putString("username",name);      //adding data into bundle
                    i.putExtras(bundle);
                    startActivity(i);           //starting activity two
                }else{
                    Toast.makeText(MainActivity.this, "User not found", Toast.LENGTH_SHORT).show(); //displays toast when password does not match
                }
            }
        });
    }
}
