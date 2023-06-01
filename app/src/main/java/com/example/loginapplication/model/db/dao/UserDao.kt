package com.example.loginapplication.model.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.loginapplication.model.dto.UserDto

@Dao
interface UserDao {

    @Query("SELECT * FROM UserDto WHERE email=:email")
    fun findByEmail(email: String): UserDto

    @Query("SELECT EXISTS(SELECT * FROM UserDto WHERE email=:email)")
    fun isRowIsExist(email:String): Boolean

    @Insert
    fun insert(user: UserDto)
}