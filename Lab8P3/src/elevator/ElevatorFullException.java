/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;

/**
 *
 * @author Benjamin Ramirez
 */
public class ElevatorFullException extends Exception {
    
    ElevatorFullException(){
        super();
    }
    
    ElevatorFullException(Exception msg){
        super(msg);
    }
    
    
}
