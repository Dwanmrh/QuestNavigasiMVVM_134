package com.dwan.navigasi_mvvm.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dwan.navigasi_mvvm.model.DataSiswa

@Composable
fun TampilDataView(
    modifier: Modifier,
    uiState: DataSiswa,
    onBackButton: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}

@Composable
fun TampilData(
    param: String,
    argu: String
) {

}