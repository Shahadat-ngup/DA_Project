/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import trab1.Athlete;
import trab1.AthleticEvent;
import trab1.Federated;
import trab1.NoFederated;
import trab1.Registration;

/**
 *
 * @author Shaha
 */
public class Project1 {

    public static void main(String[] args) throws ParseException {
                
                
                String inputDate1 = "Tue May 20 00:30:00 GMT 2000";
                String inputDate2 = "Fri Jul 23 00:01:00 GMT 1996";
                String inputDate3 = "Thu Dec 01 00:21:00 GMT 2020";
                String inputDate4 = "Wed "
                        + "Oct 01 00:21:00 GMT 2021";
                String inputDate5 = "Mon Nov 01 00:21:00 GMT 2022";
                SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                Date date1 = sdf.parse(inputDate1);
                Date date2 = sdf.parse(inputDate2);
                Date date3 = sdf.parse(inputDate3);
                Date date4 = sdf.parse(inputDate4);
                Date date5 = sdf.parse(inputDate5);
                
                
                
                //Athletic Event Object
                AthleticEvent event = new AthleticEvent("Marathon", date5, "Porto Event", "Porto", 500);
                //Athlete 1
                Athlete athlete1 = new Athlete("Shahadat","Sacaneiro","shahadatdps@gmail.com",937508492 ,date1, 2345235);
                //Athlete 2
                Athlete athlete2 = new Athlete("Hossain","Lidle of tonk","tdps@gmail.com",787508492 ,date2, 8945235);
                //Registration object
                Registration registration = new Registration(date3,athlete1 ,event);
                Registration registrations = new Registration(date4,athlete2 ,event);
                //Federated athlete
		Federated federate = new Federated("Sha","Dhaka Bangladesh","sha@gmail.com", 01727434751,date1, 1,"Dhaka Club", date3);
                //AddingAthlete
		
                //No Federated Athlete
                NoFederated noFederated = new NoFederated("DewanKing", "Rua Camilo Castelo Branco","a41724@alunos.ipb.pt", 921234568,
				 date2,3432313, true);
                
		System.out.println("The Athletes info:\n"+athlete1+"\n"+athlete2);
		System.out.println("Is the federated athlete added? " + event.addFederateInsc(federate.getName(),federate.getAddress(),federate.getEmail(),federate.getNif(), federate.getBirthdate(),federate.getPhone(), federate.getClub(), federate.getDate()));
                System.out.println("Federated Athletes: ");
                System.out.println(federate);
                
                
                //Adding Non-Federated Athlete
                System.out.println("Is the Non-federated athlete added?"+event.addNonFederateInsc(noFederated.getNif(), noFederated.getName(), noFederated.getAddress(), noFederated.getPhone(), noFederated.getEmail(), noFederated.getBirthdate(), noFederated.isHealth()));
                System.out.println("Non_Federated Athletes: ");//String name, String mo, String email, int nif, Date dN, int phone, String club, Date dF
                System.out.println(noFederated);
			
		//Total Registration price
		System.out.println("Total registration price for Porto Marathon Event: " + event.totalInvoice());
                
                 System.out.println("Before removing, Info of Registration and Athlete 1 : \n"+event);
                
		//Removing athlete
                event.removeRegistration(1);
                //System.out.println("After removing registration"+athlete1);
                System.out.print("After removing, Info of Registration and Athlete 1: ");
                
                System.out.println(event);
                System.out.println("Registration of the First event and Athlete 1: "+registrations);
                System.out.println("Registration of the First event and Athlete 2: "+registration);
		
    }
}
