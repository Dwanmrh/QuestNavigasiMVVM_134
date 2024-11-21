package com.dwan.navigasi_mvvm.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.dwan.navigasi_mvvm.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SiswaViewModel : ViewModel {

    // Request
    private val _statusUI = MutableStateFlow(DataSiswa())

    // Response
    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()
}