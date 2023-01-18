# Projedata Iniflex

## Projeto desenvolvido na etapa de Teste Técnico para a empresa ProjeData

---

## Teste Prático

Considerando que uma indústria possui as pessoas/funcionários abaixo:

Diante disso, você deve desenvolver um projeto java, com os seguintes requisitos:

1– Classe ProjedataIniflex.Pessoa com os atributos: nome (String) e data nascimento (LocalDate).

2 – Classe Funcionário que estenda a classe ProjedataIniflex.Pessoa, com os atributos: salário (BigDecimal) e função (String).

3 – Deve conter uma classe ProjedataIniflex.Principal para executar as seguintes ações: <br>
3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima. <br>
3.2 – Remover o funcionário “João” da lista. <br>
3.3 – Imprimir todos os funcionários com todas suas informações, sendo que: <br>
• informação de data deve ser exibido no formato dd/mm/aaaa; <br>
• informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula. <br>
3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor. <br>
3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”. <br>
3.6 – Imprimir os funcionários, agrupados por função. <br> 
3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12. <br>
3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade. <br>
3.10 – Imprimir a lista de funcionários por ordem alfabética. <br>
3.11 – Imprimir o total dos salários dos funcionários. <br>
3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00. <br>

![Tabela de Funcionários](table.png)

---

## Passos para rodar o programa

* Download do arquivo ProjedataIniflex.jar dentro da pasta Target
* Abrir o cmd e ir até a pasta onde o arquivo foi salvo
* Executar o comando java -jar ProjedataIniflex.jar

```
C:\local\do\arquivo: java -jar ProjedataIniflex.jar
```

---

## Resultado rodado no programa

Lista dos funcionários: 

Nome: Maria  |  Data de Nascimento: 18/10/2000  |  Salário: 2.009,44  |  Função: Operador <br>
Nome: Caio  |  Data de Nascimento: 02/05/1961  |  Salário: 9.836,14  |  Função: Coordenador <br>
Nome: Miguel  |  Data de Nascimento: 14/10/1988  |  Salário: 19.119,88  |  Função: Diretor <br>
Nome: Alice  |  Data de Nascimento: 05/01/1995  |  Salário: 2.234,68  |  Função: Recepcionista <br>
Nome: Heitor  |  Data de Nascimento: 19/11/1999  |  Salário: 1.582,72  |  Função: Operador <br>
Nome: Arthur  |  Data de Nascimento: 31/03/1993  |  Salário: 4.071,84  |  Função: Contador <br>
Nome: Laura  |  Data de Nascimento: 08/07/1994  |  Salário: 3.017,45  |  Função: Gerente <br>
Nome: Heloísa  |  Data de Nascimento: 24/05/2003  |  Salário: 1.606,85  |  Função: Eletricista <br>
Nome: Helena  |  Data de Nascimento: 02/09/1996  |  Salário: 2.799,93  |  Função: Gerente <br>

________________________________________________________________

Lista dos funcionários ordenados por função: 

Operador: [Nome: Maria  |  Data de Nascimento: 18/10/2000  |  Salário: 2.210,38  |  Função: Operador, Nome: Heitor  |  Data de Nascimento: 19/11/1999  |  Salário: 1.740,99  |  Função: Operador]

Eletricista: [Nome: Heloísa  |  Data de Nascimento: 24/05/2003  |  Salário: 1.767,54  |  Função: Eletricista]

Recepcionista: [Nome: Alice  |  Data de Nascimento: 05/01/1995  |  Salário: 2.458,15  |  Função: Recepcionista]

Diretor: [Nome: Miguel  |  Data de Nascimento: 14/10/1988  |  Salário: 21.031,87  |  Função: Diretor]

Gerente: [Nome: Laura  |  Data de Nascimento: 08/07/1994  |  Salário: 3.319,20  |  Função: Gerente, Nome: Helena  |  Data de Nascimento: 02/09/1996  |  Salário: 3.079,92  |  Função: Gerente]

Coordenador: [Nome: Caio  |  Data de Nascimento: 02/05/1961  |  Salário: 10.819,75  |  Função: Coordenador]

Contador: [Nome: Arthur  |  Data de Nascimento: 31/03/1993  |  Salário: 4.479,02  |  Função: Contador]

________________________________________________________________

Lista dos funcionários com mês de aniversário 10 e 12: 

Nome: Maria  |  Data de Nascimento: 18/10/2000  |  Salário: 2.210,38  |  Função: Operador <br>
Nome: Miguel  |  Data de Nascimento: 14/10/1988  |  Salário: 21.031,87  |  Função: Diretor <br>

________________________________________________________________

Lista dos funcionários ordenados em ordem alfabética: 

Nome: Alice  |  Data de Nascimento: 05/01/1995  |  Salário: 2.458,15  |  Função: Recepcionista <br>
Nome: Arthur  |  Data de Nascimento: 31/03/1993  |  Salário: 4.479,02  |  Função: Contador <br>
Nome: Caio  |  Data de Nascimento: 02/05/1961  |  Salário: 10.819,75  |  Função: Coordenador <br>
Nome: Heitor  |  Data de Nascimento: 19/11/1999  |  Salário: 1.740,99  |  Função: Operador <br>
Nome: Helena  |  Data de Nascimento: 02/09/1996  |  Salário: 3.079,92  |  Função: Gerente <br>
Nome: Heloísa  |  Data de Nascimento: 24/05/2003  |  Salário: 1.767,54  |  Função: Eletricista <br>
Nome: Laura  |  Data de Nascimento: 08/07/1994  |  Salário: 3.319,20  |  Função: Gerente <br>
Nome: Maria  |  Data de Nascimento: 18/10/2000  |  Salário: 2.210,38  |  Função: Operador <br>
Nome: Miguel  |  Data de Nascimento: 14/10/1988  |  Salário: 21.031,87  |  Função: Diretor <br>

________________________________________________________________

A soma de todos os salários dos funcionários é: R$50.906,82

________________________________________________________________

Quantidade de salários mínimos:

Alice: 2.03 <br>
Arthur: 3.70 <br>
Caio: 8.93 <br>
Heitor: 1.44 <br>
Helena: 2.54 <br>
Heloísa: 1.46 <br>
Laura: 2.74 <br>
Maria: 1.82 <br>
Miguel: 17.35 <br>

Process finished with exit code 0