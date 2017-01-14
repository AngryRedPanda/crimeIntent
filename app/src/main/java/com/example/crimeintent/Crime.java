package com.example.crimeintent;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Crime {

    private UUID crimeID;
    private String crimeTitle;
    private boolean isSolved;
    private Date crimeDate;

    public Crime() {
        crimeID = UUID.randomUUID();
        crimeDate = new Date();
    }

    public UUID getCrimID() {
        return crimeID;
    }

    public String getCrimeTitle() {
        return crimeTitle;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public Date getCrimeDate() {
        return crimeDate;
    }

    public String getFormattedDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
        return dateFormat.format(this.getCrimeDate());
    }

    public void setCrimeTitle(String crimeTitle) {
        this.crimeTitle = crimeTitle;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }

    public void setCrimeDate(Date crimeDate) {
        this.crimeDate = crimeDate;
    }
}
