package com.example.click

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.click.Adapter.IconAdapter
import com.example.click.Adapter.ViewPagerAdapter
import com.example.click.Fragments.FirstFragment
import com.example.click.Modul.Icon

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        viewPager()
    }
    fun initViews(){
        recyclerView = findViewById(R.id.recyclerview)
        var manager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.setLayoutManager(manager)

        refreshAdapter(getIcons())
    }
    fun refreshAdapter(icon: ArrayList<Icon>){
        val adapter = IconAdapter(this,icon)
        recyclerView.adapter = adapter
    }
    fun getIcons() : ArrayList<Icon>{
        var icon : ArrayList<Icon> = ArrayList()

        icon.add(Icon(R.drawable.ic_wallet,"На QIWI Кошелек"))
        icon.add(Icon(R.drawable.ic_bank,"Перевод по никнейму..."))
        icon.add(Icon(R.drawable.ic_fun,"Переводы на карту"))
        icon.add(Icon(R.drawable.ic_card,"Мобильная связь"))
        icon.add(Icon(R.drawable.ic_iphone,"Перевод по никнейму"))
        icon.add(Icon(R.drawable.ic_wallet,"На QIWI Кошелек"))
        icon.add(Icon(R.drawable.ic_bank,"Переводы на карту"))
        icon.add(Icon(R.drawable.ic_fun,"Мобильная связь"))
        icon.add(Icon(R.drawable.ic_iphone,"На QIWI Кошелек"))
        icon.add(Icon(R.drawable.ic_wallet,"Перевод по никнейму"))
        icon.add(Icon(R.drawable.ic_bank,"Мобильная связь"))

        return icon
    }

    fun viewPager(){
        viewPager = findViewById(R.id.viewpager)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        viewPagerAdapter.add(FirstFragment())
        viewPagerAdapter.add(FirstFragment())
        viewPagerAdapter.add(FirstFragment())
        viewPagerAdapter.add(FirstFragment())

        viewPager.adapter = viewPagerAdapter
        viewPager.currentItem = 1
        viewPager.setPadding(60,0,60,0)
    }
}