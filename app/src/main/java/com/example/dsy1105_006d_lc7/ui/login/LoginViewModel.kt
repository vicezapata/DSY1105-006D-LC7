package com.example.dsy1105_006d_lc7.ui.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.dsy1105_006d_lc7.data.model.AuthRepository

class LoginViewModel (
    private val repo: AuthRepository= AuthRepository()
): ViewModel(){

    var uiState by mutableStateOf(LoginUiState())
        private set

    fun onUsernameChange(value:String){
        uiState = uiState.copy(username=value, error=null)
    }
    /// Hasta aqui

}// fin viewmodel