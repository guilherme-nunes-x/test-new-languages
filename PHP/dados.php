<?php
//escalares
//int
$numero = 12;
var_dump($numero);
if(is_int($numero)):
    echo "é um int";
else:
    echo"não é um int";
endif;

print "<br>";
//strings
$local = "maranhão";
var_dump($local);
if(is_string($local)):
    echo "é uma string";
else:
    echo"não é uma string";
endif;

print "<br>";
//float
$largura = 12.4;
var_dump($largura);
if(is_float($largura)):
    echo"e um float";
else:
    echo"não é float";
endif;
//boolear
$sonho = true;
var_dump($sonho);
if(is_bool($sonho)):
    echo"é um booleano";
else:
    echo"não é um booleano";
endif;

//compostos
echo"<hr>";
//array
$conjunto = array("oi",2,2.3,false);
var_dump($conjunto);
if(is_array($conjunto)):
    echo"é um array";
else:
    echo"não é um array";
endif;
echo"<br>";
//class
class aluno{
public $nome;
    public function atribuirnome($nome){
        $this->$nome=$nome;
    }
}
$aluno = new aluno();
$aluno->atribuirnome("roberto");
var_dump($aluno);
if(is_object($aluno)):
    echo"é um objeto";
else:
    echo"não é um objeto";
endif;

//especiais
echo"<hr>";
//null
$douto = null;
var_dump($douto);