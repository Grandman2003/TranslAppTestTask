package com.example.translapptesttask.di.modules

import com.example.feature_favourite_impl.di.FavouriteComponent
import com.example.translapptesttask.di.components.TranslatorComponent
import dagger.Module

@Module(subcomponents = [TranslatorComponent::class])
class SubComponentsModule