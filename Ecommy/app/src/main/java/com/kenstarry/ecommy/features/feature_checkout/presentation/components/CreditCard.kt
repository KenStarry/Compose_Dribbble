package com.kenstarry.ecommy.features.feature_checkout.presentation.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@androidx.compose.runtime.Composable
fun CreditCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(12))
            .background(color = MaterialTheme.colorScheme.primary)
            .padding(horizontal = 20.dp, vertical = 16.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        //  credit card header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Credit Card",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White
            )
            Icon(imageVector = Icons.Filled.Wifi, contentDescription = "Wifi", tint = Color.White)
        }

        //  credit card number
        Box(
            modifier = Modifier
                .wrapContentSize()
        ) {
            Text(
                text = "4321 8967 7756 2009",
                fontSize = 16.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White
            )
        }

        //  credit Card owner
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier = Modifier
                    .wrapContentSize()
            ) {

                Text(
                    text = "Starry K.",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White
                )

                Text(
                    text = "12/26",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            //  canvas
            Canvas(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                onDraw = {
                    //  first circle
                    drawCircle(
                        color = Color.Red,
                        radius = 50f,
                        center = Offset(x = this.size.width, y = this.size.height / 2)
                    )

                    //  second circle
                    drawCircle(
                        color = Color.White,
                        radius = 50f,
                        center = Offset(x = this.size.width * 0.75f, y = this.size.height / 2)
                    )
                }
            )

        }
    }
}


























