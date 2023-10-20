package com.acabes.car

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CarDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CarDetailsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var carModel: CarModel? = null
    private  val CAR_MODEL = "carModel"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            carModel = it.getParcelable(CAR_MODEL) as CarModel?
            Log.d("addios", carModel.toString())
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val carManufactureNameText : TextView? = view?.findViewById(R.id.manufactureName)
        val countryNameText: TextView?= view.findViewById(R.id.countryName)

        val vehicleType: RecyclerView =view.findViewById(R.id.recyclerviewOnlineDetail)

        vehicleType.layoutManager = LinearLayoutManager(this.context)

        carModel?.let {
            carManufactureNameText?.text = it.carManufactureName
            countryNameText?.text = it.countryName
            Log.d("addiosm", it.carManufactureName.toString())
            val adapter= CarTypeAdapter(carModel!!.vehicleType)

            vehicleType.adapter=adapter
        }


    }

    companion object {


        @JvmStatic
        fun newInstance(carModel: CarModel) =
            CarDetailsFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(CAR_MODEL, carModel)
                }
            }
    }
}