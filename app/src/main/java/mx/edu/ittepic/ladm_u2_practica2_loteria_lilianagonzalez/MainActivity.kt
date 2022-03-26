package mx.edu.ittepic.ladm_u2_practica2_loteria_lilianagonzalez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import mx.edu.ittepic.ladm_u2_practica2_loteria_lilianagonzalez.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var cont = 0
    var faltantes = true
    lateinit var  hiloejecutar : Hilo
    var c1 = R.drawable.c1elgallo
    var c2 = R.drawable.c2eldiablo
    var c3 = R.drawable.c3ladama
    var c4 = R.drawable.c4elcatrin
    var c5 = R.drawable.c5elparaguas
    var c6 = R.drawable.c6lasirena
    var c7 = R.drawable.c7laescalera
    var c8 = R.drawable.c8labotella
    var c9 = R.drawable.c9elbarril
    var c10 = R.drawable.c10elarbol
    var c11 = R.drawable.c11elmelon
    var c12 = R.drawable.c12elvaliente
    var c13 = R.drawable.c13elgorrito
    var c14 = R.drawable.c14lamuerte
    var c15 = R.drawable.c15lapera
    var c16 = R.drawable.c16labandera
    var c17 = R.drawable.c17elbandolon
    var c18 = R.drawable.c18elvioloncello
    var c19 = R.drawable.c19lagarza
    var c20 = R.drawable.c20elpajaro
    var c21 = R.drawable.c21lamano
    var c22 = R.drawable.c22labota
    var c23 = R.drawable.c23laluna
    var c24 = R.drawable.c24elcotorro
    var c25 = R.drawable.c25elborracho
    var c26 = R.drawable.c26elnegrito
    var c27 = R.drawable.c27elcorazon
    var c28 = R.drawable.c28lasandia
    var c29 = R.drawable.c29eltambor
    var c30 = R.drawable.c30elcamaron
    var c31 = R.drawable.c31lasjaras
    var c32 = R.drawable.c32elmusico
    var c33 = R.drawable.c33laarana
    var c34 = R.drawable.c34elsoldado
    var c35 = R.drawable.c35laestrella
    var c36 = R.drawable.c36elcazo
    var c37 = R.drawable.c37elmundo
    var c38 = R.drawable.c38elapache
    var c39 = R.drawable.c39elnopal
    var c40 = R.drawable.c40elalacran
    var c41 = R.drawable.c41larosa
    var c42 = R.drawable.c42lacalavera
    var c43 = R.drawable.c43lacampana
    var c44 = R.drawable.c44elcantarito
    var c45 = R.drawable.c45elvenado
    var c46 = R.drawable.c46elsol
    var c47 = R.drawable.c47lacorona
    var c48 = R.drawable.c48lachalupa
    var c49 = R.drawable.c49elpino
    var c50 = R.drawable.c50elpescado
    var c51 = R.drawable.c51lapalma
    var c52 = R.drawable.c52lamaceta
    var c53 = R.drawable.c53elarpa
    var c54 = R.drawable.c54larana


    // ----- array de cartas
    var mazo = arrayOf(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,
    c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54)
    // array de audios
    /**/
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnpause.visibility = View.GONE
        binding.sobracartas.visibility = View.GONE
        
        val todas = Array<Carta>(54,{Carta(R.drawable.c1elgallo,binding.imagencarta,this)})

        corrutine(todas,this).start()
        hiloejecutar = Hilo(todas,this)

        binding.btnplay.setOnClickListener {
            if (cont>0){
                hiloejecutar.stopHilo()
                hiloejecutar = Hilo(todas,this)
                hiloejecutar.start()
            }else{
                hiloejecutar.start()
                cont++
            }
            binding.btnpause.visibility = View.VISIBLE
            binding.btnplay.visibility = View.GONE
        }

        binding.btnpause.setOnClickListener {
            hiloejecutar.pauseHilo()
            binding.sobracartas.visibility = View.VISIBLE
            binding.btnplay.setImageResource(R.drawable.btnrefresh40) // mandar imagen de reinicio
            binding.btnplay.visibility = View.VISIBLE
        }
        binding.sobracartas.setOnClickListener {
            faltantes=false
            hiloejecutar.continuarHilo()
        }
    }
// -------------- COROUTINE
    fun corrutine(arreglo:Array<Carta>,este:MainActivity) = GlobalScope.launch{
        var este = este
        var arreglo = arreglo
       /* for (a..0){
            mazo[]
}*/
    }
}
