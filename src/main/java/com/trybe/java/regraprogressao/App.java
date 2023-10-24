package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {
  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int activityQuantity = scanner.nextInt();
    scanner.nextLine();

    String[] activitiesNames = new String[activityQuantity];
    int[] activitiesWeights = new int[activityQuantity];
    int[] activitiesGrades = new int[activityQuantity];

    int totalWeight = 0;

    for (int i = 0; i < activityQuantity; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      activitiesNames[i] = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      activitiesWeights[i] = scanner.nextInt();

      scanner.nextLine();

      System.out.println("Digite a nota obtida para " + activitiesNames[i] + ":");
      activitiesGrades[i] = scanner.nextInt();
      scanner.nextLine();
    }
    scanner.close();

    for (int weight : activitiesWeights) {
      totalWeight += weight;
    }

    if (totalWeight != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
  }
}