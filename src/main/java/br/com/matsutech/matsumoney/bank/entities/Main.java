package br.com.matsutech.matsumoney.bank.entities;

import java.util.*;
/**
 *
 * @author SamuckqaDev
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite sua conta e agência: ");
        Account c1 = new Account(in.nextInt(), in.nextInt());
        
        System.out.println(String.format("Conta: %d\nAgência: %d", c1.getNumber(), c1.getAgency()));
        
        
    }
}
