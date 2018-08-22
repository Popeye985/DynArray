package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner invoer = new Scanner(System.in);
        DynArray getallen = new DynArray();
        int getal;


        do {
            System.out.println("Geef een getal");
            getal = Integer.parseInt(invoer.nextLine());
            if (getal >= 0){
                getallen.add(getal);
            }



        }while (getal >= 0);

        //Arrays.sort(getallen, 0, aantal);
        for (int i = 0; i < getallen.size() ; i++) {
            System.out.println(getallen.get(i));
        }
    }
    }

