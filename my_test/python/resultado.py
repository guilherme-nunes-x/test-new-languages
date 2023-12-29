#atividade de fisica em python para atividades recriativas
magua = float(input("Digite a massa da agua em quilos:"))
cagua = float(input("Digite o calor especifico da agua:"))
variacao = float(input("Digite a variacao de temperatura:"))

kcal = magua*cagua*variacao

print("A quantidade de calor retirado da agua deve ser de: " + str(kcal) +"kcal" )