import android.content.Context
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.melodify.databinding.MusicItemBinding
import com.example.melodify.R
import com.example.melodify.playlist.Music
import com.squareup.picasso.Picasso

class PlayListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    // Binding de la vista usando View Binding
    val binding = MusicItemBinding.bind(view)

    fun bind(musicModel: Music, onClickListener: (Music) -> Unit) {
        binding.tvSong.text = musicModel.song
        binding.tvSinger.text = musicModel.singer

        // Cargar imagen con Glide desde drawable
        Glide.with(itemView.context)
            .load(musicModel.img) // Aquí musicModel.img es el ID del recurso en drawable
            .apply(RequestOptions().error(R.drawable.img1))
            .diskCacheStrategy(DiskCacheStrategy.ALL) // Opcional, dependiendo de tus necesidades de caché
            .into(binding.ivMusic)
        Log.d("sofia",musicModel.img.toString())

        // Configuración del clic en el ítem de la lista
        itemView.setOnClickListener {
            onClickListener(musicModel)
            // Abre una nueva actividad aquí
            /* val intent = Intent(context, DetalleActivity::class.java).apply {
                 // Puedes pasar datos extras si es necesario
                 // putExtra("musicId", musicModel.id)
             }
             context.startActivity(intent)*/
        }
    }
}
