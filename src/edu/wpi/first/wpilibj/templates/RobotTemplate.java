package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

public class RobotTemplate extends IterativeRobot {

    double joystickVal = 0;
    Joystick xboxController;
    SpeedController motor1;

    public void robotInit() {
        xboxController = new Joystick(1);
        motor1 = new Talon(4);
    }

    public void autonomousPeriodic() {

    }

    public void teleopPeriodic() {
        joystickVal = xboxController.getAxis(AxisType.kX);
        motor1.set(joystickVal);
    }

    public void testPeriodic() {

    }

}
