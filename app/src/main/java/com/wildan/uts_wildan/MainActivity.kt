package com.wildan.uts_wildan

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.wildan.uts_wildan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnClc.setOnClickListener{
            startActivity(Intent(this, ClcHomeActivity::class.java))
        }

        binding.btnLogout.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Konfirmasi")
                .setMessage("Apakah anda ingin logout?")
                .setPositiveButton("Ya", DialogInterface.OnClickListener{ dialogInterface, i ->
                    Toast.makeText(this,"Terimakasih", Toast.LENGTH_SHORT)
                    finish()
                })
                .setNegativeButton("Batal", DialogInterface.OnClickListener{ dialogInterface, i ->

                }).show()
        }

        binding.btnAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        binding.btnBerita.setOnClickListener {
            startActivity(Intent(this, BeritaActivity::class.java))
        }
    }

    override fun onBackPressed() {
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