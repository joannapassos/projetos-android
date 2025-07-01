// Este é o modulo de dependencias
// Ele diz ao Koin como criar um ItemRepository (single = instancia unica)
// Em seguida ele diz ao Kion como criar um ItemListViewModel e o get resolve a dependencia

package com.joanna.androidmentoring.dependency.injection

import com.joanna.androidmentoring.data.ItemRepository
import com.joanna.androidmentoring.ui.theme.ItemListViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { ItemRepository(androidContext()) }

    viewModel { ItemListViewModel(get()) }
}