package com.example.myrecyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerviewapp.models.Coffee

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: CoffeeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        var list = mutableListOf<Coffee>()

        // img1
        list.add(
            Coffee(
                R.drawable.img1,
                "Coffee Glow",
                "Neon Coffee Vibes"
            )
        )

        // img2
        list.add(
            Coffee(
                R.drawable.img2,
                "Love Brew",
                "Heartbeat Coffee"
            )
        )

        // img3
        list.add(
            Coffee(
                R.drawable.img3,
                "Dark Roast",
                "Premium Coffee Beans"
            )
        )

        // img4
        list.add(
            Coffee(
                R.drawable.img4,
                "Coffee Art",
                "Latte Aesthetic"
            )
        )

        // img5
        list.add(
            Coffee(
                R.drawable.img5,
                "Bean Heaven",
                "Fresh Roasted Coffee Beans"
            )
        )

        // img6
        list.add(
            Coffee(
                R.drawable.img6,
                "Creamy Brew",
                "Warm Milk Coffee"
            )
        )

        // img7
        list.add(
            Coffee(
                R.drawable.img7,
                "Love Latte",
                "Coffee Made With Love"
            )
        )

        // img8
        list.add(
            Coffee(
                R.drawable.img8,
                "Mocha Delight",
                "Chocolate Coffee Aroma"
            )
        )

        adapter = CoffeeAdapter(list)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}