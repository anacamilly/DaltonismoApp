package com.example.daltonismo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.daltonismo.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding
    lateinit var escolha: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)

        escolha = intent.extras?.getString("escolha").toString()

        val imagem = intent.extras?.getInt("imagem")
        binding.image.setImageResource(imagem!!)
        Log.i("imagem", "$imagem")

        binding.buttonOk.setOnClickListener{
            val b = Bundle()

            b.putString("RESULTADO", binding.editTextValor.text.toString())
            intent.putExtras(b)
            setResult(RESULT_OK, intent)
            finish()
        }

        binding.buttonCancelar.setOnClickListener {
            setResult(RESULT_CANCELED)
            finish()
        }
    }
}