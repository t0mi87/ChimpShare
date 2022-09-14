package com.tbeszteri.myapplication.chimpList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tbeszteri.myapplication.R
import com.tbeszteri.myapplication.models.Chimp

class ChimpViewHolder(view: View) : RecyclerView.ViewHolder(view){
    private val chimpName : TextView = view.findViewById(R.id.tvchimp_name_list_item)
    private val chimpInitExp : TextView = view.findViewById(R.id.tvchimp_balance_list_item)
    private val chimpTransaction : TextView = view.findViewById(R.id.tvchimp_transaction_list_item)
    fun bind (chimp : Chimp){
        chimpName.text = chimp.name
        chimpInitExp.text = chimp.initialExpands.toString()
        chimpTransaction.text = chimp.transaction.toString()
    }
}
val diffCallback = object : DiffUtil.ItemCallback<Chimp>(){
    override fun areItemsTheSame(oldItem: Chimp, newItem: Chimp): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: Chimp, newItem: Chimp): Boolean {
        return oldItem == newItem
    }


}

class ChimpsAdaptor : ListAdapter<Chimp, ChimpViewHolder>(diffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChimpViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chimp_list_item, parent, false)
        return ChimpViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChimpViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
