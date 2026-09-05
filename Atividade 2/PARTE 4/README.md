# PARTE 4 - Investigação de Array de Temperaturas

## Objetivo

Este projeto tem como objetivo praticar a manipulação de arrays em C++, realizando operações de análise sobre um conjunto de temperaturas armazenadas em um vetor.

O programa utiliza o seguinte array:

```cpp
float temperatura[10];
```

---

## Funcionalidades

O programa deve:

1. Receber 10 temperaturas digitadas pelo usuário;
2. Exibir todos os valores armazenados;
3. Calcular a média das temperaturas;
4. Identificar o maior valor;
5. Identificar o menor valor;
6. Informar o índice do maior valor;
7. Informar o índice do menor valor;
8. Contar quantas temperaturas estão acima da média.

---

## Quantidade Aproximada de Operações

Considerando apenas as passagens pelo array:

| Operação                                     | Quantidade Aproximada |
| -------------------------------------------- | --------------------- |
| Leitura dos 10 valores                       | 10                    |
| Exibição, soma, busca do maior e menor valor | 10                    |
| Contagem dos valores acima da média          | 10                    |
| **Total aproximado**                         | **30 operações**      |

---

## Análise de Complexidade

A complexidade do algoritmo é:

**O(n)**

Isso ocorre porque o número de operações cresce proporcionalmente à quantidade de elementos armazenados no array.

Mesmo que existam várias tarefas (leitura, exibição, cálculo da média e contagem), cada uma percorre o vetor apenas uma vez. Portanto, o crescimento total continua sendo linear.

---

## Conclusão

O experimento demonstra conceitos fundamentais de manipulação de arrays:

* Leitura e armazenamento de dados;
* Percurso de vetores;
* Cálculo de média;
* Busca de valores máximos e mínimos;
* Utilização de índices;
* Análise de desempenho computacional.

Além disso, evidencia que operações simples de percurso possuem excelente desempenho, apresentando crescimento linear em relação ao tamanho do conjunto de dados.

---

## Tecnologias Utilizadas

* Linguagem C++
* Arrays (Vetores)
