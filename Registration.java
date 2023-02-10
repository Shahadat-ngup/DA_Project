/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Date;

/**
 *
 * @author Shaha
 */
public class Registration {
    //Declarig attributes
   
    private AthleticEvent athleticEvent;
    private Athlete athlete_;
    Date registration;
    public Registration(Date date, Athlete athlete ,AthleticEvent athletic_event){
       registration =date;
       athleticEvent = athletic_event;
       athlete_=athlete;
       
    }
    @Override
     public String toString() {
        String info = "Event: " + athleticEvent.getEvent()+ ", Athlete: " + athlete_.getName() + ", Registration Date: " + registration;
        return info;
    }

    public Date getDate() {
        return registration;
    }
    
    public void setDate(Date d) {
        registration =d;
    }

    public AthleticEvent getEvent() {
        return athleticEvent;
    }
        public void setEvent(AthleticEvent a) {
        athleticEvent=a;
    }
         public Athlete getAthlete() {
        return athlete_;
    }
         public void setAthlete(Athlete a) {
         athlete_ =a;
    }
}