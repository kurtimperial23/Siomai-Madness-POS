package com.example.siomaimadnesspos.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.siomaimadnesspos.dao.FoodDao
import com.example.siomaimadnesspos.entity.FoodEntity

@Database(entities = [FoodEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun foodDao(): FoodDao
}
