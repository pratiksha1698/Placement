package com.example.projectofpratiksha;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Registration extends Activity {
    EditText mTextUsername;
    EditText mTextPassword;
    EditText getmTextcnfPassword;
    Button mButtonRegister;
    TextView mTextViewLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        mTextUsername=(EditText)findViewById(R.id.edittext_username);
        mTextPassword=(EditText)findViewById(R.id.edittext_password);
        getmTextcnfPassword=(EditText)findViewById(R.id.edittext_cnf_password);
        mButtonRegister=( Button)findViewById(R.id.button_login);
        mTextViewLogin=( TextView) findViewById(R.id.textview_register);
        mTextViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent=new Intent(Registration.this, Login.class);
                startActivity(LoginIntent);
            }
        });


    }
}
