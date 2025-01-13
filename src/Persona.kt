import kotlin.math.pow

class Persona(var peso: Float, var altura: Float) {
    var nombre: String = ""
    constructor(nombre: String, peso: Float, altura: Float) : this(peso,altura){
        this.nombre = nombre
    }

    fun saludar():String{
        return "Hola mi nombre es ${this.nombre}"
    }
    fun calcular_imc(): Float{
        val imc = peso / altura.pow(2)
        return imc
    }

   fun peso_encima_media(): String{
        if(peso >= 70F){
            return "Por encima de la media"
        }else{
            return "Por debajo de la media"
        }
   }

    fun altura_encima_media(): String{
        if(altura >= 1.75F){
            return "Por encima de la media"
        }else{
            return "Por debajo de la media"
        }
    }


    fun obtenerdescimc(imc: Float): String{
        if(imc < 18.5F){
            return "peso insuficiente"
        }else if(imc > 18.5F && imc <24.9F){
            return "peso saludable"
        }else if(imc > 25.0F && imc < 29.9F) {
            return "sobrepeso"
        }else{
            return "obesidad"
        }
    }

    fun obtenerdesc(): String{
        val altura_encima_media = altura_encima_media()
        val peso_encima_media = peso_encima_media()
        val imc = calcular_imc()
        val descimc = obtenerdescimc(imc)
        return "con una altura de $altura($altura_encima_media) y un peso de $peso($peso_encima_media) tiene un IMC de $imc ($descimc)"
    }

    override fun toString(): String {
        return obtenerdesc()
    }
}
