package uz.farxod.intentcars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import uz.farxod.intentcars.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.i8.setOnClickListener(v->{
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });
        binding.m3.setOnClickListener(v->{
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        });
    }

}