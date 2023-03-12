package org.gpmrks.Teste3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Teste3 {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        LinkedList<Dado> dados = new LinkedList<>();
        float media = 0;
        int diasValorAcimaDaMedia = 0;

        try {
            Dado[] dadosJson = objectMapper.readValue(new File("src/main/java/org/gpmrks/Teste3/resources/dados.json"), Dado[].class);

            dados.addAll(Arrays.asList(dadosJson));

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Dado dado : dados) {
            media += dado.getValor();
        }

        media = media / (dados.size() - 8);

        for (Dado dado : dados) {
            System.out.println(dado);
            if (dado.getValor() > media) {
                diasValorAcimaDaMedia++;
            }
        }

        System.out.printf("\nO menor valor de faturamento ocorrido em um dia do mês: R$%.2f", dados.stream().min(Comparator.comparing(Dado::getValor)).get().getValor());
        System.out.printf("\nO maior valor de faturamento ocorrido em um dia do mês:R$%.2f", dados.stream().max(Comparator.comparing(Dado::getValor)).get().getValor());
        System.out.printf("\nMédia de faturamento: R$%.2f", media);
        System.out.println("\nNúmero de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + diasValorAcimaDaMedia);
    }
}
