package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import layout.WishList

class WishListAdapter (private val mWishList: List<WishList>) : RecyclerView.Adapter<WishListAdapter.ViewHolder>()
{
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val mName = itemView.findViewById<TextView>(R.id.itemName)
        val mPrice = itemView.findViewById<TextView>(R.id.itemPrice)
        val mLink = itemView.findViewById<TextView>(R.id.itemLink)
        val mSubmit = itemView.findViewById<Button>(R.id.enterItem)
    }

    // ... constructor and member variables
    // Usually involves inflating a layout from XML and returning the holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishListAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.item_wishlist, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    // Involves populating data into the item through holder
    override fun onBindViewHolder(viewHolder: WishListAdapter.ViewHolder, position: Int) {
        val current_item = mWishList.get(position);
        viewHolder.mName.text = current_item.mItemName;
        viewHolder.mPrice.text = current_item.mItemPrice.toString();
        viewHolder.mLink.text = current_item.mItemLink;

    }

    // Returns the total count of items in the list
    override fun getItemCount(): Int {
        return mWishList.size
    }
}