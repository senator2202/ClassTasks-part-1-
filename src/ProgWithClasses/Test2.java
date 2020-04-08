package ProgWithClasses;

public class Test2 {
    private int a;
    private int b;

    public Test2(){
        a=0;
        b=0;
    }

    public  Test2(int x,int y){
        a=x;
        b=y;
    }

    public void setA(int a){
        this.a=a;
    }

    public int getA(){
        return a;
    }

    public void setB(int b){
        this.b=b;
    }

    public int getB(){
        return b;
    }
}
