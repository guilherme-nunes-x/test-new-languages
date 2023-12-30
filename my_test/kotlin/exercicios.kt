/*questões de finalização do curso(atenção o codigo ira da varios erros de compilação caso vc use eles
(vc deve retirar um dos exemplos e criar outro documento com codigo individual))
*/
//1 faça quatro linhas com essas mensagens
fun main(){
println("Use the val keyword when the value doesn't change.")
println("Use the var keyword when the value can change.")
println("When you define a function, you define the parameters that can be passed to it.")
println("When you call a function, you pass arguments for the parameters.")
}
//2-corrija o codigo abaixo
/*  
fun main() {
    println("New chat message from a friend'}
} */
fun main() {
    println("New chat message from a friend")
} 

//3-corrija esse codigo
/*
fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}
*/
fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}
//4-corrija esse codigo
/*
fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
}*/
fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
//5-corrija esse codigo
/*
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}*/
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
//6-corrija esse codigo
/*
fun main() {
    val firstNumber = 10
    val secondNumber = 5

    println("$firstNumber + $secondNumber = $result")
}*/
fun main() {
    val firstNumber = 10
    val secondNumber = 5
	var result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}
//7-crie uma função para esse mesmo codigo com mais variavei e crie mais uma variavel
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    var result = add(firstNumber, secondNumber)
    var anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    
    result = subtract(firstNumber, secondNumber)
    
    anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun add(valor1:Int, valor2:Int):Int{
    return valor1 + valor2
}
fun subtract(valor1:Int, valor2:Int):Int{
    return valor1 - valor2
    
}
//8-a-crie uma função  que imprima uma mensagem
fun main(){
    println(displayAlertMessage("Chrome OS","sample@gmail.com"))
    }
    fun displayAlertMessage(operatingSystem:String, emailId:String):String{
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
    }
//9-a-modifique a variavel anterior para que em caso de não fornecerem o sistema operacional apareça alguma resposta
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}
fun displayAlertMessage(operatingSystem:String = "Unknown OS", emailId:String):String{
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
    }

//9-correção de nome de variaveis
fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsTOcalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsTOcalories(numberOFStepS: Int): Double {
    val caloriesBURNEDforEachStep = 0.04
    val totalCALORIESburned = numberOFStepS * caloriesBURNEDforEachStep
    return totalCALORIESburned
}
//10 - crie uma função que compare se dois numeros são iguais
fun main() {
    println(test(10, 10))
    println(test(20, 10))
    println(test(20, 20))
    }
    
    fun test(valor1: Int, valor2: Int): Boolean {
        val teste: Boolean = valor1 > valor2
        return teste
    }
//11-crie um codigo com uma função para não haver necessidade de repetição de codigo
fun main() {
    println(analise("Ankara", 27, 31, 82))
    println(analise("Tokyo", 32, 36, 10))
    println(analise("Cape Town", 59, 64, 2))
    println(analise("Guatemala City", 50, 55, 7))
}
fun analise(city:String, lowTemperature:Int, highTemperature:Int, chance:Int):String{
    return "City: $city\nLow temperature: $lowTemperature, High temperature: $highTemperature\nChance of rain: $chance\n"
}
