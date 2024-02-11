package com.myapplication.odevdosyasi.otopark_ucreti

class Arac {

    fun otoparkUcreti(misafirSuresiSaat:Int):Int{
        if (misafirSuresiSaat<=1){
            return 50
        }else{
            return 50 + 10*(misafirSuresiSaat-1)
        }
    }
}