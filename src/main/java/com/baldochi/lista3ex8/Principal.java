package com.baldochi.lista3ex8;

public class Principal {
    public static void main(String[] args) {
        int[] acertos = {8, 4, 6, 10, 9, 7, 8, 12, 5, 8}; // Acertos de cada jogador
        double[] xi; // Discrepâncias
        double m; // Média
        double s = 0; // Variância

        // Calculando a média
        int soma = 0;
        for (int acerto : acertos) {
            soma += acerto;
        }
        m = soma / (double) acertos.length;

        // Calculando as discrepâncias e preparando o vetor xi
        xi = new double[acertos.length];
        for (int i = 0; i < acertos.length; i++) {
            xi[i] = acertos[i] - m;
            s += Math.pow(xi[i], 2); // Somando os quadrados para a variância
        }

        // Variância é a soma dos quadrados das discrepâncias dividida pelo número de jogadores
        s = s / acertos.length;

        // Exibindo os resultados
        System.out.println("Jogador | Acertos (Xi) | xi | (xi)^2");
        for (int i = 0; i < acertos.length; i++) {
            System.out.printf("%d        | %d           | %.2f | %.2f\n", (i+1), acertos[i], xi[i], Math.pow(xi[i], 2));
        }

        System.out.println("\nVariância dos acertos: " + s);
    }
}
