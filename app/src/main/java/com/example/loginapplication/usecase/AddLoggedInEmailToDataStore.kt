package com.example.loginapplication.usecase

import com.example.loginapplication.utils.DATASTORE_LOGGED_IN_EMAIL_KEY
import com.example.loginapplication.utils.DataStoreManager
import timber.log.Timber
import javax.inject.Inject

class AddLoggedInEmailToDataStore @Inject constructor(
    private val dataStoreManager: DataStoreManager
) {

    suspend operator fun invoke(email: String){
        Timber.d("invoke:$email")
        dataStoreManager.addToDataStore(DATASTORE_LOGGED_IN_EMAIL_KEY, email)
    }
}