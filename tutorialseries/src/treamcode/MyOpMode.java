//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package treamcode;

import java.util.ArrayList;

public class MyOpMode extends OpMode {
    public MyOpMode() {
    }

    public void init() {
    }

    public void loop() {
        ArrayList<CurvePoint> allPoints = new ArrayList();
        allPoints.add(new CurvePoint(0.0D, 0.0D, 1.0D, 1.0D, 50.0D, Math.toRadians(50.0D), 1.0D));
        allPoints.add(new CurvePoint(180.0D, 180.0D, 1.0D, 1.0D, 50.0D, Math.toRadians(50.0D), 1.0D));
        allPoints.add(new CurvePoint(220.0D, 180.0D, 1.0D, 1.0D, 50.0D, Math.toRadians(50.0D), 1.0D));
        allPoints.add(new CurvePoint(280.0D, 50.0D, 1.0D, 1.0D, 50.0D, Math.toRadians(50.0D), 1.0D));
        allPoints.add(new CurvePoint(180.0D, 0.0D, 1.0D, 1.0D, 50.0D, Math.toRadians(50.0D), 1.0D));
        RobotMovement.followCurve(allPoints, Math.toRadians(90.0D));
    }
}
