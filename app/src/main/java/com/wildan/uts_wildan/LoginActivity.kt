package com.wildan.uts_wildan

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.wildan.uts_wildan.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.btnKeluar.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Konfirmasi")
                .setMessage("Apakah anda ingin keluar?")
                .setPositiveButton("Ya", DialogInterface.OnClickListener{ dialogInterface, i ->
                    Toast.makeText(this,"Terimakasih", Toast.LENGTH_SHORT)
                    finish()
                })
                .setNegativeButton("Batal", DialogInterface.OnClickListener{ dialogInterface, i ->

                }).show()
        }

    }
}