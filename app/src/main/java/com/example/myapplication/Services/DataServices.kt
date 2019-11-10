package com.example.myapplication.Services

import com.example.myapplication.model.Category
import com.example.myapplication.model.Product

object DataServices  {
    val categories= listOf(
        Category("SHIRTS","shirtimage"),
        Category("DRAWABL","drawable")

    )
    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat01"),
        Product("Devslopes JS Beanie","$22","hat02")


    )

    val holid = listOf(
        Product("Devslopes HodiGray","$118","hol1"),
        Product("Devslopes JS Beanie","$232","hol2")
    )
    val shirt= listOf(
        Product(" HodiGray","$118","hol1"),
        Product(" JS Beanie","$232","hol2")
    )
}