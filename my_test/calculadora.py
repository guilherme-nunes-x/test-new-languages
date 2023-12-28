valor1 =  float(input("digite o primeiro valor"))
valor2 =  float(input("digite o segundo valor"))
simbolo = (input("escolha o tipo de operação"))

if simbolo == "+":
    resultado =  valor1 + valor2 
elif simbolo == "-":
    resultado = valor1 - valor2
elif simbolo == "/":
    resultado = valor1/valor2
elif simbolo == "*":
    resultado = valor1 * valor2

print("o seu resultado foi "+ str(resultado))
