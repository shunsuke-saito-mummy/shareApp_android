package com.example.shunsukesaito.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import static android.R.id.content;

public class NoDinnerActivity extends AppCompatActivity
            implements View.OnClickListener,View.OnLongClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_dinner);
        Button btnSend = (Button) this.findViewById(R.id.send);
        btnSend.setOnClickListener(this);
        btnSend.setOnLongClickListener(this);
    }
    @Override
    public void onClick(View v){
        EditText edit01 = (EditText) findViewById(R.id.editText);
        String title = edit01.getText().toString();
        Resources res = getResources();
    }
}