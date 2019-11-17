package com.codingblocks.wildconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText email,password;
    TextView bttn1,bttn2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_login);


        textView = findViewById(R.id.wildlife_text);
        email = findViewById(R.id.login_email_edit);
        password = findViewById(R.id.login_password_edit);
        bttn1 = findViewById(R.id.login_login_btn);
        bttn2 = findViewById(R.id.login_signup_btn);


    }

}
