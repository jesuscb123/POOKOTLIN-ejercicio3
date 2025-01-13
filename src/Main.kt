
/*
Actualizar el ejercicio 4.2 para añadir a la clase Persona el siguiente comportamiento:
Debe retornar un saludo con su nombre... saludar():String Debe retornar si altura por encima de la media (solo si altura >= 1.75)... alturaEncimaMedia():Boolean Debe retornar si peso por encima de la media (solo si peso >= 70)... pesoEncimaMedia():Boolean Sería conveniente añadir también un método obtenerDescImc() para usar en obtenerDesc(), que implemente el retorno de la descripción del rango de tipo de imc al que equivale su cálculo. Nota: (Mejora: Enum class en https://www.baeldung.com/kotlin/enum)

Si el IMC es menos de 18.5, se encuentra dentro del rango de "peso insuficiente".

Si el IMC está entre 18.5 y 24.9, se encuentra dentro del rango de "peso saludable".

Si el IMC está entre 25.0 y 29.9, se encuentra dentro del rango de "sobrepeso".

Si el IMC es 30.0 o superior, se encuentra dentro del rango de "obesidad".

Debe implementar también un método que muestre una descripción completa de la persona... obtenerDesc():String. Por ejemplo, este método mostrará por pantalla algo así:

"Julia con una altura de 1.72m (Por debajo de la media) y un peso 64.7kg (Por encima de la media) tiene un IMC de 21,87 (peso saludable)".

2.Crear en el main() una estructura de datos con 4 o 5 personas más, recorrer la estructura y por cada persona debe saludar y mostrar su descripción completa.

Finalmente, revisa el IDE e intenta actualizar el modificador de visibilidad de los métodos de tu clase cómo os estará indicando... veréis que los métodos que realmente no van a ser llamados desde fuera de la clase te recomienda que sean privados a la misma. De esta manera estamos encapsulando estos métodos para que se puedan utilizar solo desde dentro de la clase y no sean públicos.
 */

 fun mostrar_personas(lista_personas: MutableList<Persona>){
     for(persona in lista_personas){
         println("${persona.saludar()}, $persona")
    }

}

fun mostrar_error(msj: String){
    println(msj)
}

fun comprobar_nombre_correcto(nombre: String): Boolean{
    if(nombre == ""){
        return false
    }
    return true
}

fun pedir_nombre(msj: String): String{
    var nombre_correcto = false
    var nombre = ""
    while(!nombre_correcto){
        try {
            println(msj)
            nombre = readln()
            if(!comprobar_nombre_correcto(nombre)) {
                throw IllegalArgumentException("**Error** el nombre no puede estar vacío.")
            }else{
                nombre_correcto = true
            }

        }catch(e: IllegalArgumentException){
            mostrar_error("$e")
        }
    }
    return nombre
}

/*
fun modificar_propiedades(persona1: Persona,persona2: Persona,persona3: Persona){
    persona1.nombre = pedir_nombre("Introduce un nombre para la persona1, no puede estar vacío.")
    persona3.altura = 1.90F
    persona2.altura = persona3.altura
}
*/

fun main(){
    var lista_personas = mutableListOf<Persona>()
    lista_personas.add(Persona(peso = 55F, altura = 1.20F))
    lista_personas.add(Persona(nombre = "Juan", peso = 70F, altura = 1.75F))
    lista_personas.add(Persona(nombre = "María", peso = 90F, altura = 1.80F))
    lista_personas.add(Persona(nombre = "kiro", peso = 50F, altura = 1.50F))
    lista_personas.add(Persona(nombre = "Jesulito", peso = 35F, altura = 1.70F))
    lista_personas.add(Persona(nombre = "José", peso = 40F, altura = 1.80F))

    
    mostrar_personas(lista_personas)




}