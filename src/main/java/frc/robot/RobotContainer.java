
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
import frc.robot.commands.ControlLiftCommand;
import frc.robot.subsystems.*;

public class RobotContainer {

    // IMPORTING STUFF AND STUFF

    private final RobotCommands Command = new RobotCommands();
    private final ControlPanel controlPanel = new ControlPanel();

 
    // == JOYSTICK & BUTTON BINDINGS == //


  
    // NEW JOYSTICK
    public final Joystick opController = new Joystick(OPERATOR_CONTROLLER);
  
    // CONFIG BUTTON BINDINGS (See constants.java to change specific ports etc.)
                                // CLIMB BUTTONS
    private final JoystickButton controlSpinButton = new JoystickButton(opController, SPIN_BUTTON),
                                 controlLiftButton = new JoystickButton(opController, LIFT_BUTTON);

   
   
    // ROBOT CONTAINER
    public RobotContainer() {
        configureButtonActions();
    }


    // CONFIG BUTTON ACTIONS
    private void configureButtonActions() {

        // CONTROL PANEL BUTTONS
        controlSpinButton.whenHeld(Command.controlSpin);
        controlLiftButton.whenPressed(new ControlLiftCommand(controlPanel).withTimeout(3));
    }


    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        // An ExampleCommand will run in autonomous
        return null;

    }

}