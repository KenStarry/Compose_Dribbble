package com.kenstarry.ecommy.features.feature_checkout.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.kenstarry.ecommy.features.feature_checkout.presentation.components.CheckoutAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckoutPage() {

    Scaffold(
        topBar = {
            CheckoutAppBar()
        }
    ) { contentPadding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Red)
                .padding(contentPadding),
            contentAlignment = Alignment.Center
        ) {



        }

    }

}

@Preview
@Composable
fun CheckoutPreview() {
    CheckoutPage()
}