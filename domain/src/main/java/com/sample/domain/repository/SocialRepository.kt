package com.sample.domain.repository

interface SocialRepository {

    fun tryGoogleSignIn(): Result<Unit>
}