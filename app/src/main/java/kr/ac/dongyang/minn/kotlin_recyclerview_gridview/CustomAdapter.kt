package kr.ac.dongyang.minn.kotlin_recyclerview_gridview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kr.ac.dongyang.minn.kotlin_recyclerview_gridview.databinding.ItemGridBinding
import java.text.SimpleDateFormat

class CustomAdapter: RecyclerView.Adapter<Holder>() {//End CustomAdapter  class
var listData = mutableListOf<Memo>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemGridBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return  Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val memo = listData.get(position)
        holder.setMemo(memo)
    }

    override fun getItemCount(): Int {
        return listData.size
    }


}

class Holder(val binding: ItemGridBinding): RecyclerView.ViewHolder(binding.root){
//    init {
//        binding.root.setOnClickListener {
//            Toast.makeText(binding.root.context, "클릭된 아이템은 ${binding.textTitle.text}", Toast.LENGTH_SHORT).show()
//        }
//    }
    fun setMemo(memo: Memo) {
        binding.imgitem.setImageResource(memo.imgRes)
    }

}