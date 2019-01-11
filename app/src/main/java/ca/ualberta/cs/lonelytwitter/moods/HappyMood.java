package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

public class HappyMood extends CurrentMood {
    public HappyMood(){
        setDate(new Date());
    }
    public HappyMood(Date newDate){
        setDate(newDate);
    }
    public String toString(){
        return "Happy";
    }
}
