package com.umy.pertemuan4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan4.R


@Preview(showBackground = true)
@Composable
fun Layout (
    modifier: Modifier = Modifier
){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        TampilHeader()
        DetailMhs(
            Judul = "Nama",
            Isinya = "Affra Adi Wirawan"
        )
        DetailMhs(
            Judul = "NIM",
            Isinya = "20220140149"
        )

        DetailMhs(
            Judul = "Alamat",
            Isinya = "Jalan Abimanyu, Ngrame, Kasihan, Bantul"
        )
        DetailMhs(
            Judul = "Email",
            Isinya = "kepo@gmail.com"
        )
        DetailMhs(
            Judul = "Nomor HP",
            Isinya = "09812790182"
        )
    }
}


@Composable
fun TampilHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painter = painterResource(id = R.drawable.yoi),
                    contentDescription = null,
                )
                Icon(
                    Icons.Filled.CheckCircle,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                        .background(color = Color.Red, shape = CircleShape),
                    tint = Color.DarkGray
                )
                }
            Column (
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Pelatih Yoga Terpercaya", color = Color.White, fontSize = 15.sp)
                Spacer(modifier = Modifier.padding(3.dp))
                Text(text = "Ayo Yoga Bersama Saya!!",  color = Color.White, fontSize = 15.sp)
            }
        }


    }
}


@Composable
fun DetailMhs(
    Judul: String, Isinya: String
) {
    Column (
        modifier = Modifier.padding(16.dp)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = Judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = Isinya,
                modifier = Modifier.weight(2f))
        }
    }
}


