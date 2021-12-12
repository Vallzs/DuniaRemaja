package com.noval.duniaremaja

import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {
    lateinit var listNovel: ArrayList<Home>

    private fun getData(): ArrayList<Home> {
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