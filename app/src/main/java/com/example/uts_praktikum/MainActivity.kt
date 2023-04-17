package com.example.uts_praktikum

import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.Toolbar
import android.view.MenuItem
import com.google.android.material.floatingactionbutton.FloatingActionButton






class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: ClsAdapter
    lateinit var listData: ArrayList<Datakamar>

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_list -> {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        recycle = findViewById(R.id.idrecycle)
        listData = ArrayList()

        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recycleAdapter = ClsAdapter(listData, this)

        recycle.adapter = recycleAdapter
        listData.add(Datakamar("Kamar 1", "Penghuni: 2", "Keterangan: Ada", "Perbulan: 500.000", "Persemester: 3 jt", R.drawable.kamar1))
        listData.add(Datakamar("Kamar 2", "Penghuni: 2", "Keterangan: Ada", "Perbulan: 500.000", "Persemester: 3 jt", R.drawable.kamar2))
        listData.add(Datakamar("Kamar 3", "Penghuni: 2", "Keterangan: Ada", "Perbulan: 500.000", "Persemester: 3 jt", R.drawable.kamar3))
        listData.add(Datakamar("Kamar 4", "Penghuni: 2", "Keterangan: Ada", "Perbulan: 500.000", "Persemester: 3 jt", R.drawable.kamar4))
        listData.add(Datakamar("Kamar 5", "Penghuni: 2", "Keterangan: Ada", "Perbulan: 500.000", "Persemester: 3 jt", R.drawable.kamar5))
        listData.add(Datakamar("Kamar 6", "Penghuni: 2", "Keterangan: Ada", "Perbulan: 500.000", "Persemester: 3 jt", R.drawable.kamar6))
        listData.add(Datakamar("Kamar 7", "Penghuni: 2", "Keterangan: Ada", "Perbulan: 500.000", "Persemester: 3 jt", R.drawable.kamar7))
        listData.add(Datakamar("Kamar 8", "Penghuni: 2", "Keterangan: Ada", "Perbulan: 500.000", "Persemester: 3 jt", R.drawable.kamar8))
        listData.add(Datakamar("Kamar 9", "Penghuni: 2", "Keterangan: Ada", "Perbulan: 500.000", "Persemester: 3 jt", R.drawable.kamar9))
        listData.add(Datakamar("Kamar 10","Penghuni: 2", "Keterangan: Ada", "Perbulan: 500.000", "Persemester: 3 jt", R.drawable.kamar10))
        listData.add(Datakamar("Kamar 11", "Penghuni: 1", "Keterangan: Kosong", "Perbulan: 800.000", "Persemester: 6 jt", R.drawable.kamar11))
        listData.add(Datakamar("Kamar 12", "Penghuni: 1", "Keterangan: Kosong", "Perbulan: 800.000", "Persemester: 6 jt", R.drawable.kamar12))
        listData.add(Datakamar("Kamar 13", "Penghuni: 1", "Keterangan: Ada", "Perbulan: 800.000", "Persemester: 6 jt", R.drawable.kamar13))
        listData.add(Datakamar("Kamar 14", "Penghuni: 1", "Keterangan: Kosong", "Perbulan: 800.000", "Persemesterr: 6 jt", R.drawable.kamar14))
        listData.add(Datakamar("Kamar 15", "Penghuni: 1", "Keterangan: Ada", "Perbulan: 800.000", "Persemester: 6 jt", R.drawable.kamar15))
        listData.add(Datakamar("Kamar 16", "Penghuni: 1", "Keterangan: Ada", "Perbulan: 800.000", "Persemester: 6 jt", R.drawable.kamar16))
        listData.add(Datakamar("Kamar 17", "Penghuni: 1", "Keterangan: Kosong", "Perbulan: 800.000", "Persemester: 6 jt", R.drawable.kamar17))
        listData.add(Datakamar("Kamar 18", "Penghuni: 1", "Keterangan: Ada", "Perbulan: 800.000", "Persemester: 6 jt", R.drawable.kamar18))
        listData.add(Datakamar("Kamar 19", "Penghuni: 1", "Keterangan: Kosong", "Perbulan: 800.000", "Persemester: 6 jt", R.drawable.kamar19))
        listData.add(Datakamar("Kamar 20", "Penghuni: 1", "Keterangan: Kosong", "Perbulan: 800.000", "Persemester: 6 jt", R.drawable.kamar20))
    }
}
