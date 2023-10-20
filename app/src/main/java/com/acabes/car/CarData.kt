package com.acabes.car

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class CarList(@SerializedName("Results")val carList : List<CarModel>):Parcelable

@Parcelize
data class CarModel (

    @SerializedName("Mfr_CommonName") val carManufactureName:String,
    @SerializedName("Country") val countryName:String,
    @SerializedName(" Mfr_ID") val manufactureID:Int,
    @SerializedName("Mfr_Name") val manufactureName:String,
    @SerializedName("VehicleTypes") val vehicleType: List<VehicleType>,
) : Parcelable

@Parcelize
data class VehicleType(

    val isPrimary:Boolean,
    @SerializedName("Name") val name:String
) : Parcelable