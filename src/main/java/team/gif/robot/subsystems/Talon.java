// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;


public class Talon extends SubsystemBase {

    //You should remove unneeded comment such as the one above (do this for the rest of your code, I wont be commenting

    private TalonSRX talonSRX;


    public Talon() {
        talonSRX = new TalonSRX(RobotMap.TALON_ID);
        talonSRX.configFactoryDefault();
        talonSRX.setNeutralMode(NeutralMode.Brake);
    }

    public void turnMotor(double percentOutput){
        if (Robot.limitSwitch.getLimitSwitchInput()) {
            talonSRX.set(TalonSRXControlMode.PercentOutput, percentOutput / 2);
        }
        else
            talonSRX.set(TalonSRXControlMode.PercentOutput, percentOutput);

    }
}