package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.QuickSort;
import sorting.SelectionSort;
import utilities.ContadorOperacoes;
import utilities.CriacaoDeVetores;

public class Main {

	public static void main(String[] args) {
		CriacaoDeVetores criador = new CriacaoDeVetores();
		int[] tamanhos = {10, 20, 1000};
        String[] cenarios = {"Aleatório", "Ordenado", "Inverso"};

        for (int tamanho : tamanhos) {
            for (String cenario : cenarios) {
                List<Integer> original = criador.arrayCreate(tamanho);

                if (cenario.equals("Ordenado")) {
                    Collections.sort(original);
                } else if (cenario.equals("Inverso")) {
                    Collections.sort(original, Collections.reverseOrder());
                }

                ContadorOperacoes contadorBubble = new ContadorOperacoes();
                ContadorOperacoes contadorInsertion = new ContadorOperacoes();
                ContadorOperacoes contadorSelection = new ContadorOperacoes();
                ContadorOperacoes contadorQuick = new ContadorOperacoes();

                new BubbleSort().bubbleSort(new ArrayList<>(original), contadorBubble);
                new InsertionSort().insertionSort(new ArrayList<>(original), contadorInsertion);
                new SelectionSort().selectionSort(new ArrayList<>(original), contadorSelection);
                new QuickSort().quickSort(new ArrayList<>(original), 0, original.size() - 1, contadorQuick);

                System.out.println(" Vetor " + cenario + " (" + tamanho + " elementos)");
                System.out.println("Bubble Sort = " + contadorBubble);
                System.out.println("Insertion Sort = " + contadorInsertion);
                System.out.println("Selection Sort = " + contadorSelection);
                System.out.println("Quick Sort = " + contadorQuick);
                System.out.println();
            }
        }
    }
}
