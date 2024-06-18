package com.example.bootcamp.ui.home.viewmodel

import android.app.Application
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bootcamp.domain.use_case.FirstPageUseCase
import com.example.bootcamp.ui.home.state.HomeState
import com.example.bootcamp.utils.NetworkResource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val firstPageUseCase: FirstPageUseCase,
    private val appContext: Application
) : ViewModel(){

    var uiState by mutableStateOf(HomeState())
        private set
    fun getList() {

        uiState = uiState.copy(isLoading = true)
        viewModelScope.launch {
            when (val response = firstPageUseCase.invoke()) {
                is NetworkResource.Error -> {
                    uiState = uiState.copy(isLoading = false)
                    Toast.makeText(appContext, response.message, Toast.LENGTH_SHORT).show()
                }
                is NetworkResource.Success -> {
                    uiState = uiState.copy(isLoading = false, pageResponse = response.data)
                }
            }
        }
    }

}