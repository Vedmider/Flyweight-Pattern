package com.study.presentation;

import com.study.domain.Bacteria;
import com.study.domain.BacteriaColony;

import java.util.Scanner;

public class ConsolePresentation {

    public static void main(String[] args) {
        System.out.println("This is Flyweight pattern demonstration\n" +
                "Enter please: type, weight, DNACode of your bacteria\n" +
                "then type mutation risk to create new bacteria.\n");

        Scanner scanner = new Scanner(System.in);
        BacteriaColony bacteriaColony = null;
        Bacteria bacteria = null;
        for (int i = 0; i < 2; i++) {
            String[] argsTemp = scanner.nextLine().trim().split("\\s+");
            if (bacteriaColony == null){
                bacteriaColony = new BacteriaColony(argsTemp[0], Double.parseDouble(argsTemp[1]), argsTemp[2]);
                continue;
            }
            bacteria = bacteriaColony.getBacteria(Integer.parseInt(argsTemp[0]));
        }
    }
}
