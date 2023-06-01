package com.example.loginapplication.usecase

import com.example.loginapplication.model.db.dao.UserDao
import com.example.loginapplication.model.dto.UserDto
import timber.log.Timber
import javax.inject.Inject

class AddUserToDatabaseUseCase @Inject constructor(
    private val dao: UserDao
) {

    suspend operator fun invoke(userDto: UserDto) {
        Timber.d("invoke!")
        dao.insert(userDto)
    }

}