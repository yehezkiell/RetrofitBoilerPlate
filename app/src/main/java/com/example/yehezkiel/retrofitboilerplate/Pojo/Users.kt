package com.example.yehezkiel.retrofitboilerplate.Pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


open class Users {


    @SerializedName("id")
    @Expose
    open var id: Int? = null

    @SerializedName("username")
    @Expose
    open var username: String? = null

    @SerializedName("email")
    @Expose
    open var email: String? = null
}