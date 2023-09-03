package com.example.cocukeglence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.cocukeglence.databinding.ActivityIcerikBinding

class IcerikActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIcerikBinding
    private lateinit var icerikListe:ArrayList<Icerikler>
    private lateinit var adapter: IceriklerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIcerikBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val kategori = intent.getSerializableExtra("kategoriNesne") as Kategoriler

        binding.toolbarIcerikler.title = " ${kategori.kategori_ad}"
        setSupportActionBar(binding.toolbarIcerikler)

        binding.iceriklerRv.setHasFixedSize(true)
        binding.iceriklerRv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        icerikListe = ArrayList()

        val k = Kategoriler(1,"Masal")
        val y = IcerikDetay(1,"KelOğlan")

        val c1 = Icerikler(1,"Prens","Prens","prens",k,y)
        val c2 = Icerikler(2,"Masalevi","masalevi","masalevi",k,y)
        val c3 = Icerikler(3,"Pinokyo","pinokyo","pinokyo",k,y)
        val c4 = Icerikler(4,"Rapunzel","rapunzel","rapunzel",k,y)
        val c5 = Icerikler(6,"Uzgunordek","uzgunordek","uzgunordek",k,y)

        icerikListe.add(c1)
        icerikListe.add(c2)
        icerikListe.add(c3)
        icerikListe.add(c4)
        icerikListe.add(c5)

        adapter = IceriklerAdapter(this,icerikListe)

        binding.iceriklerRv.adapter = adapter





    }
}