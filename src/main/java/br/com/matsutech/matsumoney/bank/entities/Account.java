package br.com.matsutech.matsumoney.bank.entities;

/**
 *
 * @author SamuckqaDev
 */
public class Account {

    //Attributes;
    private Double balance = 0.0;
    private Integer number;
    private Integer agency;
    private Costumer owner;

    //Contructor;
    public Account(Integer number, Integer agency) {
        //Só pra testar contrutor padrão;
        System.out.println("Estou no contrutor");
        this.agency = agency;
        this.number = number;
    }

    //Getters and Setters; 
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getAgency() {
        return agency;
    }

    public void setAgency(Integer agency) {
        this.agency = agency;
    }

    public Costumer getOwner() {
        return owner;
    }

    public void setOwner(Costumer owner) {
        this.owner = owner;
    }

    //Methods;
    public void deposit(Double value) {
        if (value > 0) {
            this.balance += value;
        } else {
            System.out.println("Valor Inexistente");
        }

    }

    public void withDraw(Double value) {
        if (this.balance < value) {
            System.out.println("Saldo insuficiente !");
        } else {
            this.balance -= value;
        }
    }

    public void transfer(Account account, Double value) {
        if (value > 0) {
           this.withDraw(value);
           account.deposit(value);
        }
    }

}
