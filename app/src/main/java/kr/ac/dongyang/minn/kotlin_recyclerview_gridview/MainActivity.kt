package kr.ac.dongyang.minn.kotlin_recyclerview_gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kr.ac.dongyang.minn.kotlin_recyclerview_gridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val data:MutableList<Memo> = loadData()
        var adapter = CustomAdapter()
        adapter.listData = data
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = GridLayoutManager(this, 3)
    }

    fun loadData():MutableList<Memo>{
        var arrImgRes = arrayOf(R.drawable.img0, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9,
            R.drawable.img0, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9,
            R.drawable.img0, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9,
            R.drawable.img0, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9,
            R.drawable.img0, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9
            )
        val data:MutableList<Memo> = mutableListOf()
        for(i in 0..49){
            var memo = Memo(arrImgRes[i])
            data.add(memo)
        }
        return  data
    }
}