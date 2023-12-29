/*Segunda aula do curso basico kotlin */
fun main() {
    
    val count: Int = 100
    
    var count2 = 50
    
    println("os valores usados no calculo foram $count e $count2")
    println("sua soma é igual ${count + count2}")
    println("sua divisão é igual ${count / count2}")
    println("sua subtração é igual ${count - count2}")
    println("sua multiplicação é igual ${count * count2}")
    
    println("  ")
    count2 = 25
    count2++
    
    println("os valores usados no calculo foram $count e $count2")
    println("sua soma é igual ${count + count2}")
    println("sua divisão é igual ${count / count2}")
    println("sua subtração é igual ${count - count2}")
    println("sua multiplicação é igual ${count * count2}")

    println("  ")
    val xr: int = count + count
    println(xr)

    val text1: String = "hello,"
    val text2: String = " World!"
    val yr: String = text1 + text2
    println(yr)
}
/*
as variaveis em kotlin sempre começão "val name: tipo de dado = dado"
os tipos de dados
Int Float Double String Boolean
Não é obrigatorio vc determinar o tipo de dado da variavel
ex:(    val count = 2.0
        val count2 = 3.0)
metodo de calculo facilitado pode ser ex:(${nome da primeira variavel + nome da segunda variavel})

val = valor continuo
var = valor pode ser alterado
*/