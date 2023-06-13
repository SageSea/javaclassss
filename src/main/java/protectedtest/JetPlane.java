package protectedtest;

import inheritance.Plane;

public class JetPlane extends Plane {
    public JetPlane() {
        super(4);
    }

    @Override
    protected boolean hasPilot() {
        System.out.println("Pilot flies plane");

        return false;
    }
}
