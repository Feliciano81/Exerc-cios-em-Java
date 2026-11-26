package Exercicios_De_Fixacao;

import java.sql.SQLOutput;
import java.util.Scanner;

/*Faça um algoritmo que leia quatro notas obtidas por um aluno,
 calcule a média das nota obtidas, imprima na tela o nome do aluno e
se o aluno foi aprovado ou reprovado. Para o aluno ser considerado
aprovado sua média final deve ser maior ou igual a 7.*/
public class Exercicio_11 {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double media = 0;
        String aluno;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        aluno = entrada.nextLine();
        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i + 1) + "° nota: ");
            notas[i] = entrada.nextDouble();
            media += notas[i];
        }
        media = media / notas.length;
        if (media < 7){
            System.out.println("O aluno " + aluno + " não obteve média suficiente!!!");
            System.out.println("Média: " + media);
        }else {
            System.out.println("PARABÉNS "+ aluno + " VOCÊ FOI APROVADO!!!");
            System.out.println("Média: " + media);
        }

    }
}
