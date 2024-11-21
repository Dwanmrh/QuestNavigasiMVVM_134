package com.dwan.navigasi_mvvm.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.dwan.navigasi_mvvm.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {

    // Request
    private val _statusUI = MutableStateFlow(DataSiswa())

    // Response
    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()

    fun saveDataSiswa(ls: List<String>) {
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                nim = ls[1],
                gender = ls[2],
                email = ls[3],
                alamat = ls[4],
                notelp = ls[5]
            )
        }
    }
}