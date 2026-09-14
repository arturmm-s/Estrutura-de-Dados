package sorting;

import java.util.List;

import utilities.ContadorOperacoes;

public class InsertionSort {
	
	public void insertionSort(List<Integer> list, ContadorOperacoes contador) {
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;
            contador.incrementarComparacoes(); // comparação inicial
            while (j >= 0 && list.get(j) > key) {
                contador.incrementarComparacoes(); // cada comparação no while
                list.set(j + 1, list.get(j));
                j--;
                contador.incrementarMovimentacoes(); // movimentação
            }
            list.set(j + 1, key);
            contador.incrementarMovimentacoes(); // inserção final
        }
    }
}
