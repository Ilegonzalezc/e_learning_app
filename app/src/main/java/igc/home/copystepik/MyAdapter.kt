package igc.home.copystepik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import igc.home.copystepik.data.Publicacion


class MyAdapter (val publicacionList: ArrayList<Publicacion>): RecyclerView.Adapter<MyAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(publicacionList[position])
    }

    override fun getItemCount(): Int {

        return publicacionList.size

    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(publicacion: Publicacion){

            val coursename = itemView.findViewById(R.id.tw1) as TextView
            val courseduration = itemView.findViewById(R.id.tw2) as TextView
            val courseimage = itemView.findViewById(R.id.photo_course) as ImageView
            val tickicon = itemView.findViewById(R.id.tick) as ImageView


            coursename.text = publicacion.coursename.toString()
            courseduration.text = publicacion. courseduration.toString()
            //courseimage.int = publicacion.courseimage.toString()
            //tickicon.text = publicacion.tickicon.toString()

        }
    }

}






