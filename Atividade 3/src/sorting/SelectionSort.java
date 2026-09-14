package sorting;

import java.util.List;

import utilities.ContadorOperacoes;

public class SelectionSort {

	public void selectionSort(List<Integer> list, ContadorOperacoes contador) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                contador.incrementarComparacoes();
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
            contador.incrementarMovimentacoes();
        }
    }
}
