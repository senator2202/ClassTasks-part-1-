package ProgWithClasses;

import ProgWithClasses.CustomerTask.Customer;

public class Student {
    private String FIO;
    private int group;
    private int []marks;


    public Student(){
        FIO=new String("");
        group=0;
        marks=new int[5];
        for(int el:marks)
            el=0;
        Customer c=new Customer();
    }

    public Student(String f, int g, int[] m){
        FIO=f;
        group=g;
        marks=m;
    }

    public boolean checkIfGoodMarks(){
        for (int el:marks)
            if(el<9)
                return false;
        return true;
    }

    public String getFIO(){return FIO;}

    public int getGroup(){return group;}

    public int [] getMarks(){return marks;}
}
