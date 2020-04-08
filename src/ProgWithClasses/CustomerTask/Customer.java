package ProgWithClasses.CustomerTask;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String middleName;
    private String address;
    private int cardNumber;
    private String bankAccount;

    public Customer(){
        id=0;
        name="";
        surname="";
        middleName="";
        address="";
        cardNumber=0;
        bankAccount="";
    }

    public Customer(int id, String name, String surname, String middleName, String address, int cardNumber, String bankAccount){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.middleName=middleName;
        this.address=address;
        this.cardNumber=cardNumber;
        this.bankAccount=bankAccount;
    }

    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getSurName(){return surname;}
    public void setSurName(String surname){this.surname=surname;}
    public String getMiddleName(){return middleName;}
    public void setMiddleName(String middleName){this.middleName=middleName;}
    public String getAddress(){return address;}
    public void setAddressName(String address){this.address=address;}
    public int getCardNumber(){return cardNumber;}
    public void setCardNumber(int cardNumber){this.cardNumber=cardNumber;}
    public String getBankAccount(){return bankAccount;}
    public void setBankAccount(String bankAccount){this.bankAccount=bankAccount;}

    public String toString(){
        String res=new String();
        res="id: "+id+"; name: "+name+"; surname: "+surname+"; middle name: "+middleName+"; address: "+address;
        res=res+"; card number: "+cardNumber+"; bank account number: "+bankAccount;
        return res;
    }
}
