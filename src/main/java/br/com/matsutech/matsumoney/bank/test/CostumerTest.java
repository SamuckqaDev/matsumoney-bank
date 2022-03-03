package br.com.matsutech.matsumoney.bank.test;

import br.com.matsutech.matsumoney.bank.entities.Costumer;
/**
 *
 * @author SamuckqaDev
 */
public class CostumerTest {

    public static void main(String[] args) {

        //people is test of Class(entity);
        Costumer people1 = new Costumer();

        people1.setCpf("500.600.573-59");
        people1.setName("Jhosias");
        people1.setProfession("Analista de sistemas");

        System.out.println(people1.getCpf());
        System.out.println(people1.getName());
        System.out.println(people1.getProfession());

    }

}
