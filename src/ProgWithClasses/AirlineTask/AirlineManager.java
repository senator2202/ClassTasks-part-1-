package ProgWithClasses.AirlineTask;

import ProgWithClasses.TimeClass;

import java.util.Random;

public class AirlineManager {
    private Airline []airlines;

    public AirlineManager(int n){
        airlines=new Airline[n];
        Random r=new Random();
        String []destinations={"Гавайи", "Монако", "Лондон", "Осиповичи"};
        String []typesOfPlane={"Пассажирский", "Грузовой", "Военный"};
        String []daysOfWeek={"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        for(int i=0;i<n;i++){
            airlines[i]=new Airline();
            airlines[i].setDestination(destinations[r.nextInt(4)]);
            airlines[i].setFlightNumber(r.nextInt(100));
            airlines[i].setTypeOfAirplane(typesOfPlane[r.nextInt(3)]);
            airlines[i].setTime(new TimeClass(r.nextInt(24),r.nextInt(60),r.nextInt(60)));
            airlines[i].setDayOfWeek(daysOfWeek[r.nextInt(7)]);
        }
    }

    public String getAirlines(){
        String res=new String();
        for(int i=0;i<airlines.length;i++)
            res+=airlines[i].toString()+"\n";
        return res;
    }

    public String getAirlinesByDestination(String s){
        String res=new String();
        for(int i=0;i<airlines.length;i++)
            if(airlines[i].getDestination().compareTo(s)==0)
                res+=airlines[i].toString()+"\n";
        return res;
    }

    public String getAirlinesByDayOfWeek(String s){
        String res=new String();
        for(int i=0;i<airlines.length;i++)
            if(airlines[i].getDayOfWeek().compareTo(s)==0)
                res+=airlines[i].toString()+"\n";
        return res;
    }

    public String getAirlinesByDayAndTime(String s, String s1){
        String res=new String();
        for(int i=0;i<airlines.length;i++)
            if(airlines[i].getDayOfWeek().compareTo(s)==0 && airlines[i].getTime().getTime().compareTo(s1)>0)
                res+=airlines[i].toString()+"\n";
        return res;
    }
}
