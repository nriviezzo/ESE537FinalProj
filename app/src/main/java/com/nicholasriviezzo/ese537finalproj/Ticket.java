package com.nicholasriviezzo.ese537finalproj;

import java.util.ArrayList;

/**
 * Created by Nick Riviezzo on 10/27/2016.
 * This is a custom class that stores the information
 * requested from the server.
 * A ticket has a similar format to {Person, Object, funciton1<>}
 * This information is stores locally on the phone.
 * THis information is oulled on all nearby objects when the [Find...] Button is pressed
 */
public class Ticket {
    private String personFirstName;
    private String personLastName;
    private String personID;
    private String objectName;
    private ArrayList<String> availablefunctions;

    public Ticket(String personFirstName, String personLastName, String objectName) {
        //person ID and available functions omitted to not be changed by program
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.objectName = objectName;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public ArrayList<String> getAvailablefunctions() {
        return availablefunctions;
    }

   /* Omitted so that program can not changed, only changed by server
   public void setAvailablefunctions(ArrayList<String> availablefunctions) {
        this.availablefunctions = availablefunctions;
    }
    */

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }


}
