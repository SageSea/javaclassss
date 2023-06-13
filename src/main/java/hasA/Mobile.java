package hasA;

import org.w3c.dom.ls.LSOutput;

public class Mobile {
    private OS os;
    public Mobile(OS os){
        this.os = os;
    }
    public Mobile(){
        os = new OS("Android","Kitkat");
    }
    public OS getOS(){
        return os;
    }
    public void chargeMobileFromCharger(Charger charger){
        System.out.println("Brand of charger: "+charger.getbrand());
        System.out.println("Color of charger: "+charger.getcolor());
    }

}
