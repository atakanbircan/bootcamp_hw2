package com.myapplication.odevdosyasi.tekrar_eden_e_harfi

class TekrarliEHarfi {
    fun tekrarSayisi(kelime:String):Int{
        var tekrarSayisi=0
        for (i in 0..kelime.length-1){
            if (kelime[i] == 'e'){
                tekrarSayisi++
            }
        }
        return tekrarSayisi
    }
}