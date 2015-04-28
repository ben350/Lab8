/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;
import java.util.*;
/**
 *
 * @author Benjamin Ramirez
 */


public class Building {
    
    private Elevator elevator;
    private static int FLOORS = 7;
    private Floor[] floors;
    
    
    public Building() {
        
        this.elevator = new Elevator(this);
        this.floors = new Floor[FLOORS];
        for(int i  = 0; i < FLOORS; i++) {
            this.floors[i] = new Floor(this, i);
        }
        
        
        
    }
    
            
            
    
            
    public Elevator elevator() {
        return this.elevator;
    }
            
}
