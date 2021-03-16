package com.example.lab02_basicloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
/*
@author Arzu Dabaniyasti
@since 15 03 2021
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("On Create Works!!!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView textView=(TextView)findViewById(R.id.textView3);
        textView.setVisibility(View.INVISIBLE);
        System.out.println("On Start Works!!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("On Resume Works!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("On Pause Works!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("On Stop Works!!!");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("On Destroy Works!!!");
    }
    public void login(View view){
        EditText editText1=(EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText editText2=(EditText) findViewById(R.id.editTextTextPassword);
        check(editText1.getText().toString(),editText2.getText().toString());
    }
    private void check(String userEmail,String userPassword){
        if((userEmail.equals("20180808032@ogr.akdeniz.edu.tr")) && (userPassword.equals("1234"))){
            Intent intent=new Intent(this,SecondActivity.class);
            startActivity(intent);
        }
        else{
            TextView textView=(TextView)findViewById(R.id.textView3);
            textView.setVisibility(View.VISIBLE);
        }
    }

}