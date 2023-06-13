package hasA;

public class Launch {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        Charger charger = new Charger("Samsumng","Red");
        System.out.println("OS name" + mobile.getOS().getName());
        System.out.println("OS version" + mobile.getOS().getVersion());
        mobile.chargeMobileFromCharger(charger);

        mobile = null;
//        System.out.println("Mobile Name: " +mobile.getOS().getName());
//        System.out.println("Mobile Version: " +mobile.getOS().getVersion());

        System.out.println("brand of charger: " + charger.getbrand());
        System.out.println("color of charger: " + charger.getcolor());
    }
}
