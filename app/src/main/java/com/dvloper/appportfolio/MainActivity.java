package com.dvloper.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void showToast(View view){
        Button b = (Button)view;
        String buttontext = b.getText().toString();
        toast.makeText(this,"This button will launch "+buttontext+" Project",Toast.LENGTH_SHORT).show();


    }
}
