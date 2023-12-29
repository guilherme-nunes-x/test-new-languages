/*funções em Kotlin(atenção o codigo ira da varios erros de compilação caso vc use eles
(vc deve retirar um dos exemplos e criar outro documento com codigo individual)) 
estrutura da função fun nome_da_variavel(){

}
*/
fun main() {
    kotlin()
    }
    fun kotlin(){
        var kotlin = "🙂"
        println(kotlin)
        kotlin = "hello word"
        println(kotlin)
    }
/*em caso de retorno de resultado vc deve seguir essa estrutura
estrutura da função fun nome_da_variavel():tipo_retorno{

}
tipos de retorno possiveis 
=> Unit(similar ao void em c e java)
*/
fun main() {
    kotlin()
    }
    fun kotlin():Unit{
        var kotlin = "eu utilizo kotlin a 2 anos"
        println(kotlin)
        var dev = "meu nome é guilherme"
        println(kotlin)
    }
/*Outra possibilidade os resultados foram armazenados em uma variavel */
fun main() {
    var retorno = kotlin()
    println(retorno)
    }
    fun kotlin():String{
        var kotlin = "eu utilizo kotlin a 2 anos"
        var dev = "meu nome é guilherme"
        return "$kotlin\n$dev"
    }

//entregou o mesmo resultado só que sem armazena nada na variavel
    fun main() {
        println(kotlin())
        }
        fun kotlin():String{
            var kotlin = "eu utilizo kotlin a 2 anos"
            var dev = "meu nome é guilherme"
            return "$kotlin\n$dev"
        }
/*A função para determinar valores ficaria assim:
fun name(parametros){
    body
} */
fun main() {
    println(kotlin("steve"))
    }
    fun kotlin(name:String):String{
        var kotlin = "eu utilizo kotlin a 2 anos"
        var dev = "e meu nome é $name"
        return "$kotlin\n$dev"
    }
/*a função pode ser reutilizada */
fun main() {
    println(kotlin("steve"))
    println(kotlin("jonh"))
    }
    fun kotlin(name:String):String{
        return "eu utilizo kotlin a 3 anos\n e meu nome é $name"
    }
/*utilizando mais parametros */
fun main() {
    println(kotlin("steve", 5))
    println(kotlin("jonh", 6))
    }
    fun kotlin(name:String, age:Int):String{
        return "eu utilizo kotlin a $age anos\n e meu nome é $name"
    }
/* outras formas de determinar as entradas
nesse caso mesmo que vc altere a ordem das entradas elas continuam as mesma*/
fun main() {
    println(kotlin("steve", 5))
    println(kotlin(age = 6, name = "jonh"))
    }
    fun kotlin(name:String, age:Int):String{
        return "eu utilizo kotlin a $age anos\n e meu nome é $name"
    }
    /*determinando o valor dentro dos parametros */
    fun main() {
        println(kotlin("steve", 5))
        println(kotlin(age = 6))
        }
        fun kotlin(name:String = "fernando", age:Int):String{
            return "eu utilizo kotlin a $age anos\n e meu nome é $name"
        }