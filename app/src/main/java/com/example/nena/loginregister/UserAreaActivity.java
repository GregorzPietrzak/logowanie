package com.example.nena.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
public class UserAreaActivity extends AppCompatActivity {

    @Override
        final EditText etUserName = (EditText)findViewById(R.id.etUserName);
        final EditText etAge = (EditText)findViewById(R.id.etAge);
    final TextView welcomeMassage = (TextView) findViewById(R.id.idWelcomeMsg);
    }
}
