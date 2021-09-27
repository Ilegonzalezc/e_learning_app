package igc.home.copystepik.ui.software

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import igc.home.copystepik.MyAdapter
import igc.home.copystepik.data.Publicacion
import igc.home.copystepik.R
import java.util.ArrayList

abstract class SoftwareFragment : Fragment() {

    private var softwareViewModel: SoftwareViewModel? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        softwareViewModel = ViewModelProviders.of(this).get(SoftwareViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sorftware, container, false)

        val recyclerView:RecyclerView = root.findViewById(R.id.recyclerview) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)



        val publicaciones = ArrayList<Publicacion>()
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))
        publicaciones.add(Publicacion("Photoshop", "100 courses", "R.drawable.figma_circle"))

        
        val adapter = MyAdapter(publicaciones)
        recyclerView.adapter = adapter

        return root
    }
}


//val courseimage: Int, val tickicon:Int