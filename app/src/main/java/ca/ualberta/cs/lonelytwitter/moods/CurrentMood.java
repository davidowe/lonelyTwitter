package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

public abstract class CurrentMood {
    private Date date;
    public Date getDate() {
        return date;
    }
    public void setDate(Date newDate){
        date = newDate;
    }
}
