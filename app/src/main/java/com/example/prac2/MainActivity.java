package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prac2.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "loggg";
    //важная штука
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //важная штука
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        Log.i(TAG, "onCreate");

        binding.button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Кнопка нажата", Toast.LENGTH_SHORT).show();
                onNextActivity(v);
            }
        });

        //важная штука
        setContentView(binding.getRoot());
    }

    public void onNextActivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtra("name",  binding.editText1.getText().toString());
        intent.putExtra("group",  binding.editText2.getText().toString());
        intent.putExtra("age",  binding.editText3.getText().toString());
        intent.putExtra("mark",  binding.editText4.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }
}