/*
 * Copyright 2021 Marc Liberatore.
 */

package log;
import java.util.*;
public class SuspectEntry implements Comparator<SuspectEntry>{
    private String name;
    private String phoneNumber;
    private String passportNumber;
    public SuspectEntry()
    {
        this.name="";
        this.phoneNumber="";
        this.passportNumber="";
    }
    public SuspectEntry(String name, String phoneNumber, String passportNumber) {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.passportNumber=passportNumber;
    }
    public void modify(SuspectEntry entry)
    {
        this.name=entry.name;
        this.phoneNumber=entry.phoneNumber;
        this.passportNumber=entry.passportNumber;        
    }
    public String getPassportNumber()
    {
        return passportNumber;
    }
    public String toString()
    {
        return passportNumber+","+name+","+phoneNumber;
    }
    public boolean equals(Object o)
    {
        if (o == null) {
            return false;
        }
        if (!(o instanceof SuspectEntry)) {
            return false;
        }
        SuspectEntry entry = (SuspectEntry)o;
        if(name.equals(entry.name) && phoneNumber.equals(entry.phoneNumber) && passportNumber.equals(entry.passportNumber)){
        //if(passportNumber.equals(entry.passportNumber))
            return true;
        }
       
            return false;
    }
    public int compare(SuspectEntry a,SuspectEntry b)
    {
        int x,y,z;
        x=a.passportNumber.compareTo(b.passportNumber);
        if(x!=0)
            return x;
        else
        {
            y=a.name.compareTo(b.name);
            if(y!=0)
                return y;
            else
            {
                z=a.phoneNumber.compareTo(b.phoneNumber);
                return z;
            }
        }
    }
}