/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreusingevent;
import java.util.ArrayList;

// 64050075

/**
 *
 * @author User
 */
public class ScoreSource {
    ArrayList<ScoreListener> score;
    public ScoreSource(){
        score = new ArrayList<>();
    }
    public void addSubscriber(ScoreListener obj){
        score.add(obj);
    }
    public void setScoreLine(String value){
        fireHeadQuaterEvent(new ScoreEvent(this, value));
    }
    public void fireHeadQuaterEvent(ScoreEvent evt) {
        for (ScoreListener observer : score) {
            observer.scoreChange(evt);
        }
    }
    public void register (ScoreListener sc) {
        score.add(sc);
    }
    public void removeregister (ScoreListener sc) {
        score.remove(sc);
    }
}
