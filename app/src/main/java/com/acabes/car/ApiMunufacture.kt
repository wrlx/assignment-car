package com.acabes.car


import retrofit2.http.GET

interface ApiMunufacture {

    @GET("/api/vehicles/getallmanufacturers?format=json")
    suspend fun getCarData(): CarList
}