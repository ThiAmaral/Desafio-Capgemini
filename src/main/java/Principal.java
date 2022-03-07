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
        Scanner Teclado = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma das questões para testar");
        System.out.println("[1] - Questão 1 - Calcula Mediana");
        System.out.println("[2] - Questão 2 - Encontra pares ");
        System.out.println("[3] - Questão 3 - Mensagem Criptografada");
        System.out.println("[0] - Sair");

        System.out.println("\n\n");

        System.out.println("Digite o número da opção escolhida");
        opcao = Teclado.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Digite um valor para o tamanho do vetor: ");
                int n = Teclado.nextInt();
                int v[] = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Digite um valor: ");
                    v[i] = Teclado.nextInt();
                }
                var calculaMediana = new CalculaMediana(v);
                var mediana = calculaMediana.calculaMediana();
                System.out.println("Mediana: " + mediana);
                calculaMediana.imprimeVetor();
                break;
            case 2:
                System.out.println("Digite um valor para o tamanho do vetor: ");
                n = Teclado.nextInt();
                int vetor[] = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Digite um valor: ");
                    vetor[i] = Teclado.nextInt();
                }
                System.out.println("Digite o valor de x: ");
                int x = Teclado.nextInt();
                var elementosPares = new ElementosPares(vetor, x);
                System.out.println("Numero de pares: " + elementosPares.calculaPares());
                break;
            case 3:
                System.out.println("Digite uma frase: ");
                String s = Teclado.nextLine();
                var encriptaTexto = new EncriptaTexto(s);
                System.out.println(encriptaTexto.encriptar());
                break;
            case 0:
                System.out.println("Programa Encerrado");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }

    }
}
