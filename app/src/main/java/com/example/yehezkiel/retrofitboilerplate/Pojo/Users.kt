package com.example.yehezkiel.retrofitboilerplate.Pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


open class Users {

    @SerializedName("avatar_url")
    @Expose
    open var avatarUrl: String? = null

    @SerializedName("name")
    @Expose
    open var name: String? = null

    @SerializedName("followers")
    @Expose
    open var followers: Int? = null
}