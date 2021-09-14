package com.adauto.pokemon.domain

import android.content.Context
import com.adauto.shared_service.repository.BaseRepository
import com.adauto.pokemon.data.PokemonAPI
import com.adauto.pokemon_public.domain.PokemonRepository

class PokemonRepositoryImpl(
    context: Context
) : BaseRepository<PokemonAPI>(context), PokemonRepository {
    override suspend fun getPokemon() = caller(PokemonAPI::getPokemon)
}