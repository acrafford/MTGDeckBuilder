package com.example.alexcrafford.mtgdeckbuilder.dagger2

import com.example.alexcrafford.mtgdeckbuilder.MTGDeckBuilderApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val app: MTGDeckBuilderApplication) {

    @Provides
    @Singleton
    fun provideApplication() = app
}