package ProgWithClasses;

public class Counter {
    private int value;
    private int rangeStart;
    private int rangeEnd;

    public Counter(){
        value=1;
        rangeStart = 1;
        rangeEnd = 10;
    }

    public Counter(int start, int end){
        rangeEnd = end;
        rangeStart = start;
        value=start;
    }

    public int increase(){
        value++;
        if(value>rangeEnd)
            value=rangeStart;
        return value;
    }

    public int decrease(){
        value--;
        if(value<rangeStart)
            value=rangeEnd;
        return value;
    }

    public int getValue(){return value;}

    public int[] getRange(){
        int []r=new int[2];
        r[0]=rangeStart;
        r[1]=rangeEnd;
        return r;
    }
}
