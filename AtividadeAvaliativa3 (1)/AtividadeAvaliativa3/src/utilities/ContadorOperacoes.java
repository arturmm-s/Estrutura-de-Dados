package utilities;

public class ContadorOperacoes {
	public int comparacoes;
    public int movimentacoes;
    
    public ContadorOperacoes() {
        this.comparacoes = 0;
        this.movimentacoes = 0;
    }

    public void incrementarComparacoes() {
        comparacoes++;
    }

    public void incrementarMovimentacoes() {
        movimentacoes++;
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int getMovimentacoes() {
        return movimentacoes;
    }

    public void resetar() {
        comparacoes = 0;
        movimentacoes = 0;
    }

    @Override
    public String toString() {
        return "Comparações: " + comparacoes + ", Movimentações: " + movimentacoes;
    }
}
