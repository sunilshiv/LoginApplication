package com.example.loginapplication.model.db

import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.example.loginapplication.model.dto.UserDto
import com.example.loginapplication.model.db.dao.UserDao

@Database(entities = arrayOf(UserDto::class), version = 1)
abstract class ApplicationDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
    override fun clearAllTables() {
        TODO("Not yet implemented")
    }

    override fun createInvalidationTracker(): InvalidationTracker {
        TODO("Not yet implemented")
    }

    override fun createOpenHelper(config: DatabaseConfiguration): SupportSQLiteOpenHelper {
        TODO("Not yet implemented")
    }
}