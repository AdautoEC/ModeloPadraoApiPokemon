package com.adauto.shared_common

import com.adauto.shared_common.presentation.BaseViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

class SharedCommonDI {
    fun getModule(): Module {
        return module {
            viewModel { BaseViewModel() }
        }
    }
}