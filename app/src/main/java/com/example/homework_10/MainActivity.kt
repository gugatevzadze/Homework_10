package com.example.homework_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework_10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var pagesAdapter: PagesAdapter

    private val pageList = listOf<Pages>(
        Pages(R.drawable.profile,"Edit Profile", null, false,R.drawable.arrow),
        Pages(R.drawable.address,"Address",null,false,R.drawable.arrow),
        Pages(R.drawable.notif,"Notification",null,false,R.drawable.arrow),
        Pages(R.drawable.wallet,"Payment",null,false,R.drawable.arrow),
        Pages(R.drawable.shield,"Security",null,false,R.drawable.arrow),
        Pages(R.drawable.languages,"Language","English(US)",false,R.drawable.arrow),
        Pages(R.drawable.darkmode,"Dark Mode",null,true,null),
        Pages(R.drawable.lock,"Privacy Policy",null,false,R.drawable.arrow),
        Pages(R.drawable.info,"Help Center",null,false,R.drawable.arrow),
        Pages(R.drawable.users,"Invite Friends",null,false,R.drawable.arrow),
        Pages(R.drawable.logout,"Logout",null,false,null),


    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pagesAdapter = PagesAdapter(pageList)
        binding.rvContainer.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContainer.adapter = pagesAdapter
    }
}