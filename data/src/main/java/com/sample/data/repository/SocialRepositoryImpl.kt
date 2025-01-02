package com.sample.data.repository

import com.sample.data.datasource.SocialRemoteDataSource
import com.sample.domain.repository.SocialRepository
import javax.inject.Inject

class SocialRepositoryImpl @Inject constructor(
    private val socialRemoteDataSource: SocialRemoteDataSource
) : SocialRepository {

    override fun tryGoogleSignIn(): Result<Unit> {
        return runCatching {

        }
    }
}