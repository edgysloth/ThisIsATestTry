package com.example.thisisthefinaltextassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.thisisthefinaltextassignment.ui.theme.ThisIsTheFinalTextAssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            ThisIsTheFinalTextAssignmentTheme {
                /*Row(Modifier
                    .background(Color.Black)
                    .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )



                     {
                        Text("Bhaiya kaam karo", fontSize = 50.sp, color = Color.White)
                    }*/


                /*Row {
                    Text(
                        text = "First ",
                        fontSize = 30.sp,
                        modifier = Modifier.alignByBaseline() // Align by one-fourth of the element's height
                    )
                    Text(
                        text = "Second",
                        fontSize = 16.sp,
                        modifier = Modifier.alignBy { it[LastBaseline] }
                    )
                }*/
                /* Column (
                     Modifier.background(Color.Black)
                         .fillMaxSize()
                 ){
                     Text(text="ShantaBai",
                         fontSize=40.sp,
                         color=Color.White,
                         modifier=Modifier.align(Alignment.CenterHorizontally)
                     )
                     Text(text="KantaBai",
                         fontSize = 40.sp,
                         color=Color.White,
                         modifier=Modifier.align(Alignment.CenterHorizontally)
                     )
                 }*/
                /*Column (
                    Modifier.background(Color.Black)
                        .fillMaxSize()
                ){
                    Text(text="ShantaBai",
                        fontSize=40.sp,
                        color=Color.White,
                        modifier=Modifier.alignBy{it.measuredHeight/2}
                    )
                    Text(text="KantaBai",
                        fontSize = 40.sp,
                        color=Color.White,
                        modifier=Modifier.alignBy{it.measuredHeight}
                    )
                }*/
                /*Box(
                    modifier = Modifier
                        .background(Color.Black)
                        .fillMaxSize()
                ) {
                    Text(
                        text = "Top Start",
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.align(Alignment.TopStart) // Aligns the text to the top start of the Box
                    )
                    Text(
                        text = "Center",
                        fontSize = 20.sp,
                        color=Color.Yellow,
                        modifier = Modifier.align(Alignment.Center) // Aligns the text to the center of the Box
                    )
                    Text(
                        text = "Bottom End",
                        fontSize = 20.sp,
                        color=Color.Cyan,
                        modifier = Modifier.align(Alignment.BottomEnd) // Aligns the text to the bottom end of the Box
                    )
                }*/
                /*Row(Modifier.background(Color.Black).fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween)
                {
                    Text("Arey meri toh maaje maaje",color=Color.White)
                    Text("Arey lag gayi",color=Color.White)
                }*/
                Column(
                    modifier = Modifier.background(Color.Black).fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text("Arey meri toh maaje maaje",color= Color.White)
                    Text("Arey lag gayi",color= Color.White)
                }




            }
        }
    }
}

