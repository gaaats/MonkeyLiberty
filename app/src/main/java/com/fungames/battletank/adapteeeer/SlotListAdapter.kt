package com.fungames.battletank.adapteeeer


import androidx.recyclerview.widget.RecyclerView
import com.fungames.battletank.ottther.DiffUtilItem
import com.fungames.battletank.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.fungames.battletank.databinding.SingleSlotElementBinding

class SlotListAdapter :
    ListAdapter<OIJJjjjji, SlotListAdapter.SlotListVievHolder>(DiffUtilItem()) {


    class SlotListVievHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ogtigtijtgjgtjjtgjigtjitg = SingleSlotElementBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlotListVievHolder {
        LayoutInflater.from(parent.context)
            .inflate(R.layout.single_slot_element, parent, false).also {
                return SlotListVievHolder(it)
            }
    }

    override fun onBindViewHolder(holder: SlotListVievHolder, position: Int) {
        val rgyhyyhyh = getItem(position)
        holder.ogtigtijtgjgtjjtgjigtjitg.imgOnSingleItem.setImageResource(rgyhyyhyh.imagedfrgt)
    }
}

