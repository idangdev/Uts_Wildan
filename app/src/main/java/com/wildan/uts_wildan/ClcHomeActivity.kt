package com.wildan.uts_wildan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.wildan.uts_wildan.databinding.ActivityClcHomeBinding

class ClcHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_clc_home)

        val binding: ActivityClcHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_clc_home)

        binding.btnTambah.setOnClickListener {
            startActivity(Intent(this, TambahActivity::class.java))
        }
        binding.btnKurang.setOnClickListener {
            startActivity(Intent(this, KurangActivity::class.java))
        }
        binding.btnKali.setOnClickListener {
            startActivity(Intent(this, PerkalianActivity::class.java))
        }
        binding.btnBagi.setOnClickListener {
            startActivity(Intent(this, BagiActivity::class.java))
        }
        binding.imgBack.setOnClickListener {
            finish()
        }

    }
}