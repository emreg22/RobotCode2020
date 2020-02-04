
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import frc.robot.commands.auto.routines.Auto2;

import frc.robot.subsystems.*;

public class RobotContainer {

    // IMPORTING STUFF AND STUFF
    private final RobotCommands robotCommands = new RobotCommands();

    // == JOYSTICK & BUTTON BINDINGS == //


    // NEW JOYSTICK
    public final Joystick driverController = new Joystick(DRIVER_CONTROLLER), opController = new Joystick(OPERATOR_CONTROLLER);

    // CONFIG BUTTON BINDINGS (See constants.java to change specific ports etc.)
    // CLIMBER BUTTONS
    private final JoystickButton raiseUpButton = new JoystickButton(opController, RAISE_LIFTER),
                                 lowerDownButton = new JoystickButton(opController, LOWER_LIFTER),
                                 gearClimbButton = new JoystickButton(opController, GEAR_BUTTON),

                                // SHOOT BUTTON (TOGGLEABLE)
                                 flywheelToggleButton = new JoystickButton(opController, SHOOTER_WHEEL_TOGGLE),

                                // INTAKE BUTTONS
                                 deployOrRetractIntakeButton = new JoystickButton(opController, DEPLOY_RETRACT_INTAKE),
                                 onOrOffIntakeButton = new JoystickButton(opController, ON_OR_OFF_INTAKE),

                                 // CONTROL PANEL BUTTONS
                                 controlSpinButton = new JoystickButton(opController, SPIN_CONTROL),
                                 controlLiftButton = new JoystickButton(opController, LIFT_CONTROL),
                                 controlMatchButton = new JoystickButton(opController, MATCH_CONTROL),

                                 // STORAGE GATE BUTTON
                                 storageGateButton = new JoystickButton(opController, STORAGE_MOTOR);
                                 

   
   

    // ROBOT CONTAINER
    public RobotContainer() {
        configureButtonActions();
    }

    // CONFIG BUTTON ACTIONS
    private void configureButtonActions() {

        // CLIMB BUTTONS
        raiseUpButton.whenHeld(robotCommands.raiseLifter);
        lowerDownButton.whenHeld(robotCommands.lowerLifter);
        gearClimbButton.whenHeld(robotCommands.gearClimb);

        // SHOOT BUTTONS
        flywheelToggleButton.toggleWhenPressed(robotCommands.shootAtSpeed);

        // INTAKE BUTTONS
        deployOrRetractIntakeButton.whenPressed(robotCommands.deployOrRetractIntake);
        onOrOffIntakeButton.toggleWhenPressed(robotCommands.intakeOn);

        // CONTROL PANEL BUTTONS

        // TODO: make controlSpin button and controlMatch button the same thing based on game data
        controlSpinButton.whenHeld(robotCommands.spinSetTimes);
        controlMatchButton.whenHeld(robotCommands.controlSpinIfNoMatch);
        controlLiftButton.whenPressed(robotCommands.liftControlMaybe);

        // STORAGE
        storageGateButton.whenHeld(robotCommands.storageGate);
    }

    
    // GET DRIVETRAIN
    public Drivetrain getDrivetrain() {
        return robotCommands.DRIVETRAIN;
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        return new Auto2(robotCommands, getDrivetrain());
    }
}