package ProgWithClasses.AirlineTask;

import ProgWithClasses.TimeClass;

public class Airline {
    private String destination;
    private int flightNumber;
    private String typeOfAirplane;
    private TimeClass time;
    private String dayOfWeek;

    public Airline(){
        destination="";
        flightNumber=0;
        typeOfAirplane="";
        time=new TimeClass(0,0,0);
        dayOfWeek="";
    }

    public Airline(String destination, int flightNumber, String typeOfAirplane, TimeClass time, String dayOfWeek){
        this.destination=destination;
        this.flightNumber=flightNumber;
        this.typeOfAirplane=typeOfAirplane;
        this.time=time;
        this.dayOfWeek=dayOfWeek;
    }

    public void setDestination(String destination){this.destination=destination;}
    public String getDestination(){return destination;}
    public void setFlightNumber(int flightNumber){this.flightNumber=flightNumber;}
    public int getFlightNumber(){return flightNumber;}
    public void setTypeOfAirplane(String typeOfAirplane){this.typeOfAirplane=typeOfAirplane;}
    public String getTypeOfAirplane(){return typeOfAirplane;}
    public void setTime(TimeClass time){this.time=time;}
    public TimeClass getTime(){return time;}
    public void setDayOfWeek(String dayOfWeek){this.dayOfWeek=dayOfWeek;}
    public String getDayOfWeek(){return dayOfWeek;}

    public String toString(){
        String res=new String();
        res="пункт назначения: "+destination+"; номер рейса: "+flightNumber+"; тип самолета: ";
        res=res+typeOfAirplane+"; время вылета: "+time.getTime()+"; день недели: "+dayOfWeek;
        return res;
    }

}
