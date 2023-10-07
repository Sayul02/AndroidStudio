package com.example.listalumnos

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listalumnos.databinding.ActivityMainNuevoBinding

class MainActivityNuevo : AppCompatActivity() {

    private lateinit var binding: ActivityMainNuevoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainNuevoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGuardar.setOnClickListener {
            val txtNombre = binding.txtNombre.text.toString()
            val txtCuenta = binding.txtCuenta.text.toString()
            val txtCorreo = binding.txtCorreo.text.toString()
            val txtImg = binding.txtImage.text.toString()

            val intento2 = Intent()
            intento2.putExtra("mensaje", "nuevo")
            intento2.putExtra("nombre", txtNombre)
            intento2.putExtra("cuenta", txtCuenta)
            intento2.putExtra("correo", txtCorreo)
            intento2.putExtra("image", txtImg)

            setResult(Activity.RESULT_OK, intento2)
            finish()
        }
    }
}
