package com.example.siomaimadnesspos.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food_table")
data class FoodEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "food_name") val foodName: String,
    @ColumnInfo(name = "price") val price: String,
    @ColumnInfo(name = "image_resource") val imageResource: Int
)
