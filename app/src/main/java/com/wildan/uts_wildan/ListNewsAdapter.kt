package com.wildan.uts_wildan

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListNewsAdapter(private val listNews: ArrayList<News>): RecyclerView.Adapter<ListNewsAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_news, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listNews.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listNews[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = food.name
        holder.tvDetail.text = food.detail

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener({
            val moveDetail = Intent(mContext, detail_news::class.java)
            moveDetail.putExtra(detail_news.EXTRA_NAME, food.name)
            moveDetail.putExtra(detail_news.EXTRA_PHOTO, food.photo)
            moveDetail.putExtra(detail_news.EXTRA_DETAIL, food.detail)
            mContext.startActivity(moveDetail)

        })
    }

}