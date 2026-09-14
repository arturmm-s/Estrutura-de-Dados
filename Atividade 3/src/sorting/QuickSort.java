package sorting;

import java.util.List;

import utilities.ContadorOperacoes;

public class QuickSort {
	
	public void quickSort(List<Integer> list, int menor, int maior, ContadorOperacoes contador) {
        if (menor < maior) {
            int pi = partition(list, menor, maior, contador);
            quickSort(list, menor, pi - 1, contador);
            quickSort(list, pi + 1, maior, contador);
        }
    }

    private int partition(List<Integer> list, int menor, int maior, ContadorOperacoes contador) {
        int pivot = list.get(maior);
        int i = menor - 1;
        for (int j = menor; j < maior; j++) {
            contador.incrementarComparacoes();
            if (list.get(j) < pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                contador.incrementarMovimentacoes();
            }
        }
        int temp = list.get(i + 1);
        list.set(i + 1, list.get(maior));
        list.set(maior, temp);
        contador.incrementarMovimentacoes();
        return i + 1;
    }
}
