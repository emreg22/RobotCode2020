
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
import frc.robot.subsystems.*;

public class RobotContainer {

    // IMPORTING STUFF AND STUFF
    private final ControlPanel CONTROLPANEL = new ControlPanel();

    private final RobotCommands Command = new RobotCommands(CONTROLPANEL);

 
    // == JOYSTICK & BUTTON BINDINGS == //


  
    // NEW JOYSTICK
    public final Joystick driverController = new Joystick(DRIVER_CONTROLLER), opController = new Joystick(OPERATOR_CONTROLLER);
  
    // CONFIG BUTTON BINDINGS (See constants.java to change specific ports etc.)
                                // CLIMB BUTTONS
    private final JoystickButton controlSpinButton = new JoystickButton(opController, SPIN_MOTOR),
                                 controlLiftButton = new JoystickButton(opController, LIFT_MOTOR);

   
   
    // ROBOT CONTAINER
    public RobotContainer() {
        configureButtonActions();
    }


    // CONFIG BUTTON ACTIONS
    private void configureButtonActions() {

        // CONTROL PANEL BUTTONS
        controlSpinButton.whenHeld(Command.controlSpin);
        int x = 0;
        if (x == 0) {
            controlLiftButton.cancelWhenPressed(Command.controlDrop);
            controlLiftButton.whenPressed(Command.controlLift.withTimeout(3));
            x = 1;
        }
        else {
            controlLiftButton.cancelWhenPressed(Command.controlLift);
            controlLiftButton.whenPressed(Command.controlDrop.withTimeout(3));
            x = 0;
        }
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