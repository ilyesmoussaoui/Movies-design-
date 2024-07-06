package com.ilyes.moviesappd

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ilyes.moviesappd.ui.theme.MoviesappdTheme

@Composable
fun TopFood(modifier: Modifier = Modifier) {
    Column {
        Spacer(modifier = modifier.height(10.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                modifier = modifier.size(25.dp),
                )
            Spacer(modifier = Modifier.width(25.dp))
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = null,
                modifier = modifier.size(25.dp),
            )
            Spacer(modifier = Modifier.width(25.dp))


        }
    }




}





@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun TopFoodPreview() {
    Surface {
        TopFood()

    }
}


















@Composable
fun TopText() {
    Column {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(25.dp))

            Text(
                text = "Explore our",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            )
            Spacer(modifier = Modifier.weight(1f))




        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(25.dp))

            Text(
                text = "Delicious Offers",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            )
            Spacer(modifier = Modifier.weight(1f))




        }
    }




}









@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun TopTextPreview() {
    Surface {
        TopText()

    }
}


















@Composable
fun ImageF1(
    modifier: Modifier = Modifier,
    @DrawableRes drawable: Int,

    ) {
    Image(
        painter = painterResource(drawable),
        contentDescription = "",
        modifier = modifier
            .width(250.dp)
            .height(270.dp)
            .clip(RoundedCornerShape(22.dp))
        ,
        contentScale = ContentScale.Crop
    )


}







@Preview(showBackground = true)
@Composable
fun ImageF1Preview() {
    MoviesappdTheme {
        Column {

            ImageF1(
                drawable = R.drawable.goth,
            )
        }


    }
}






















@Composable
fun BottomImageText(
    @StringRes text1 : Int,
    @StringRes text2 : Int,

) {
    Column {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(3.dp))

            Text(
                text = stringResource(text1),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            )
            Spacer(modifier = Modifier.weight(1f))




        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(3.dp))

            Text(
                text = stringResource(text2),
                fontSize = 13.sp,
                fontFamily = FontFamily.SansSerif
            )
            Spacer(modifier = Modifier.weight(1f))




        }
    }




}














@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun BottomImageTextPreview() {
    Surface {
        BottomImageText(
            text1 = R.string.text1,
            text2 = R.string.text2

        )

    }
}














@Composable
fun ImageText(

    @DrawableRes drawable: Int,
    @StringRes text1 : Int,
    @StringRes text2 : Int,

) {
    Column {
        ImageF1(drawable = drawable)
        BottomImageText(
            text1 = text1,
            text2 = text2

        )

    }
    
}













@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun ImageTextPreview() {
    Surface {
        ImageText(
            drawable = R.drawable.goth,
            text1 = R.string.text1,
            text2 = R.string.text2

        )

    }
}













private data class ImageDetail1(
    @DrawableRes val drawable: Int,
    @StringRes val text1 : Int,
    @StringRes val text2 : Int,

    )



private val Row = listOf(
    ImageDetail1(R.drawable.godfather,R.string.text1,R.string.text2),
    ImageDetail1(R.drawable.thor,R.string.text3,R.string.text4 ),
    ImageDetail1(R.drawable.creed,R.string.text5,R.string.text6 ),
    ImageDetail1(R.drawable.knivesout,R.string.text7,R.string.text8 ),
    ImageDetail1(R.drawable.nobody,R.string.text9,R.string.text10 ),
    ImageDetail1(R.drawable.nowyouseeme,R.string.text11,R.string.text12 )


)



















