package com.myapplication.odevdosyasi.maas__hesabi
class Maas {

    fun toplamMaas(gun:Int):Int{
        val toplamSaat =  8 * gun
        if ( toplamSaat<=150 ){
            return toplamSaat * 40
        }else{
            return 150 * 40 + (toplamSaat-150)*80
        }
    }
}