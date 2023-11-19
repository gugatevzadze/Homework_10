package com.example.homework_10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_10.databinding.PageItemBinding

class PagesAdapter(private var pagesList: List<Pages>):
    RecyclerView.Adapter<PagesAdapter.PagesViewHolder>() {

    inner class PagesViewHolder(val binding: PageItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagesViewHolder {
        return PagesViewHolder(PageItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return pagesList.size
    }

    override fun onBindViewHolder(holder: PagesViewHolder, position: Int) {
        val page = pagesList[position]

        holder.binding.icon.setImageResource(page.icon)
        holder.binding.pageName.text = page.name

        page.additionalText?.let { holder.binding.additionalText.text = it }
        page.arrow?.let { holder.binding.iconArrow.setImageResource(it) }

        holder.binding.switchIcon.visibility = if (page.switchVisibility) View.VISIBLE else View.GONE
        holder.binding.iconArrow.visibility = if (page.arrow != null) View.VISIBLE else View.GONE

    }
}