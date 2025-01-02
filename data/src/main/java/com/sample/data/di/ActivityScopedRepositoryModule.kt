package com.sample.data.di

import com.sample.data.repository.SocialRepositoryImpl
import com.sample.domain.repository.SocialRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class ActivityScopedRepositoryModule {

    @Binds
    @ActivityScoped
    abstract fun bindSocialRepository(
        socialRepositoryImpl: SocialRepositoryImpl
    ): SocialRepository
}

@Module
@InstallIn(SingletonComponent::class)
abstract class SingletonScopedRepositoryModule {

}