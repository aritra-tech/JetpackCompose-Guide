package com.example.jetpackcompose_guide

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose_guide.core.User
import com.example.jetpackcompose_guide.core.data
import com.example.jetpackcompose_guide.ui.theme.JetPackCompose_GuideTheme

class RecyclerViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Recyclerview(users = data())
        }
    }
}

@Composable
fun CardView(user: User){

    Card(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 10.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        elevation = 3.dp
    ) {

        Row(modifier = Modifier.padding(10.dp)) {

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "image",
                modifier = Modifier
                    .padding(5.dp)
                    .size(40.dp)
                    .align(Alignment.CenterVertically)
                    .clip(RoundedCornerShape(10.dp))
            )
            Text(text = user.desc, modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun Recyclerview(users:List<User>){
    LazyColumn{
        items(users){user->
            CardView(user)
        }
    }
}
