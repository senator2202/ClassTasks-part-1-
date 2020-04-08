package ProgWithClasses.CustomerTask;

import java.util.Random;

public class DailyCustomers {
    private Customer[] customers;

    public DailyCustomers(int n){
        customers=new Customer[n];
        Random r=new Random();
        for(int i=0;i<n;i++){
            customers[i]=new Customer();
            customers[i].setId(r.nextInt(100));
            customers[i].setName("Name"+r.nextInt(10));
            customers[i].setSurName("SurName"+r.nextInt(10));
            customers[i].setMiddleName("MiddleName"+r.nextInt(10));
            customers[i].setAddressName("Address "+r.nextInt(10));
            customers[i].setCardNumber(r.nextInt(100));
            customers[i].setBankAccount("Bank"+r.nextInt(100));
        }
    }

    public String getSortCustomers(){
        int min=0;
        for(int i=0;i<customers.length-1;i++){
            min=i;
            for(int j=i+1;j<customers.length;j++){
                if(customers[j].getName().compareTo(customers[min].getName())<0)
                    min=j;
                if(customers[j].getName().compareTo(customers[min].getName())==0){
                    if(customers[j].getSurName().compareTo(customers[min].getSurName())<0)
                        min=j;
                    if(customers[j].getSurName().compareTo(customers[min].getSurName())==0)
                        if(customers[j].getMiddleName().compareTo(customers[min].getMiddleName())<0)
                            min=j;
                }
            }
            if(min!=i)
                swapCustomers(i,min);
        }
        return getCustomers();
    }//сортировка по имени покупателя

    public String getCustomers (){
        String res=new String();
        for(int i=0;i<customers.length;i++)
            if(i<customers.length-1)
                res+=customers[i].toString()+"\n";
            else
                res+=customers[i].toString();
        return res;
    }//формирует строку из методов customer.toString() каждого покупателя

    public String getCustomersByCard (int a, int b){
        String res=new String();
        for(int i=0;i<customers.length;i++)
            if(customers[i].getCardNumber()>=a && customers[i].getCardNumber()<=b) {
                if (i < customers.length - 1)
                    res += customers[i].toString() + "\n";
                else
                    res += customers[i].toString();
            }
        return res;
    }//вовзращаем покупателями с картами в интервале [a;b]

    private void swapCustomers(int a, int b){
        Customer c=customers[a];
        customers[a]=customers[b];
        customers[b]=c;
    }// свап объектов в массиве
}
