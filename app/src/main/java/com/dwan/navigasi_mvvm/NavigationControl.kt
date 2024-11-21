package com.dwan.navigasi_mvvm

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dwan.navigasi_mvvm.ui.viewmodel.SiswaViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dwan.navigasi_mvvm.model.JenisKelamin.JenisK
import com.dwan.navigasi_mvvm.ui.view.FormulirView

enum class Halaman {
    FORMULIR,
}

@Composable
fun NavigationControl(

) {
    @Composable
    fun NavigationControl(
        modifier: Modifier = Modifier,
        viewModel: SiswaViewModel = viewModel(),
        navHost: NavHostController = rememberNavController()
    ) {
        val uiState by viewModel.statusUI.collectAsState()

        NavHost(
            modifier = modifier,
            navController = navHost,
            startDestination = Halaman.FORMULIR.name
        ) {
            composable(
                route = Halaman.FORMULIR.name
            ) {
                val context = LocalContext.current

                FormulirView(
                    modifier = modifier,
                    listJK = JenisK.map { id ->
                        context.getString(id)
        }
    }
}