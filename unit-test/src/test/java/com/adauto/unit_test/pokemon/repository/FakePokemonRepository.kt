package com.adauto.unit_test.pokemon.repository

import com.adauto.pokemon_public.domain.PokemonRepository
import com.adauto.shared_domain.pokemon.PokemonDTO
import retrofit2.Response

open class FakePokemonRepository : PokemonRepository {
    override suspend fun getPokemon(): Response<PokemonDTO> = Response.success(PokemonDTO())
}