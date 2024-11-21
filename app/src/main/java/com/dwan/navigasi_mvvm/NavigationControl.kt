package com.dwan.navigasi_mvvm

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dwan.navigasi_mvvm.ui.viewmodel.SiswaViewModel
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun NavigationControl(

) {
    @Composable
    fun NavigationControl(
        modifier: Modifier = Modifier,
        viewModel: SiswaViewModel = viewModel(),
        navHost: NavHostController = rememberNavController()
    ) {

    }
}