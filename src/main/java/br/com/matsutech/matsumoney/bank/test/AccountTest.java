package br.com.matsutech.matsumoney.bank.test;

import br.com.matsutech.matsumoney.bank.entities.*;

/**
 *
 * @author SamuckqaDev
 */
public class AccountTest {

    public static void main(String[] args) {
        Account c1 = new Account(210462, 203);
        
        //Teste ok!
        c1.deposit(-5000.0);
        System.out.println(String.format("Saldo atual: %s", c1.getBalance()));
        
        //Teste ok!
        c1.withDraw(5050.0);
        System.out.println(String.format("Saldo atual: %s", c1.getBalance()));
    }

}
