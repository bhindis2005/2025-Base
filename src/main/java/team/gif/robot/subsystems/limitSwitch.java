package team.gif.robot.subsystems;
import edu.wpi.first.wpilibj.DigitalInput;
import team.gif.robot.RobotMap;


public class limitSwitch {

    private static DigitalInput limitSwitch;

    public limitSwitch() {
        limitSwitch = new DigitalInput(RobotMap.LIMIT_SWITCH_ID);


    }
    public boolean getlimitSwitchinput(){
        return limitSwitch.get();
    }
}