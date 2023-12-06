package com.example.siomaimadnesspos.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.siomaimadnesspos.entity.FoodEntity

@Dao
interface FoodDao {
    @Query("SELECT * FROM food_table")
    suspend fun getAllFoods(): List<FoodEntity>
}
