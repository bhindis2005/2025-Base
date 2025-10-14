package team.gif.robot.subsystems;
import edu.wpi.first.wpilibj.DigitalInput;
import team.gif.robot.RobotMap;


public class LimitSwitch {

    private static DigitalInput limitSwitch;

    public LimitSwitch() {
        limitSwitch = new DigitalInput(RobotMap.LIMIT_SWITCH_ID);


    }
    public boolean getLimitSwitchInput(){
        return limitSwitch.get();
    }
}