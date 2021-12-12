package com.noval.duniaremaja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var manager = GridLayoutManager(this,2)
        recycler_view.layoutManager=manager
        recycler_view.adapter=Adapter(getData())
    }

    private fun getData():ArrayList<DataModel> {
        var list = ArrayList<DataModel>()

        var model = DataModel("Bisu dan Pink", "stawberryalice", R.drawable.gambar1)
        list.add(model)
        var model1 = DataModel("Gustira", "Kata Kokoh", R.drawable.gambar2)
        list.add(model1)
        var model2 = DataModel("Kambing dan Hujan", "Mahfud Ikhwan", R.drawable.gambar3)
        list.add(model2)
        var model3 = DataModel("Mahasiswa Koplak", "Wisnu Maulana", R.drawable.gambar4)
        list.add(model3)
        var model4 = DataModel("Negeri 5 Menara", "a.fuadi", R.drawable.gambar5)
        list.add(model4)
        var model5 = DataModel("Perahu Kertas", "Dee Lestari", R.drawable.gambar6)
        list.add(model5)
        var model6 = DataModel("Pergi", "Tere Liye", R.drawable.gambar7)
        list.add(model6)
        var model7 =
            DataModel("Samudra Alaska dan Aurora", "Anandaeka", R.drawable.gambar8)
        list.add(model7)
        var model8 = DataModel("Satu Kata Jatuh Cinta", "AIU AHRA", R.drawable.gambar9)
        list.add(model8)
        var model9 = DataModel("Sebatas Mimpi", "Hujan Mimpi", R.drawable.gambar10)
        list.add(model9)
        return list
    }
}