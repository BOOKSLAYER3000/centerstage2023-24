package org.firstinspires.ftc.teamcode.drive.opmode.autonomous.CenterStage;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;


@Config
@Autonomous
public class TEST extends LinearOpMode {

    private SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

    @Override
    public void runOpMode() throws InterruptedException {
drive.setWrist(true);
drive.initArm();
drive.
    }

    /*

    public void setWrist(boolean wrist_) {
        double intakePos = 0.0, backDropPos = 10;

        if (wrist_) {
            drive.leftGripServo.setPosition(backDropPos);
        } else if (!wrist_) {

            drive.wristGripServo.setPosition(intakePos);
        }
        public void initArm (); {
            stopAndResetMotors();
            setGrip(false);
            setSlideVelocity(0, slideLeft, slideRight, slideTop);
            setHeight(0);
            setExtension(0);
            restartMotors();
        }

        public void setHeight ( int height){
            slideLeft.setTargetPosition(height);
            slideRight.setTargetPosition(-height);
        }

        public void setExtension ( int ext){
            slideTop.setTargetPosition(-ext);
        }

        public void setSlideVelocity ( int vel, DcMotorEx...motors){
            for (com.qualcomm.robotcore.hardware.DcMotorEx motor : motors) {
                motor.setVelocity(vel);
            }

        }

    }

     */
}