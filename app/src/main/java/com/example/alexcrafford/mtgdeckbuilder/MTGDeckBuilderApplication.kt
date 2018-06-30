package com.example.alexcrafford.mtgdeckbuilder

import android.app.Application
import com.example.alexcrafford.mtgdeckbuilder.dagger2.AppComponent
import com.example.alexcrafford.mtgdeckbuilder.dagger2.AppModule

class MTGDeckBuilderApplication: Application() {

    /**
     *  To have a variable injected to your Kotllin class object,
     *  you’ll could have it declared as below (using app : Application as example).
     *  You’ll need lateinit as this help you to ensure you could have a non-nullable
     *  variable defined without need to assign something to it before hand.
     *
     *  Example: @Inject
     *           lateinit var app : Application
     **/


    val component: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}