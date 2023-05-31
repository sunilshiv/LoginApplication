package com.example.loginapplication.utils

import android.content.Context
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class DataStoreManager @Inject constructor(
    @ApplicationContext private val context: Context
){

    suspend fun addToDataStore(key: Preferences.Key<String>, value: String){
        context.dataStore.edit { settings ->
            settings[key] = value
        }
    }
}