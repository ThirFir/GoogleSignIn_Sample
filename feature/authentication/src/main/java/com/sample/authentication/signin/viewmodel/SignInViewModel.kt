package com.sample.authentication.signin.viewmodel

import androidx.lifecycle.ViewModel
import com.sample.domain.repository.SocialRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(

) : ViewModel() {

    fun tryGoogleSignIn(socialRepository: SocialRepository) {
        socialRepository.tryGoogleSignIn().onSuccess {

        }.onFailure {

        }
    }
}