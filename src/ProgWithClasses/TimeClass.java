package ProgWithClasses;

public class TimeClass{
    private int hour;
    private int minute;
    private int second;
    private String date;

    public TimeClass(){
        hour=0;
        minute=0;
        second=0;
        makeDate(0,0,0);
    }

    public TimeClass(int h, int m, int s){
        hour=h;
        minute=m;
        second=s;
        makeDate(h,m,s);
    }

    public TimeClass(String str){
        String []s=str.split(":");
        if(Integer.parseInt(s[0])>=0 && Integer.parseInt(s[0])<=23)
            hour=Integer.parseInt(s[0]);
        else
            hour=0;
        if(Integer.parseInt(s[1])>=0 && Integer.parseInt(s[1])<=59)
            minute=Integer.parseInt(s[1]);
        else
            minute=0;
        if(Integer.parseInt(s[2])>=0 && Integer.parseInt(s[2])<=59)
            second=Integer.parseInt(s[2]);
        else
            second=0;
        makeDate(hour,minute,second);
        int a=1;
    }

    private void makeDate(int h, int m, int s){
        String res=new String();
        if(h<10)
            res="0";
        res=res+h+":";
        if(m<10)
            res+="0";
        res=res+m+":";
        if(s<10)
            res+="0";
        res=res+s;
        date=res;
    }//формирует строку со временем

    public void setHour(int h){
        hour=h;
        makeDate(hour,minute,second);
    }

    public void setMinute(int m){
        minute=m;
        makeDate(hour,minute,second);
    }

    public void setSecond(int s){
        second=s;
        makeDate(hour,minute,second);
    }

    public String getTime(){return date;}

    public void increaseHour(int i){
        hour=(hour+i)%24;
        makeDate(hour,minute,second);
    }

    public void increaseMinute(int i){
        if(minute+i>=60)
            increaseHour(1);
        minute=(minute+i)%60;
        makeDate(hour,minute,second);
    }

    public void increaseSecond(int i){
        if(second+1>=60)
            increaseMinute(1);
        second=(second+i)%60;
        makeDate(hour,minute,second);
    }
}
