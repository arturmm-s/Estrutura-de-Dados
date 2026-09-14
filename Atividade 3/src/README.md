# Central de Distribuição de Pedidos — Comparação de Algoritmos

## Sobre a atividade

Esta atividade propõe a realização de um experimento computacional para analisar e comparar o comportamento de diferentes algoritmos de ordenação.

Em uma central de distribuição, os pedidos recebidos possuem códigos numéricos de prioridade e precisam ser organizados em ordem crescente antes de serem encaminhados para as etapas de separação e expedição.

Para simular esse cenário, serão utilizados vetores contendo números aleatórios, que serão ordenados por quatro diferentes algoritmos:

* **Bubble Sort**
* **Insertion Sort**
* **Selection Sort**
* **Quick Sort**

O objetivo principal é observar como cada algoritmo se comporta conforme aumenta a quantidade de elementos a serem processados.

## Objetivos

* Comparar diferentes algoritmos de ordenação;
* Contabilizar o número de **comparações** realizadas por cada algoritmo;
* Contabilizar o número de **trocas ou movimentações** de elementos;
* Analisar o crescimento da quantidade de operações conforme o tamanho do vetor aumenta;
* Comparar os resultados experimentais com as complexidades teóricas dos algoritmos;
* Identificar qual algoritmo apresenta melhor comportamento para grandes quantidades de dados.

## Experimentos

Os algoritmos serão testados utilizando vetores com:

* **10 elementos**
* **20 elementos**
* **1.000 elementos**

Para garantir uma comparação justa, em cada experimento será gerado um único vetor de números aleatórios. A partir dele, serão criadas cópias idênticas para cada algoritmo, garantindo que todos recebam exatamente os mesmos dados iniciais.

Durante a execução, serão registradas:

* Quantidade de comparações;
* Quantidade de trocas ou movimentações.

Os resultados serão organizados e comparados para verificar as diferenças de desempenho entre os algoritmos.

## Análise

Após a execução dos experimentos, os resultados serão utilizados para analisar questões como:

* Qual algoritmo realiza menos comparações em vetores pequenos;
* Qual apresenta menor quantidade de trocas ou movimentações;
* Como o comportamento muda ao aumentar a quantidade de elementos;
* Qual algoritmo apresenta maior crescimento no número de operações;
* Como o Quick Sort se diferencia dos demais algoritmos;
* Se os resultados observados são compatíveis com as complexidades teóricas estudadas.

Também será analisada a diferença entre algoritmos que possuem complexidade **O(n²)** em situações típicas, verificando se eles realmente realizam a mesma quantidade de operações na prática.

## Desafio adicional

Como complemento, o experimento poderá ser repetido utilizando diferentes organizações iniciais dos dados:

* Vetor com elementos aleatórios;
* Vetor já ordenado;
* Vetor em ordem inversa.

A partir desses testes, será analisado se a organização inicial dos elementos interfere na quantidade de comparações e movimentações realizadas pelos algoritmos e se essa influência ocorre da mesma maneira para todos eles.

## Conclusão esperada

Ao final da atividade, espera-se compreender, por meio de resultados experimentais, como diferentes algoritmos de ordenação se comportam diante de diferentes quantidades e organizações de dados, relacionando os resultados obtidos na prática com os conceitos de complexidade de algoritmos estudados em aula.
