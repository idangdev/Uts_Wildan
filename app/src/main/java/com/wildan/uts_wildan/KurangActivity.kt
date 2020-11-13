package com.wildan.uts_wildan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.wildan.uts_wildan.databinding.ActivityKurangBinding
import com.wildan.uts_wildan.databinding.ActivityTambahBinding

class KurangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_kurang)
        val binding: ActivityKurangBinding = DataBindingUtil.setContentView(this, R.layout.activity_kurang)

        binding.btnHitung.setOnClickListener{
            if (binding.angka1.text.toString() == null || binding.angka1.text.toString() == null ||
                binding.angka2.text.toString().trim() == "" || binding.angka2.text.toString().trim() == ""){

                Toast.makeText(this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show()
            }
            else {
                val n1 = binding.angka1.text.toString().trim().toInt()
                val n2 = binding.angka2.text.toString().trim().toInt()

                val value = n1 - n2
                binding.tvHasil.setText(value.toString())
            }
        }

        binding.imgBack.setOnClickListener {
            finish()
        }
    }
}