package com.adauto.details.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.adauto.shared_domain.detail_pokemon.DetailPokemonDTO
import com.adauto.details_public.domain.DetailPokemonRepository
import com.adauto.shared_common.presentation.BaseViewModel
import kotlinx.coroutines.launch

class DetailPokemonViewModel(
    private val repository: DetailPokemonRepository
) : BaseViewModel() {
    private var _pokemonDetail = MutableLiveData<DetailPokemonDTO>()
    var pokemonDetail: LiveData<DetailPokemonDTO> = _pokemonDetail

    fun getPokemonDetail(endpoint: String) {
        viewModelScope.launch(apiException) {
            serviceCaller(repository.getPokemonDetail(endpoint))?.let {
                _pokemonDetail.value = it
            }
        }
    }
}