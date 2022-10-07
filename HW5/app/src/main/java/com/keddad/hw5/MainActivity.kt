package com.keddad.hw5

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lookup the recyclerview in activity layout
        // Lookup the recyclerview in activity layout
        val rvIps = findViewById<View>(R.id.rvIps) as RecyclerView

        // Initialize contacts

        // Initialize contacts
        val IPs: List<IpInfo> = listOf(
            IpInfo("127.0.0.1", true), IpInfo("127.0.0.2", false),
            IpInfo("127.0.0.1", true), IpInfo("127.0.0.2", false),
            IpInfo("127.0.0.1", true), IpInfo("127.0.0.2", false),
            IpInfo("127.0.0.1", true), IpInfo("127.0.0.2", false),
            IpInfo("127.0.0.1", true), IpInfo("127.0.0.2", false),
            IpInfo("127.0.0.1", true), IpInfo("127.0.0.2", false),
            IpInfo("127.0.0.1", true), IpInfo("127.0.0.2", false),
            IpInfo("127.0.0.1", true), IpInfo("127.0.0.2", false)
        )
        // Create adapter passing in the sample user data
        // Create adapter passing in the sample user data
        val adapter = IpInfoAdapter(IPs)
        // Attach the adapter to the recyclerview to populate items
        // Attach the adapter to the recyclerview to populate items
        rvIps.adapter = adapter
        // Set layout manager to position the items
        // Set layout manager to position the items
        rvIps.layoutManager = LinearLayoutManager(this)
        // That's all!
    }
}