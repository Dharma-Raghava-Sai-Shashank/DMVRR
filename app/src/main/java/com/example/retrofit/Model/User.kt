package com.example.retrofit.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(@PrimaryKey val _id:String,val name:String,val email:String)