package elevator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Benjamin Ramirez
 */
public class ElevatorTest {

    static public void main(String argv[]) throws ElevatorFullException {
        
        
        ElevatorController controller = new ElevatorController();

        Building building = new Building();
        building.elevator().boardPassenger(4);
        building.elevator().boardPassenger(2);
        building.elevator().boardPassenger(3);
        for (int i = 0; i < 10; i++) {
            building.elevator().move();
        }
    }
}
