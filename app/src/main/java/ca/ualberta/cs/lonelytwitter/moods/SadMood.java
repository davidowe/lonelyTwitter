package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

public class SadMood extends CurrentMood {
    public SadMood(){
        setDate(new Date());
    }
    public SadMood(Date newDate){
        setDate(newDate);
    }
    public String toString(){
        return "Sad";
    }
}
