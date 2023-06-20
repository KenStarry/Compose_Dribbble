package com.kenstarry.ecommy.features.feature_checkout.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kenstarry.ecommy.features.feature_checkout.presentation.components.CheckoutAppBar
import com.kenstarry.ecommy.features.feature_checkout.presentation.components.MasterCardSection

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

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White)
                    .padding(all = 24.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {

                //  master card section
                MasterCardSection()
                //  payment section
                //  Promo / voucher section
                //  total section

            }

        }

    }

}

@Preview
@Composable
fun CheckoutPreview() {
    CheckoutPage()
}