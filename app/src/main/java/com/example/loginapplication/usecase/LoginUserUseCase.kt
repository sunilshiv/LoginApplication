package com.example.loginapplication.usecase

import com.example.loginapplication.model.domain.User
import com.example.loginapplication.model.db.dao.UserDao
import timber.log.Timber
import javax.inject.Inject

class LoginUserUseCase @Inject constructor(
    private val getUserByEmailUseCase: GetUserByEmailUseCase,
    private val addLoggedInEmailToDataStore: AddLoggedInEmailToDataStore
) {

    suspend operator fun invoke(email: String, password: String) {
        Timber.d("invoke:$email")
        try {
            val userDto = getUserByEmailUseCase(email)
            if(userDto.password != password){
              Timber.e("LoginUserUseCase: Failed, password do not match!")
            }
            addLoggedInEmailToDataStore(email)
        }catch (e: Exception){
            Timber.e("LoginUserUseCase: Failed, exception ${e.message}")
        }
    }

}