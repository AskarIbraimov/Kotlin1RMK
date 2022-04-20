package com.example.kotlin1rmk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin1rmk.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etText.setText(intent.getStringExtra(MainActivity.KEY))
        binding.btnStart.setOnClickListener {
            if (binding.etText.text.isNotEmpty()){
                setResult(RESULT_OK, Intent().putExtra(MainActivity.KEY2,binding.etText.text.toString()))
                finish()
            } else{
                Toast.makeText(this,getString(R.string.empty), Toast.LENGTH_SHORT).show()
            }
        }
    }
}