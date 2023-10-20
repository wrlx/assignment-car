package com.acabes.car



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class CarAdapter(private val mList: List<CarModel>, private val clickListener: (carModel: CarModel) -> Unit) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_vie_online, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModelOnline = mList[position]
        holder.itemOne.text = ItemsViewModelOnline.carManufactureName
        holder.itemTwo.text = ItemsViewModelOnline.countryName
        holder.itemView.setOnClickListener{
            clickListener(ItemsViewModelOnline)
        }


    }
    override fun getItemCount(): Int {
        return mList.size
    }



    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val itemOne: TextView = itemView.findViewById(R.id.textOnlineOne)
        val itemTwo: TextView = itemView.findViewById(R.id.textOnlineTwo)

    }
}
