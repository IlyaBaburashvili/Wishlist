package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import layout.WishList

class MainActivity : AppCompatActivity() {
    var listofItems = ArrayList<WishList>();
    lateinit var recyclerView: RecyclerView;
    lateinit var wish_list_adapter: WishListAdapter;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.enterItem);
        button.setOnClickListener {
            val name = findViewById<EditText>(R.id.itemName);
            val price = findViewById<EditText>(R.id.itemPrice);
            val link = findViewById<EditText>(R.id.itemLink);
            listofItems.add(WishList(name.toString(),price.toString().toDouble(), link.toString() ) )
            wish_list_adapter.notifyDataSetChanged();
        }
    }
}
