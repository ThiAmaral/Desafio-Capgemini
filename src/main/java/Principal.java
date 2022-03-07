/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Principal {

    public static void main(String[] args) {
//        int opcao;
//        System.out.println("Escolha qual questão quer testar");
//        int []v = {6,7,8,4,3,9,10,7};
//        var calculaMediana = new CalculaMediana(v);
//        var mediana = calculaMediana.calculaMediana();
//        System.out.println("Mediana: "+mediana);
//        calculaMediana.imprimeVetor();
//        
//        
//        
//        Scanner Teclado = new Scanner(System.in);
//        System.out.println("Digite um valor para o tamanho do vetor: ");
//        int n = Teclado.nextInt();
//        int vetor[] = new int[n];
//        for(int i=0; i<n; i++){
//            System.out.println("Digite um valor: ");
//            vetor[i] = Teclado.nextInt();
//        }
//        System.out.println("Digite o valor de x: ");
//        int x = Teclado.nextInt();
//        var elementosPares = new ElementosPares(vetor, x);
//        System.out.println("Numero de pares: " + elementosPares.calculaPares());

        Scanner Teclado = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String s = Teclado.nextLine();
        var encriptaTexto = new EncriptaTexto(s);
        System.out.println(encriptaTexto.encriptar());

    }
}
