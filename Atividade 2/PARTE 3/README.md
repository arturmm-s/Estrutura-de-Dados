# PARTE 3 - Investigação de Busca Sequencial em Matrizes

## Objetivo

Este projeto tem como objetivo implementar e analisar um algoritmo de **busca sequencial em matrizes utilizando loops aninhados**, avaliando o comportamento da busca em diferentes tamanhos de matrizes e situações de procura.

O algoritmo deve informar:

* Se o valor foi encontrado;
* Linha em que foi encontrado;
* Coluna em que foi encontrado;
* Quantidade de comparações realizadas.

---

## Metodologia

Foram realizados experimentos com as seguintes matrizes:

* Matriz 2 × 2 (4 elementos)
* Matriz 10 × 10 (100 elementos)
* Matriz 100 × 100 (10.000 elementos)

Para cada matriz foram analisados três cenários:

1. Valor localizado no início da matriz;
2. Valor localizado próximo ao final da matriz;
3. Valor inexistente na matriz.

---

## Resultados Obtidos

| Matriz    | Nº de Elementos | Busca no Início (linha, coluna, comparações) | Busca no Final (linha, coluna, comparações) | Valor Inexistente (linha, coluna, comparações) |
| --------- | --------------- | -------------------------------------------- | ------------------------------------------- | ---------------------------------------------- |
| 2 × 2     | 4               | (0, 0, 1)                                    | (1, 1, 4)                                   | (-1, -1, 4)                                    |
| 10 × 10   | 100             | (0, 0, 1)                                    | (9, 9, 100)                                 | (-1, -1, 100)                                  |
| 100 × 100 | 10.000          | (0, 0, 1)                                    | (99, 99, 10.000)                            | (-1, -1, 10.000)                               |

---

## 📝 Análise dos Resultados

### a) Por que encontrar um elemento no início exige menos operações?

A busca sequencial verifica os elementos um a um. Quando o valor procurado está na primeira posição da matriz, ele é encontrado imediatamente, exigindo apenas uma comparação.

---

### b) O que acontece quando o elemento procurado não existe?

Quando o valor não está presente na matriz, o algoritmo precisa percorrer todas as posições para garantir que ele realmente não existe. Dessa forma, ocorre o número máximo de comparações possível.

---

### c) Qual é o pior caso da busca sequencial?

O pior caso acontece quando:

* O elemento está na última posição da matriz; ou
* O elemento não existe na matriz.

Nessas situações, todos os elementos precisam ser examinados.

---

### d) Como o aumento das dimensões da matriz influencia a quantidade de operações?

À medida que a matriz cresce, aumenta também o número total de posições que podem precisar ser verificadas. Consequentemente, a quantidade de comparações cresce proporcionalmente ao tamanho da matriz.

---

### e) Qual é a complexidade da busca sequencial em uma matriz com m linhas e n colunas?

A complexidade de tempo é:

**O(m × n)**

pois, no pior caso, o algoritmo precisa percorrer todas as posições da matriz, analisando cada elemento uma única vez.

---

## Conclusão

Os experimentos demonstraram que o desempenho da busca sequencial depende diretamente da posição do elemento procurado.

* Quando o valor está no início, o custo é mínimo.
* Quando está no final ou não existe, o custo é máximo.
* O crescimento do número de comparações acompanha o aumento do tamanho da matriz.

Esses resultados confirmam o comportamento esperado da busca sequencial e sua complexidade teórica de **O(m × n)**.


