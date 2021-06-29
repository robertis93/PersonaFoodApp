import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.personafoodapp.R


class AdapterRecyclerView(private val listViewType: List<Int>) :
    RecyclerView.Adapter<AdapterRecyclerView.ViewHolder>() {

    companion object {
        val ITEM_ACCESS_FREE = 1
        val ITEM_MYCARD = 2
        val ITEM_SALES = 3
        val ITEM_STATISTIC = 4
        val MY_TRENING = 5
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            ITEM_ACCESS_FREE -> ViewHolderItem(inflater.inflate(R.layout.access_free, null))
            ITEM_SALES -> ViewHolderItem(inflater.inflate(R.layout.sales, null))
            ITEM_STATISTIC -> ViewHolderItem(inflater.inflate(R.layout.statistic, null))
            MY_TRENING -> ViewHolderItem(inflater.inflate(R.layout.my_trening, null))
            else -> ViewHolderItem(inflater.inflate(R.layout.my_card, null))
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val viewType = listViewType[position]

    }

    override fun getItemCount(): Int = listViewType.size

    override fun getItemViewType(position: Int): Int = listViewType[position]

    open inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    inner class ViewHolderItem(itemView: View) : ViewHolder(itemView)



}