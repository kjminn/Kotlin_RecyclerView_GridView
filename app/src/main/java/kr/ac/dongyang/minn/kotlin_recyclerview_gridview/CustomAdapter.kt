package kr.ac.dongyang.minn.kotlin_recyclerview_gridview

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent
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

    init {

    }

    fun setMemo(memo: Memo) {
        binding.imgitem.setImageResource(memo.imgRes)
        binding.root.setOnClickListener {
            val dlg = AlertDialog.Builder(binding.root.context)
            val view = LayoutInflater.from(binding.root.context).inflate(R.layout.dialog, null)
            val dlgImgv = view.findViewById<ImageView>(R.id.dialog_imgv)
            dlgImgv.setImageResource(memo.imgRes)
            dlg.setView(view)
            dlg.setNegativeButton("닫기", null)
            dlg.show()
        }
    }

}