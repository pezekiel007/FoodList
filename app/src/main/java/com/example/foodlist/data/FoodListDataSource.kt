package com.example.foodlist.data

import com.example.foodlist.R
import com.example.foodlist.model.FoodListDeclaration

class FoodListDataSource {

    fun loadDeclaration() : List<FoodListDeclaration> {

        return listOf<FoodListDeclaration>(

            FoodListDeclaration(R.string.beans, R.string.price_1, R.drawable.beans),
            FoodListDeclaration(R.string.beans_plantain, R.string.price_2, R.drawable.beans_plantain),
            FoodListDeclaration(R.string.brown_rice, R.string.price_3, R.drawable.brown_rice),
            FoodListDeclaration(R.string.custard, R.string.price_4, R.drawable.custard),
            FoodListDeclaration(R.string.egusi_soup, R.string.price_5, R.drawable.egusi_soup),
            FoodListDeclaration(R.string.fried_rice, R.string.price_6, R.drawable.fried_rice),
            FoodListDeclaration(R.string.jollof_rice, R.string.price_7, R.drawable.jollof_rice),
            FoodListDeclaration(R.string.ofada_and_sauce, R.string.price_8, R.drawable.ofada_and_sauce),
            FoodListDeclaration(R.string.ofada_and_stew, R.string.price_9, R.drawable.ofada_and_stew),
            FoodListDeclaration(R.string.oziza_soup, R.string.price_10, R.drawable.oziza_soup),
            FoodListDeclaration(R.string.pap, R.string.price_11, R.drawable.pap),
            FoodListDeclaration(R.string.steamed_rice, R.string.price_12, R.drawable.steamed_rice),
            FoodListDeclaration(R.string.tea_and_sandwich, R.string.price_13, R.drawable.tea_and_sandwich),
            FoodListDeclaration(R.string.vegie_fried_rice, R.string.price_14, R.drawable.vegie_fried_rice),
            FoodListDeclaration(R.string.yam_and_sauce, R.string.price_15, R.drawable.yam_and_sauce)

        )

    }
    
}