# Comparação Experimental entre Bubble Sort e Quick Sort

## Objetivo

Este projeto tem como objetivo comparar experimentalmente o desempenho dos algoritmos de ordenação **Bubble Sort** e **Quick Sort**, analisando a quantidade de operações realizadas em diferentes tamanhos de arrays.

## Metodologia

Foram realizados testes utilizando conjuntos de dados com os seguintes tamanhos:

* 10 elementos
* 20 elementos
* 1.000 elementos

Para garantir uma comparação justa, os mesmos dados foram utilizados nos dois algoritmos em cada teste.

## Resultados Obtidos

### a) Qual algoritmo realizou menos operações para 10 elementos?

O **Quick Sort** realizou menos operações, embora a diferença seja pequena em arrays de tamanho reduzido.

### b) O comportamento permaneceu igual para 20 elementos?

Sim. O **Quick Sort** continuou apresentando um número menor de operações quando comparado ao Bubble Sort.

### c) O que aconteceu quando o tamanho aumentou para 1.000 elementos?

A diferença de desempenho tornou-se significativamente maior. O **Bubble Sort** passou a realizar uma quantidade muito elevada de comparações e trocas, enquanto o **Quick Sort** manteve um crescimento muito menor na quantidade de operações.

### d) Qual algoritmo apresentou maior crescimento da quantidade de operações?

O **Bubble Sort** apresentou o maior crescimento, tornando-se muito menos eficiente conforme o tamanho da entrada aumentou.

### e) Os resultados experimentais são coerentes com as complexidades teóricas estudadas?

Sim. Os resultados observados estão de acordo com a teoria:

* **Bubble Sort:** Complexidade de tempo **O(n²)**
* **Quick Sort:** Complexidade média de tempo **O(n log n)**

Isso explica por que a diferença de desempenho se torna cada vez mais evidente à medida que o tamanho do array aumenta.

### f) Em qual situação escolher o Bubble Sort?

O Bubble Sort pode ser utilizado em:

* Contextos educacionais para aprendizado de algoritmos;
* Exemplos simples de ordenação;
* Listas muito pequenas;
* Situações em que a simplicidade de implementação é mais importante do que a eficiência.

### g) Em qual situação escolher o Quick Sort?

O Quick Sort é recomendado para:

* Grandes volumes de dados;
* Aplicações que exigem alto desempenho;
* Sistemas onde a eficiência da ordenação é um requisito importante.

## Conclusão

Os testes demonstraram que o **Quick Sort** é significativamente mais eficiente do que o **Bubble Sort**, especialmente quando o volume de dados aumenta. Enquanto o Bubble Sort apresenta crescimento quadrático no número de operações, o Quick Sort mantém um comportamento muito mais escalável, tornando-se a escolha mais adequada para aplicações reais que manipulam grandes conjuntos de dados.
