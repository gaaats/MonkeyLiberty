package com.fungames.battletank.ottther

import androidx.recyclerview.widget.DiffUtil
import com.fungames.battletank.adapteeeer.OIJJjjjji

class DiffUtilItem : DiffUtil.ItemCallback<OIJJjjjji>() {
    override fun areItemsTheSame(oldItem: OIJJjjjji, newItem: OIJJjjjji): Boolean {
        return oldItem.edfrtgt == newItem.edfrtgt
    }

    override fun areContentsTheSame(oldItem: OIJJjjjji, newItem: OIJJjjjji): Boolean {
        return oldItem == newItem
    }
}