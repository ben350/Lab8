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
public class ElevatorController {

    private static ElevatorView view;
    private static Building building;

    ElevatorController() throws ElevatorFullException {
        this.view = new ElevatorView();
        this.building = new Building();
        building.elevator().boardPassenger(4);
        building.elevator().boardPassenger(2);
        building.elevator().boardPassenger(3);
        building.elevator().boardPassenger(5);
        building.elevator().boardPassenger(1);
        for (int i = 0; i < 20; i++) { //making the elevator move 20 times
            //setting the appropriate fields in the view
            view.setFloorNumber(building.elevator().currentFLoor());
            view.setPassengers(building.elevator().passengers());
            view.setDirection(building.elevator().getDirection());
           
            building.elevator().move();
            try {
                Thread.sleep(1000);//waiting for 1 second so we can see changes
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

        //
    }

}
