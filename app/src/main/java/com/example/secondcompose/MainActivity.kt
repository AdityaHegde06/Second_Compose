package com.example.secondcompose

import android.R.attr.contentDescription
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp =500)
@Composable
private fun PreviewFunction(){
    Column (){

        ListViewItem(R.drawable.p, "Aditya Hegde", " Android Software Engineer and Cricketer" ,)
        ListViewItem(R.drawable.p, "Rajiv  Sharma", "Software Engineer" ,)
        ListViewItem(R.drawable.p, "Aniket Shinde", "Software Engineer" ,)
        ListViewItem(R.drawable.p, "Raana Prataap", "Software Engineer" ,)
    }



}

@Composable
fun ListViewItem(imgId:Int, name : String, occupation:String){
    Row(Modifier.padding(8.dp)) {
        Image(painter = painterResource(id = imgId),
            contentDescription = "",
            Modifier.size(40.dp))
        Column {
            Text(
                text =name ,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp
            )
        }
    }
}


@Composable
fun TextInput(){

}
