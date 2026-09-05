# PARTE 5 – HANDS ON 2: Monitoramento de Sensores com Matrizes

## Objetivo

Este projeto tem como objetivo aplicar o uso de matrizes bidimensionais em C++ para simular um sistema de monitoramento de temperatura.

O sistema possui:

* **5 sensores de temperatura**
* **24 medições por sensor**, correspondentes às 24 horas do dia

A matriz utilizada é:

```cpp
float sensores[5][24];
```

Onde:

* Cada **linha** representa um sensor;
* Cada **coluna** representa um horário do dia.

---

## Funcionalidades

O programa deve realizar as seguintes operações:

### 1. Média de cada sensor

Calcular a média das 24 medições de cada um dos 5 sensores.

### 2. Maior temperatura registrada

Encontrar o maior valor armazenado em toda a matriz.

### 3. Sensor responsável pelo maior valor

Identificar qual sensor registrou a maior temperatura.

### 4. Horário da ocorrência

Informar em qual horário (0 a 23) ocorreu a maior temperatura.

### 5. Média geral

Calcular a média de todas as medições realizadas.

Total de medições:

```text
5 × 24 = 120 medições
```

### 6. Leituras acima de um limite

Solicitar ao usuário um limite de temperatura e informar quantas medições ficaram acima desse valor.

#### Exemplo

```text
Limite informado: 28 °C

Quantidade de leituras acima do limite: 7
```

---

## Estrutura da Matriz

| Sensor   | Horários |
| -------- | -------- |
| Sensor 0 | 0 a 23   |
| Sensor 1 | 0 a 23   |
| Sensor 2 | 0 a 23   |
| Sensor 3 | 0 a 23   |
| Sensor 4 | 0 a 23   |

Total de posições da matriz:

```text
5 linhas × 24 colunas = 120 posições
```

---

## Análise do Algoritmo

### Por que são necessários loops aninhados?

Como a matriz possui duas dimensões (linhas e colunas), é necessário utilizar dois loops:

* O primeiro percorre os sensores (linhas);
* O segundo percorre os horários (colunas).

Um único loop conseguiria percorrer apenas uma dimensão por vez.

### Qual o papel dos índices [i][j]?

Os índices identificam a posição exata de cada medição na matriz:

* **i** → representa o sensor;
* **j** → representa o horário da medição.

Exemplo:

```cpp
sensores[2][15]
```

Representa a temperatura registrada:

* Pelo Sensor 2;
* Às 15 horas.

### Quantas posições da matriz são percorridas?

A matriz possui:

```text
5 × 24 = 120 posições
```

Portanto, para analisar completamente os dados, o algoritmo percorre as 120 posições.

### Qual a relação entre linhas, colunas e quantidade de operações?

A quantidade de operações está diretamente relacionada ao total de elementos da matriz.

Fórmula:

```text
Quantidade de operações ≈ Linhas × Colunas
```

Neste caso:

```text
5 × 24 = 120 operações
```

para cada percurso completo da matriz.

---

## Complexidade do Algoritmo

A complexidade de tempo é:

```text
O(linhas × colunas)
```

ou

```text
O(m × n)
```

onde:

* m = número de linhas;
* n = número de colunas.

Como cada posição da matriz precisa ser visitada ao menos uma vez, o crescimento do algoritmo é proporcional ao total de elementos armazenados.

---

## Conclusão

Este exercício demonstra a aplicação prática de matrizes bidimensionais para armazenamento e análise de dados coletados por sensores.

Durante o processamento são realizados:

* Cálculo de médias;
* Busca de valores máximos;
* Identificação de posições específicas;
* Contagem baseada em condições;
* Percurso completo da matriz utilizando loops aninhados.

Além disso, o experimento reforça o entendimento sobre estruturas bidimensionais e análise de complexidade computacional.

