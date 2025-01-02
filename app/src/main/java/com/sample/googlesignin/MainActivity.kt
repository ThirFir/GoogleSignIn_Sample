package com.sample.googlesignin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sample.authentication.signin.screen.SignInScreen
import com.sample.domain.repository.SocialRepository
import com.sample.googlesignin.ui.theme.GoogleSignInTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var socialRepository: SocialRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GoogleSignInTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SignInScreen(
                        modifier = Modifier.padding(innerPadding),
                        socialRepository = socialRepository
                    )
                }
            }
        }
    }
}