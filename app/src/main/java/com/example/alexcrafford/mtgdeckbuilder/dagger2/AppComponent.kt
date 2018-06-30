package com.example.alexcrafford.mtgdeckbuilder.dagger2

import com.example.alexcrafford.mtgdeckbuilder.MTGDeckBuilderApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app: MTGDeckBuilderApplication)
}