package br.com.matsutech.matsumoney.bank.entities;

/**
 *
 * @author SamuckqaDev
 */
public class Costumer {
    //Attributes;
    private String name;
    private String cpf;
    private String profession;
    private String gender;
    private Integer age;

    //Contructor;
    public Costumer() {
    }

    //Getters and Setters;
    public void setName(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }
    
    public void setProfession(String profession){
        this.profession = profession;
    }
    
    public String getProfession(){
        return this.profession;
    }
    
    

}
