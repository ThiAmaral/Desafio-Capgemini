

import java.util.Scanner;

public class EncriptaTexto {

    private String result;

    public EncriptaTexto(String s) {
        this.result = s.replaceAll("\\s+", "");
    }

    private int calculaRaiz() {

        double raizCount = Math.sqrt(result.length());
        int raizInt = (int) raizCount;
        if (raizCount / raizInt > 1) {
            raizInt++;
        }
        return raizInt;
    }

    public String encriptar() {
        int raiz = this.calculaRaiz();
        char matriz[][] = new char[raiz][raiz];
        int contador = 0;
        for (int i = 0; i < raiz; i++) {
            for (int j = 0; j < raiz; j++) {
                matriz[i][j] = result.charAt(contador);
                contador++;
                if (contador >= result.length()) {
                    break;
                }
            }
        }
        StringBuilder palavraNova = new StringBuilder();

        for (int i = 0; i < raiz; i++) {
            for (int j = 0; j < raiz; j++) {
                palavraNova.append(matriz[j][i]);
            }
            palavraNova.append(" ");
        }
        return palavraNova.toString();
    }


}
