package com.adauto.pokemon

import com.adauto.pokemon.domain.PokemonRepositoryImpl
import com.adauto.pokemon.presentation.PokemonViewModel
import com.adauto.pokemon_public.domain.PokemonRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

class PokemonDI {
    fun getModule() : Module {
        return module {
            viewModel { PokemonViewModel(get(), get()) }
            single<PokemonRepository> { PokemonRepositoryImpl(get()) }
        }
    }
}