package polymorphishm;

import inheritance.PassengerPlane;
import inheritance.Plane;

public class Airport {
    /*
    * permit is flexible method
    * as it is accessed by all the type of plane
    * */
    public void permit(Plane plane){
        plane.takeOff();
        plane.fly();
        plane.land();
    }
}
