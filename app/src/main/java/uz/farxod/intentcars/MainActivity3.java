package uz.farxod.intentcars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import uz.farxod.intentcars.databinding.ActivityMain2Binding;
import uz.farxod.intentcars.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rasimM1.setOnClickListener(v->{
            binding.asosiyRasim.setImageResource(R.drawable.m3);
        });
        binding.rasimM2.setOnClickListener(v->{
            binding.asosiyRasim.setImageResource(R.drawable.m3_1);
        });
        binding.rasimM3.setOnClickListener(v->{
            binding.asosiyRasim.setImageResource(R.drawable.m3_2);
        });
        binding.rasimM4.setOnClickListener(v->{
            binding.asosiyRasim.setImageResource(R.drawable.m3_3);
        });
    }
}