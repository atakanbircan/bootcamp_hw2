package com.myapplication.odevdosyasi.faktoriyel_hesabi

class Faktoriyel(var parametre: Int) {

    fun faktoriyelHesap():Long{
        var degisenCarpim = 1
        if (parametre ==0 ){
            degisenCarpim = 1
        }else{
            for (i in 1..parametre){
                degisenCarpim*=i
            }
        }
        return degisenCarpim.toLong()

    }
}