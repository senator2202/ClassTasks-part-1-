package ProgWithClasses;


public class Train {
    private String destination;
    private int trainNumber;
    private String departureTime;

    public Train(String dest, int num, String c){
        destination=dest;
        trainNumber=num;
        departureTime=c;
    }

    public String getDestination(){return destination;}

    public int getTrainNumber(){return trainNumber;}

    public String getDepartureTime(){return departureTime;}


}
