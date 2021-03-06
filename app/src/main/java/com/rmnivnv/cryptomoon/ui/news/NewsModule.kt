package com.rmnivnv.cryptomoon.ui.news

import android.content.Context
import com.rmnivnv.cryptomoon.di.PerFragment
import dagger.Module
import dagger.Provides

/**
 * Created by ivanov_r on 26.09.2017.
 */
@Module
class NewsModule {

    @Provides @PerFragment
    fun provideView(newsFragment: NewsFragment): INews.View = newsFragment

    @Provides @PerFragment
    fun providePresenter(view: INews.View, context: Context): INews.Presenter = NewsPresenter(view, context)

}