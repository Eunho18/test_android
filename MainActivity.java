package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText et_id, et_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_id = findViewById(R.id.et_id);
        et_password = findViewById(R.id.et_password);
        findViewById(R.id.btn_login).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        String name = et_id.getText().toString();
        String password = et_password.getText().toString();

        if (name.length() < 5 || password.length()<8){
            Toast.makeText(getApplicationContext(), "사용자 이름과 비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(MainActivity.this, mypageActivity.class);
            Toast.makeText(this, name + "님 안녕", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
    }
}