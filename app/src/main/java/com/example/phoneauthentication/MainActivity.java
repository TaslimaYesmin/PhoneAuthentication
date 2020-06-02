package com.example.phoneauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText mobileNumberEt;
private Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobileNumber = mobileNumberEt.getText().toString();
                if (mobileNumber.length()!=11){
                    mobileNumberEt.setError("please enter your valid mobile number");
                    mobileNumberEt.requestFocus();
                 }else {
                    startActivity(new Intent(MainActivity.this,VerifyActivity.class).putExtra("mobileNumber",mobileNumber));
                }
            }
        });
    }

    private void init() {
        mobileNumberEt=findViewById(R.id.mobileNumberId);
        nextBtn=findViewById(R.id.nextBtnId);
    }
}
