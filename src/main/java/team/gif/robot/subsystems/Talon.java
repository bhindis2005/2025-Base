// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;


public class Talon extends SubsystemBase {
    /**
     * Creates a new ExampleSubsystem.
     */
    private TalonSRX talonmotor;
    public Talon() {
        talonmotor = new TalonSRX(RobotMap.WINCH_MOTOR_ID);
        talonmotor.configFactoryDefault();
        talonmotor.setNeutralMode(NeutralMode.Brake);
    }

    public void turnmotor(double percentoutput){
        talonmotor.set(TalonSRXControlMode.PercentOutput, percentoutput);
    }
}