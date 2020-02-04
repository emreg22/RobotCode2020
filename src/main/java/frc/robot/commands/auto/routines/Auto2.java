/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.auto.routines;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.RobotCommands;
import frc.robot.commands.auto.*;
import frc.robot.subsystems.*;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html

// Auto Routine #2
public class Auto2 extends SequentialCommandGroup {
    /**
     * Creates a new Auto2.
     */
    public Auto2(RobotCommands cmd, Drivetrain train) {
        
        // Put commands in the super() call
        
        super(
                //Align and Shoot
                // TODO: Align
                //new Align(train, paddy),
                cmd.shootAtSpeed,

                //Turn and move to bottom wall; move, turn, & move
                new MoveCommand(train, -17, 0.5),
                new TurnCommand(train, 90, 0.5),
                new MoveCommand(train, 136, 0.5),

                //Move to position; move & turn
                new MoveCommand(train, -27.75, 0.5),
                new TurnCommand(train, 90, 0.5),

                //move all the way to the third ball and collect them allnew CollectionAuto1(train),
                cmd.finalDeployPiston,
                new MoveCommand(train, 300, 0.5),
                cmd.finalRetractIntake

                // TODO: this stuff
                //Turn and move to target
                //, new TurnCommand(train, 180, 0.5),
                //new Align(train, paddy),

                //Shoot
                //cmd.shootAtSpeed
        );
    }
}