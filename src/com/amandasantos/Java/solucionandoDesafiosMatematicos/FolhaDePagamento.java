/*

DESAFIO
Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, porém temos apenas a quantidade de
horas trabalhadas e o valor hora. Escreva um programa que leia o número de um colaborador, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse colaborador. Em seguida, apresente o número e o salário do colaborador,
com duas casas decimais.

ENTRADA
Você receverá 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas
e o valor que o funcionário recebe por hora trabalhada.

SAÍDA
Exiba o número e o salário do colaborador, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
No caso do salário, também deve haver um espaço em branco após o $.

*/

package com.amandasantos.Java.solucionandoDesafiosMatematicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FolhaDePagamento {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numeroFuncionario = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int horas = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valorHora = Double.parseDouble(st.nextToken());

        double salary = horas * valorHora; // Altere o valor da variável com o cálculo esperado
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salary);
    }
}
