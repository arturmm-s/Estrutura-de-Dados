package sorting;

import java.util.List;

import utilities.ContadorOperacoes;

public class BubbleSort {
	
	public void bubbleSort(List<Integer> list, ContadorOperacoes contador) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                contador.incrementarComparacoes();
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    contador.incrementarMovimentacoes();
                }
            }
        }
    }
}
