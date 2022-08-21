package com.example.testhilt.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import com.example.testhilt.R
import com.example.testhilt.data.remote.datasource.DogDataSourceImpl
import com.example.testhilt.data.remote.datasource.DogDataSourceImpl_Factory
import com.example.testhilt.data.remote.repository.DogRepository
import com.example.testhilt.data.remote.repository.DogRepositoryImpl
import com.example.testhilt.data.remote.service.DogService
import com.example.testhilt.databinding.ActivityMainBinding
import com.example.testhilt.ui.base.BaseActivity
import com.example.testhilt.ui.main.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.vm = viewModel

        // DogRepositoryImpl(DogDataSourceImpl(DogService()))
    }

}