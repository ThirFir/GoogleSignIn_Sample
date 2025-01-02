package com.sample.authentication.signin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sample.authentication.R
import com.sample.authentication.signin.viewmodel.SignInViewModel
import com.sample.domain.repository.SocialRepository

@Composable
fun SignInScreen(
    modifier: Modifier = Modifier,
    socialRepository: SocialRepository,
    viewModel: SignInViewModel = hiltViewModel()
) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "구글 로그인 샘플", fontSize = 32.sp, modifier = Modifier.padding(top = 200.dp))
        Spacer(modifier = Modifier.weight(1f))
        Image(
            modifier = Modifier.clickable {
                viewModel.tryGoogleSignIn(socialRepository)
            },
            imageVector = ImageVector.vectorResource(R.drawable.img_google_auth),
            contentDescription = null
        )
    }
}