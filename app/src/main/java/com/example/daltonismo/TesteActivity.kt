package com.example.daltonismo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daltonismo.databinding.ActivityMain2Binding
import com.example.daltonismo.databinding.ActivityTesteBinding

class TesteActivity : AppCompatActivity() {

    lateinit var binding: ActivityTesteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste)

    }
}