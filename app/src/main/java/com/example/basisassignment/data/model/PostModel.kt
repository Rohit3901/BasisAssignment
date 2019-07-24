package com.example.basisassignment.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PostModel(
    @SerializedName("data")
    val data: List<Data>
):Parcelable

@Parcelize
data class Data(
    val id:String,
    val text:String
):Parcelable