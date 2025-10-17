// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.RobotMap;

public class SparkMaxMotorControl extends SubsystemBase {

    private SparkMax sparkMax;
    private SparkClosedLoopController sparkPID;
    private RelativeEncoder neoEncoder;

    public SparkMaxMotorControl() {
        sparkMax = new SparkMax(RobotMap.SPARKMAX_ID, SparkLowLevel.MotorType.kBrushless);

        SparkMaxConfig config = new SparkMaxConfig();
        sparkPID = sparkMax.getClosedLoopController();
        neoEncoder = sparkMax.getEncoder();
        config.idleMode(SparkBaseConfig.IdleMode.kBrake);
        config.closedLoop.pid(Constants.SPARK_MOTOR_P,Constants.SPARK_MOTOR_I,0.0);
        sparkMax.configure(config, SparkBase.ResetMode.kResetSafeParameters, SparkBase.PersistMode.kPersistParameters);
    }

    public void setVoltage(double voltage) {
        sparkMax.setVoltage(voltage);
    }

    public void setRPM(double RPM){
        sparkPID.setReference(RPM, SparkBase.ControlType.kVelocity);
    }

    public double getRPM(){
        return neoEncoder.getVelocity();
    }


}
