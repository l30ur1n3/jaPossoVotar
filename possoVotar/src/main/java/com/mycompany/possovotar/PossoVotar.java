/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.possovotar;
import java.util.Scanner;
/**
 *
 * @author Rodrigo
 */
public class PossoVotar {

    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        System.out.println("Qual sua idade");
        float id = idade.nextFloat();
        if (id>16) {
            System.out.println("Ja pode votar");
        } else { 
            System.out.println("Nao pode");
        }
       
    
    }
}
