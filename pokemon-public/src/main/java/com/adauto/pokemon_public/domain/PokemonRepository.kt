package com.adauto.pokemon_public.domain

import com.adauto.shared_domain.pokemon.PokemonDTO
import retrofit2.Response

interface PokemonRepository {
    suspend fun getPokemon(): Response<PokemonDTO>?
}