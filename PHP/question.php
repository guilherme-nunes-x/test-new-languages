<?php
//1) - Crie um algoritmo que receba um número digitado pelo usuário e verifique se esse valor é positivo, negativo ou igual a zero.
// A saída deve ser: "Valor Positivo", "Valor Negativo" ou "Igual a Zero".
$val = 0;
$resposta = "";
if($val>0):
    
    $resposta = "o valor é possitivo";

                elseif($val<0):
  
                    $resposta = "o valor é negativo";
else:

    $resposta = "o valor é igual a zero";
endif;

echo $resposta ;