@Composable
fun FirstRowFood(modifier: Modifier = Modifier) {
    Column {
        Spacer(modifier = modifier.height(17.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
            modifier = modifier
        ) {
            items(Row) { item ->
                ImageText(
                    drawable = item.drawable,
                    text1 = item.text1,
                    text2 = item.text2
                )
            }


        }
    }

}















@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun FirstRowFoodPreview() {
    MoviesappdTheme {
        FirstRowFood()
    }
}




















@Composable
fun SecondTextRow(modifier: Modifier = Modifier) {
    Column {
        Spacer(modifier = modifier.height(10.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(25.dp))
            Text(
                text = "Near me (15)",
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif
            )
            Spacer(modifier = Modifier.weight(1f))

            Icon(
                imageVector = Icons.Default.List,
                contentDescription = null,
                modifier = modifier.size(22.dp),
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "Filter",
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif
            )
            Spacer(modifier = Modifier.width(25.dp))




        }
    }




}

















@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun SecondTextRowPreview() {
    Surface {
        SecondTextRow()

    }
}
















@Composable
fun Column1(
    modifier: Modifier = Modifier,
    @DrawableRes drawable: Int,
    @StringRes text3 : Int,
    @StringRes text4 : Int,
    @StringRes text5 : Int,





    ) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(horizontal = 15.dp, vertical = 5.dp)
    ) {










        Image(
            painter = painterResource(drawable),
            contentDescription = "",
            modifier = modifier
                .width(100.dp)
                .height(110.dp)
                .clip(RoundedCornerShape(22.dp))
            ,
            contentScale = ContentScale.Crop
        )










        Column (
            verticalArrangement = Arrangement.Top
        ){


            
            
            
            
            
            
            
            
            


            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    text = stringResource(text3),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "Open",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Green
                )
            }











            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    text = stringResource(text4),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif
                )
                Spacer(modifier = Modifier.weight(1f))

            }

















            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = null,
                    modifier = modifier.size(14.dp),
                )
                Text(
                    text = stringResource(text5),
                    fontSize = 11.sp,
                    fontFamily = FontFamily.SansSerif
                )
                Spacer(modifier = Modifier.weight(1f))

            }
            Spacer(modifier = Modifier.weight(1f))



        }
    }



}













private data class ImageDetail2(
    @DrawableRes val drawable: Int,
    @StringRes val text3 : Int,
    @StringRes val text4 : Int,
    @StringRes val text5 : Int,


    )



private val Column = listOf(
    ImageDetail2(R.drawable.goth,R.string.text13,R.string.text14,R.string.text15),
    ImageDetail2(R.drawable.thedeparted,R.string.text16,R.string.text17,R.string.text30),
    ImageDetail2(R.drawable.interstellar,R.string.text18,R.string.text19,R.string.text20),
    ImageDetail2(R.drawable.logan,R.string.text21,R.string.text22,R.string.text23),
    ImageDetail2(R.drawable.inception,R.string.text24,R.string.text25,R.string.text26),
    ImageDetail2(R.drawable.nobody,R.string.text27,R.string.text28,R.string.text29),


)















@Composable
fun FirstColumnFood(modifier: Modifier = Modifier) {
    Column {
        Spacer(modifier = modifier.height(17.dp))
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(14.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
            modifier = modifier
        ) {
            items(Column) { item ->
                Column1(
                    drawable = item.drawable,
                    text3 = item.text3,
                    text4 = item.text4,
                    text5 = item.text5
                )
            }


        }
    }

}















@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun FirstColumnFoodPreview() {
    MoviesappdTheme {
        FirstColumnFood()
    }
}














@Composable
fun BottomNavigation1(modifier: Modifier = Modifier) {





    NavigationBar(
        containerColor = Color.White,
        modifier = modifier
    ) {
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null,

                    )
            },


            selected = true,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = null,

                    )
            },


            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    Modifier.size(35.dp)

                )
            },


            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = null,

                    )
            },


            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,

                    )
            },


            selected = false,
            onClick = {}
        )

    }
}















@Composable
fun FullScreen1(modifier: Modifier) {
    MoviesappdTheme {
        Scaffold(
            bottomBar = {
                BottomNavigation1()
            },

        ) { innerPadding ->

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(5.dp),
                contentPadding = PaddingValues(vertical = 4.dp),
                modifier = modifier.padding(innerPadding)
            ) {

                item {
                    Column {
                        TopFood()
                        TopText()
                        FirstRowFood()
                        SecondTextRow()



                    }
                }

                items(Column) { item ->
                    Column1(
                        drawable = item.drawable,
                        text3 = item.text3,
                        text4 = item.text4,
                        text5 = item.text5
                    )
                }


            }




        }
    }
}
























@Preview(showBackground = true)
@Composable
fun FullScreen1Preview() {
    MoviesappdTheme {


        FullScreen1(modifier = Modifier)
    }
}


