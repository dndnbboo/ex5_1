/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreusingevent;
import java.util.EventObject;

// 64050075

/**
 *
 * @author User
 */
public class ScoreEvent extends EventObject{
    private String someData;
    public String getSomeData() {
        return someData;
    }
    public ScoreEvent(Object o, String value) {
        super(o);
        someData = value;
    }
}
