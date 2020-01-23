/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj2.command.*;

import frc.robot.subsystems.*;

/**
 * For robot commands because RobotContainer is frighteningly messy
 */
public class RobotCommands{

    // CREATE SUBSYSTEMS
    private ControlPanel CONTROL;

    public RobotCommands(ControlPanel control){
        CONTROL = control;
    }

    // == COMMANDS == //
    // CONTROL PANEL COMMANDS
    public final StartEndCommand controlLift = new StartEndCommand(
        () -> CONTROL.lifterOnUp(),
        () -> CONTROL.lifterOff(),
        CONTROL
    );

    public final StartEndCommand controlDrop = new StartEndCommand(
        () -> CONTROL.lifterOnDown(),
        () -> CONTROL.lifterOff(),
        CONTROL
    );

    public final StartEndCommand controlSpin = new StartEndCommand(
        () -> CONTROL.spinnerOn(),
        () -> CONTROL.spinnerOff(),
        CONTROL
    ); 
}
        



