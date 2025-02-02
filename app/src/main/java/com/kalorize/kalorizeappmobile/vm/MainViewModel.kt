package com.kalorize.kalorizeappmobile.vm

import androidx.lifecycle.ViewModel
import com.kalorize.kalorizeappmobile.ui.screen.auth.login.LoginViewModel
import com.kalorize.kalorizeappmobile.data.remote.ApiRepository
import com.kalorize.kalorizeappmobile.ui.screen.auth.forgotopassword.changepassword.ChangePasswordViewModel
import com.kalorize.kalorizeappmobile.ui.screen.auth.forgotopassword.getstartedchangepassword.GetStartedChangePasswordViewModel
import com.kalorize.kalorizeappmobile.ui.screen.auth.forgotopassword.otp.OtpViewModel
import com.kalorize.kalorizeappmobile.ui.screen.auth.forgotopassword.reinputemail.ReInputEmailViewModel
import com.kalorize.kalorizeappmobile.ui.screen.auth.register.RegisterViewModel

class MainViewModel(private val apiRepository: ApiRepository): ViewModel() {
    val loginViewModel = LoginViewModel(this.apiRepository)

    val registerViewModel = RegisterViewModel(this.apiRepository)

    val reInputEmailViewModel = ReInputEmailViewModel(this.apiRepository)

    val otpViewModel = OtpViewModel(this.apiRepository)

    val changePasswordViewModel = ChangePasswordViewModel(this.apiRepository)

    val getStartedChangePasswordViewModel = GetStartedChangePasswordViewModel(this.apiRepository)
}