package com.example.crimeintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private List<Crime> crimes;

    public static CrimeLab getInstance(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        crimes = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            Crime crime = new Crime();
            crime.setCrimeTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0);
            crimes.add(crime);
        }
    }

    public List<Crime> getCrimes() {
        return crimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : crimes) {
            if (crime.getCrimID().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}

