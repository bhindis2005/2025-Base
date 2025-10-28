package team.gif.robot;

public abstract class RobotMap {
    // Controllers
    public static final int DRIVER_CONTROLLER_ID = 0;
    public static final int AUX_CONTROLLER_ID = 1;
    public static final int TEST_CONTROLLER_ID = 2;
    public static final int LIMIT_SWITCH_ID = 9;
    public static final int PIGEON_ID = 9;

    public static final int TALON_ID = 5; //We're not using this as a winch on our BAB, rename this to have the mechanical component (hint: look at the format for the name below, that is correct!)
    public static final int SPARK_ID = 45;
    public static final int PCM_ID= 1 ;
}




