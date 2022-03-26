package mx.edu.ittepic.ladm_u2_practica2_loteria_lilianagonzalez

class Hilo(arreglo:Array<Carta>,este:MainActivity):Thread() {
    var este = este
    var arreglo = arreglo
    private var play = true
    private var pause = false

    override fun run() {
        super.run()
        var contador = 0
        var otrocontador = 0
        arreglo.shuffle()
        while(play){
            if(!pause){
                if (contador == arreglo.size-1){
                    stopHilo()
                }
                if(!este.faltantes){
                    este.faltantes =true
                    sleep(2000)
                }
                este.runOnUiThread {
                    arreglo[otrocontador++].cartaima()
                }
            }
            sleep(2000)
        }
    }
    fun stopHilo(){
        play = false
    }
    fun pauseHilo(){
        pause = true
    }
    fun continuarHilo(){
        pause = false
    }
}