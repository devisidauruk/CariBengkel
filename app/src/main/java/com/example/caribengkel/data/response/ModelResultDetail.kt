package com.example.caribengkel.data.response

import com.example.caribengkel.data.model.details.ModelDetail
import com.google.gson.annotations.SerializedName

class ModelResultDetail {
    @SerializedName("result")
    lateinit var modelDetail: ModelDetail
}