package ProgWithClasses;

public class Test1 {
     private int a;
     private int b;

     public Test1(){
        a=0;
        b=0;
     }

     public  Test1(int x,int y){
         a=x;
         b=y;
     }

    public void showAB(){
        System.out.println(a+" \t"+b);
    }

    public void setA(int x){
        a=x;
    }

    public void setB(int y){
        b=y;
    }

    public int sum(){
         return a+b;
    }

    public int max(){
         if(a>b)
             return a;
         if(a<b)
             return b;
         return a;
    }
}
