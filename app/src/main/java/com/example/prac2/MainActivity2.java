package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prac2.databinding.ActivityMain2Binding;
import com.example.prac2.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());

        Bundle arguments = getIntent().getExtras();
        binding.text1.setText("Имя: " + arguments.get("name").toString());
        binding.text2.setText("Группа: " + arguments.get("group").toString());
        binding.text3.setText("Возраст: " + arguments.get("age").toString());
        binding.text2.setText("Оценка: " + arguments.get("mark").toString());
        setContentView(binding.getRoot());
    }
}