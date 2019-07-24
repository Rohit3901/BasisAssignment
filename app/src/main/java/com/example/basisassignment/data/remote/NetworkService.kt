package com.example.basisassignment.data.remote

import com.example.basisassignment.data.model.PostModel
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET

interface NetworkService{

    @GET(Endpoints.DUMMY)
    fun getDummyData():Observable<PostModel>
}