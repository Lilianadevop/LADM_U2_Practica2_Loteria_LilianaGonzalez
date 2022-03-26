package mx.edu.ittepic.ladm_u2_practica2_loteria_lilianagonzalez

import android.widget.ImageView
import kotlin.random.Random

class Carta(idCarta:Int,carta:ImageView,este:MainActivity) {
    var idCarta = idCarta
    var carta =  carta
    //var voz = voz
    val este = este



    private fun rand(hasta:Int): Float{
        return Random.nextInt(hasta).toFloat()
    }

    fun cartaima(){
        este.runOnUiThread {
           carta.setImageResource(idCarta)
        }
    }

}