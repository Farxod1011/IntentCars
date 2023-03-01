package uz.farxod.intentcars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import uz.farxod.intentcars.databinding.ActivityMain2Binding;
import uz.farxod.intentcars.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rasim1.setOnClickListener(v->{
            binding.asosiyRasim.setImageResource(R.drawable.i8);
        });
        binding.rasim2.setOnClickListener(v->{
            binding.asosiyRasim.setImageResource(R.drawable.i8_1);
        });
        binding.rasim3.setOnClickListener(v->{
            binding.asosiyRasim.setImageResource(R.drawable.i8_2);
        });
        binding.rasim4.setOnClickListener(v->{
            binding.asosiyRasim.setImageResource(R.drawable.i8_3);
        });
    }
}