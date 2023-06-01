package com.example.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.loginapplication.usecase.LoginUserUseCase
import com.example.loginapplication.usecase.RegisterUserUseCase
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var registerUserUseCase: RegisterUserUseCase
    @Inject
    lateinit var loginUserUseCase: LoginUserUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email = "sunil.d.s@gmail.com"
        val password = "pass123"
        lifecycleScope.launch {
           // registerUserUseCase.invoke(email, password)
            loginUserUseCase.invoke(email, password)
        }
    }
}