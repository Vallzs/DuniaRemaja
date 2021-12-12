package com.noval.duniaremaja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val menuTeks = arrayOf("Beranda","Kategori")
    val menuIcon = arrayOf(R.drawable.ic__16242_home_icon, R.drawable.ic__26591_add_circle_icon)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var manager = GridLayoutManager(this,2)
        recycler_view.layoutManager=manager
        recycler_view.adapter=HomeAdapter(getData())

        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter);
        TabLayoutMediator(tab_layout, view_pager,
            TabLayoutMediator.TabConfigurationStrategy{ tab, position ->
                tab.text=menuTeks[position]
                tab.icon= ResourcesCompat.getDrawable(resources, menuIcon[position], null)
            }).attach()
    }

    private fun getData():ArrayList<Home> {
        var list = ArrayList<Home>()

        var model = Home("Bisu dan Pink", "stawberryalice", R.drawable.gambar1)
        list.add(model)
        var model1 = Home("Gustira", "Kata Kokoh", R.drawable.gambar2)
        list.add(model1)
        var model2 = Home("Kambing dan Hujan", "Mahfud Ikhwan", R.drawable.gambar3)
        list.add(model2)
        var model3 = Home("Mahasiswa Koplak", "Wisnu Maulana", R.drawable.gambar4)
        list.add(model3)
        var model4 = Home("Negeri 5 Menara", "a.fuadi", R.drawable.gambar5)
        list.add(model4)
        var model5 = Home("Perahu Kertas", "Dee Lestari", R.drawable.gambar6)
        list.add(model5)
        var model6 = Home("Pergi", "Tere Liye", R.drawable.gambar7)
        list.add(model6)
        var model7 = Home("Samudra Alaska dan Aurora", "Anandaeka", R.drawable.gambar8)
        list.add(model7)
        var model8 = Home("Satu Kata Jatuh Cinta", "AIU AHRA", R.drawable.gambar9)
        list.add(model8)
        var model9 = Home("Sebatas Mimpi", "Hujan Mimpi", R.drawable.gambar10)
        list.add(model9)
        return list
    }
}