package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MemberAdapter(private val context: Context, private val member: List<Member>, val listener: (Member) -> Unit)
    : RecyclerView.Adapter<MemberAdapter.MemberViewFolder>() {

    class MemberViewFolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgMember = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameMember = view.findViewById<TextView>(R.id.tv_item_name)
        val nimMember = view.findViewById<TextView>(R.id.tv_item_description)
        val hobbyMember = view.findViewById<TextView>(R.id.tv_hobby)

        fun bindView(member: Member, listener: (Member) -> Unit) {
            imgMember.setImageResource(member.imgMember)
            nameMember.text = member.nameMember
            nimMember.text = member.nimMember
            hobbyMember.text = member.hobbyMember
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewFolder {
        return MemberViewFolder(
            LayoutInflater.from(context).inflate(R.layout.item_member, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MemberViewFolder, position: Int) {
        holder.bindView(member[position], listener)
    }

    override fun getItemCount(): Int = member.size

}
