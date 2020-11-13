package com.wildan.uts_wildan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BeritaActivity : AppCompatActivity() {

    private lateinit var rvNews: RecyclerView
    private var list: ArrayList<News> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)


            rvNews = findViewById(R.id.rv_news)
            rvNews.setHasFixedSize(true)

            list.addAll(NewsData.listData)
            showRecyclerList()
        }

        private fun showRecyclerList(){
            rvNews.layoutManager = LinearLayoutManager(this)
            val listFoodAdapter = ListNewsAdapter(list)
            rvNews.adapter = listFoodAdapter
        }

}