/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {  

  // === ROBOT PORTS === //

  // MOTORS
  // DRIVE MOTORS
  public static final int FRONT_LEFT_DRIVE_MOTOR = 0;
  public static final int BACK_LEFT_DRIVE_MOTOR = 1;
  public static final int FRONT_RIGHT_DRIVE_MOTOR = 2;
  public static final int BACK_RIGHT_DRIVE_MOTOR = 3;

  // INTAKE MOTORS
  public static final int WHEEL_INTAKE_MOTOR = 4;
  public static final int DEPLOY_INTAKE_MOTOR = 5;

  // CLIMBER MOTORS
  public static final int LIFTER_MOTOR = 6;
  public static final int GEAR_MOTOR1 = 7;
  public static final int GEAR_MOTOR2 = 8;

  // SHOOTER MOTORS
  public static final int SHOOTER_MOTOR_1 = 9;
  public static final int SHOOTER_MOTOR_2 = 10;
  public static final int SHOOTER_MOTOR_3 = 11;
  
  // CONTROL PANEL MOTORS
  public static final int SPIN_MOTOR = 12;

  // STORAGE MOTOR
  public static final int STORAGE_GATE_MOTOR = 13;

  // PISTONS
  // INTAKE PISTONS
  public static final int INTAKE_PISTON_1 = 4;
  public static final int INTAKE_PISTON_2 = 5;

  // CONTROL PANEL PISTONS
  public static final int LIFT_PISTON_1 = 6;
  public static final int LIFT_PISTON_2 = 7;

  // SENSORS
  public static final int COLOR_SENSOR_PORT = 4;

  // ENCODERS
  public static final int LEFT_ENCODER_PORT = 0; // port 1 is reserved
  public static final int RIGHT_ENCODER_PORT = 2; // port 3 is reserved


  // === CONTROLLERS === //

  // STICKS
  public static final int HORIZ_AXIS_LEFT = 0;
  public static final int FORWARD_AXIS_LEFT = 1;
  public static final int FORWARD_AXIS_RIGHT = 2;
  public static final int HORIZ_AXIS_RIGHT = 3;

  // TRIGGERS
  public static final int LEFT_TRIGGER_AXIS = 7;

  // CONTROLLERS
  public static final int DRIVER_CONTROLLER = 0;
  public static final int OPERATOR_CONTROLLER = 1;

  // OP CONTROLLER BUTTONS
  // CLIMBING
  public static final int RAISE_LIFTER = 5;
  public static final int LOWER_LIFTER = 6;
  public static final int GEAR_BUTTON = 7;

  // SHOOTING
  public static final int SHOOTER_WHEEL_TOGGLE = 8;
  public static final int SHOOT_BUTTON = 9;

  // INTAKE
  public static final int DEPLOY_RETRACT_INTAKE = 3;
  public static final int ON_OR_OFF_INTAKE = 1;

  // CONTROL PANEL
  public static final int LIFT_CONTROL = 4;
  public static final int SPIN_CONTROL = 10;
  public static final int MATCH_CONTROL = 11;

  // STORAGE
  public static final int STORAGE_MOTOR = 2;


  // === SPEED CONSTANTS === //
  // INTAKE
  public static final double DEPLOY_INTAKE_SPEED = 0.5;
  public static final double WHEEL_INTAKE_SPEED = 0.5;

  // STORAGE
  public static final double GATE_SPEED = 0.3;
  

  
}

