/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20task3eriksalmin;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV20Task3ErikSalmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.print("Ваше имя: ");
        String name = input.nextLine();
       
        System.out.print("Ваше Фамилия: ");
        String surname = input.nextLine();
       
        System.out.print("Ваш год рождения: ");
        String year = input.nextLine();
       
        System.out.print("Ваш месяц рождения: ");
        String month = input.nextLine();
       
        System.out.print("Ваш день рождения: ");
        String day = input.nextLine();
       
        System.out.println(name +" "+ surname + " родился "+ day +" "+ month +" "+ year +" "+"года");
        
        
    }
    
}
