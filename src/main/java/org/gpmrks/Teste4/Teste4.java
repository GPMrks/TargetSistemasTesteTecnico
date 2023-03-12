package org.gpmrks.Teste4;

import java.util.LinkedList;

public class Teste4 {

    public static void main(String[] args) {

        LinkedList<Faturamento> faturamentos = new LinkedList<>();
        double soma = 0;

        insereFaturamentos(faturamentos);

        for (Faturamento faturamento : faturamentos) {
            soma += faturamento.getFaturamento();
        }

        for (Faturamento faturamento : faturamentos) {
            double porcentagem = (faturamento.getFaturamento() / soma) * 100;
            System.out.printf("\n%s: %.2f%%", faturamento.getEstado(), porcentagem);
        }

        System.out.println();

    }

    private static void insereFaturamentos(LinkedList<Faturamento> faturamentos) {
        Faturamento sp = new Faturamento("SP", 67836.43);
        Faturamento rj = new Faturamento("RJ", 36678.66);
        Faturamento mg = new Faturamento("MG", 29229.88);
        Faturamento es = new Faturamento("ES", 27165.48);
        Faturamento outros = new Faturamento("Outros", 19849.53);

        faturamentos.add(sp);
        faturamentos.add(rj);
        faturamentos.add(mg);
        faturamentos.add(es);
        faturamentos.add(outros);
    }
}
