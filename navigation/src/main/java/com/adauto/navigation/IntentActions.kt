package com.adauto.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.adauto.navigation.ConstantsActions.DETAIL_POKEMON_ACTION
import com.adauto.shared_common.presentation.constants.KeyNameConstants.ENDPOINT

object IntentActions {
    fun openDetailPokemon(activity: AppCompatActivity, endpoint: String) {
        activity.startActivity(
            Intent(DETAIL_POKEMON_ACTION).apply {
                putExtra(ENDPOINT, endpoint)
                setPackage(activity.packageName)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
        )
    }
}