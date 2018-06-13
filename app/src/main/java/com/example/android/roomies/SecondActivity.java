package com.example.android.roomies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    TextView signUp;
    private static final int REQUEST_SIGNUP = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        signUp=(TextView)findViewById(R.id.link_signup);

        signUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SignUp.class);
                startActivityForResult(intent, REQUEST_SIGNUP);
                finish();

            }
        });
    }


}
