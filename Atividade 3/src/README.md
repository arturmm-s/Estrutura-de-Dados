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

---

# Resultados obtidos

## Vetor de 10 elementos

### Vetor Aleatório

| Algoritmo | Comparações | Movimentações |
|---|---:|---:|
| Bubble Sort | 45 | 24 |
| Insertion Sort | 33 | 33 |
| Selection Sort | 45 | 9 |
| Quick Sort | 23 | 20 |

### Vetor Ordenado

| Algoritmo | Comparações | Movimentações |
|---|---:|---:|
| Bubble Sort | 45 | 0 |
| Insertion Sort | 9 | 9 |
| Selection Sort | 45 | 9 |
| Quick Sort | 45 | 54 |

### Vetor Inverso

| Algoritmo | Comparações | Movimentações |
|---|---:|---:|
| Bubble Sort | 45 | 44 |
| Insertion Sort | 53 | 53 |
| Selection Sort | 45 | 9 |
| Quick Sort | 40 | 25 |

## Vetor de 20 elementos

### Vetor Aleatório

| Algoritmo | Comparações | Movimentações |
|---|---:|---:|
| Bubble Sort | 190 | 78 |
| Insertion Sort | 97 | 97 |
| Selection Sort | 190 | 19 |
| Quick Sort | 58 | 40 |

### Vetor Ordenado

| Algoritmo | Comparações | Movimentações |
|---|---:|---:|
| Bubble Sort | 190 | 0 |
| Insertion Sort | 19 | 19 |
| Selection Sort | 190 | 19 |
| Quick Sort | 190 | 209 |

### Vetor Inverso

| Algoritmo | Comparações | Movimentações |
|---|---:|---:|
| Bubble Sort | 190 | 190 |
| Insertion Sort | 209 | 209 |
| Selection Sort | 190 | 19 |
| Quick Sort | 190 | 109 |

## Vetor de 1.000 elementos

### Vetor Aleatório

| Algoritmo | Comparações | Movimentações |
|---|---:|---:|
| Bubble Sort | 499500 | 248004 |
| Insertion Sort | 249003 | 249003 |
| Selection Sort | 499500 | 999 |
| Quick Sort | 11471 | 6312 |

### Vetor Ordenado

| Algoritmo | Comparações | Movimentações |
|---|---:|---:|
| Bubble Sort | 499500 | 0 |
| Insertion Sort | 999 | 999 |
| Selection Sort | 499500 | 999 |
| Quick Sort | 302723 | 302903 |

### Vetor Inverso

| Algoritmo | Comparações | Movimentações |
|---|---:|---:|
| Bubble Sort | 499500 | 498999 |
| Insertion Sort | 499998 | 499998 |
| Selection Sort | 499500 | 999 |
| Quick Sort | 383944 | 192344 |

# Análise dos Resultados

### a) Qual algoritmo realizou o menor número de comparações para 10 elementos?

No vetor aleatório, o Quick Sort teve apenas 23 comparações.

### b) Qual algoritmo realizou menos trocas ou movimentações?

Para 10 elementos aleatórios, o Selection Sort teve apenas 9 movimentações.

### c) O comportamento observado para 10 elementos permaneceu semelhante quando o tamanho aumentou para 20?

O padrão se manteve, o Quick Sort continuou com menos comparações (58) e o Selection Sort com menos movimentações (19).

### d) O que aconteceu com a quantidade de operações quando o vetor passou para 1.000 elementos?

A quantidade de operações cresceu drasticamente. O Quick Sort, por outro lado, manteve um crescimento muito menor, destacando sua eficiência ao trabalhar com grandes volumes de dados.

### e) Bubble Sort, Insertion Sort e Selection Sort apresentam complexidade O(n²) em situações típicas estudadas. Eles apresentaram exatamente a mesma quantidade de operações? Explique utilizando seus resultados.

Embora apresentem a mesma ordem de complexidade, os resultados mostram diferenças: O Insertion Sort faz menos comparações em vetores parcialmente ordenados; O Selection Sort faz menos movimentações; O Bubble Sort é o mais "sensível" a desordem inicial.

### f) Qual algoritmo apresentou maior crescimento no número de operações?

O Bubble Sort apresentou o maior aumento, chegando a quase meio milhão de comparações e movimentações para 1000 elementos.

### g) Como o comportamento experimental do Quick Sort se diferenciou dos demais algoritmos?

O Quick Sort se destacou por realizar muito menos comparações e movimentações em vetores aleatórios. Porém, em vetores ordenados ou inversos, seu desempenho piorou.

### h) Os resultados encontrados são coerentes com as complexidades teóricas estudadas?

Sim, os resultados são coerentes, pois com o Bubble, Insertion e Selection ocorre o crescimento quadrático, e o Quick Sort piora em casos extremos.

### i) Se você fosse responsável pelo sistema da central de distribuição e precisasse ordenar milhares de pedidos, qual dos quatro algoritmos escolheria? Justifique utilizando os resultados do experimento.

O Quick Sort é a melhor escolha para o sistema da central de distribuição. Ele apresentou o menor número de operações para grandes volumes de dados aleatórios, o que representa o cenário real de pedidos chegando em ordem imprevisível.

## Desafio Adicional

### 1) A organização inicial dos dados interfere na quantidade de operações realizadas por todos os algoritmos da mesma maneira?

A organização inicial dos dados não afeta todos os algoritmos da mesma maneira. Insertion Sort melhora muito com dados ordenados. Bubble Sort melhora um pouco, mas ainda faz muitas comparações. Quick Sort piora em vetores ordenados ou inversos. Selection Sort quase não muda nada.
