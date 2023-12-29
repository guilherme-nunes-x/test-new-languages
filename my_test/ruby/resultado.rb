#questão de fisica em linguagem ruby
puts"Digite a massa da agua em quilos:"
massa = gets.chomp.to_f
puts"Digite o calor especifico da agua:"
calor = gets.chomp.to_f
puts "Digite a variacao de temperatura:"
temperatura = gets.chomp.to_f


delta = calor.to_f * temperatura.to_f

resultado = delta.to_f * massa.to_f

print "A quantidade de calor retirado da agua deve ser de: #{resultado}kcal "

if resultado > 100.0 
    puts " o resultado é acima da media"
elsif resultado < 100.0
    puts " o resultado é inferior a media"
else 
    puts " O resultado é igual a media"
end    