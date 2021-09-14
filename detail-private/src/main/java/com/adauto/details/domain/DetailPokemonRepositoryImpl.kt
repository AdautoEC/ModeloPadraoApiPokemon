package com.adauto.details.domain

import android.content.Context
import com.adauto.shared_service.repository.BaseRepository
import com.adauto.details.data.DetailPokemonAPI
import com.adauto.details_public.domain.DetailPokemonRepository

class DetailPokemonRepositoryImpl(
    context: Context
) : BaseRepository<DetailPokemonAPI>(context), DetailPokemonRepository {
    override suspend fun getPokemonDetail(endpoint: String) = create<DetailPokemonAPI>().getPokemonDetail(endpoint)
}