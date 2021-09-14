package com.adauto.details_public.domain

import com.adauto.shared_domain.detail_pokemon.DetailPokemonDTO
import retrofit2.Response

interface DetailPokemonRepository {
    suspend fun getPokemonDetail(endpoint: String): Response<DetailPokemonDTO>?
}