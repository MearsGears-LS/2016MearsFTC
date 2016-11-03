
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 This is lawton's TeleOp program :)
 */

@Autonomous(name="LawtonAuto")

public class LawtonAuto extends LinearOpMode{

    DcMotor left;
    DcMotor right;
    //DcMotor launcher1;
    //DcMotor launcher2;

    //Servo leftClaw;
    //Servo rightClaw;
    //Servo armMovement;

    double leftwheelpower;
    double rightwheelpower;
    double launcherpower;


    @Override
    public  void runOpMode() throws InterruptedException {
        left = hardwareMap.dcMotor.get("leftwheel");
        right = hardwareMap.dcMotor.get("rightwheel");
        left.setDirection(DcMotor.Direction.REVERSE);

        //launcher1 = hardwareMap.dcMotor.get("particlemotor");
        //launcher2 = hardwareMap.dcMotor.get("particlemotor2");
        //launcher1.setDirection(DcMotor.Direction.REVERSE);

        //leftClaw = hardwareMap.servo.get("leftservo");
        //rightClaw = hardwareMap.servo.get("rightservo");
        //armMovement = hardwareMap.servo.get("arm");

        waitForStart();
        sleep(9000);
        forward(1);
        sleep(3000);
        forward(1);
        sleep(2000);
        back(0.5);
        sleep(1000);
        right(1);
        sleep(700);
        forward(1);
        sleep(3000);
        forward(0.5);
        sleep(2000);
        back(1);
        sleep(1000);
        right(1);
        sleep(700);
        forward(1);
        sleep(3000);
        forward(1);
        sleep(2000);
        back(0.5);
        sleep(1000);
        right(1);
        sleep(700);
        forward(1);
        sleep(3000);
        forward(0.5);
        sleep(2000);
        back(1);
        sleep(1000);
        right(1);
        sleep(700);
        stop();



    }
    public void forward(double power){
        left.setPower(power);
        right.setPower(power);
    }
    public void stop(double power){
        forward(0);
    }
    public void right(double power){
        left.setPower(power);
        right.setPower(-power);
    }
    public void left(double power){
        left.setPower(-power);
        right.setPower(power);
    }
    public void back(double power){
        left.setPower(-power);
        right.setPower(-power);
    }

}















//Servo leftClaw;
//Servo rightClaw;
//Servo armMovement;





//        if (gamepad2.right_bumper){
//            leftClaw.setPosition(1);
//            rightClaw.setPosition(1);
//        }else{
//            leftClaw.setPosition(0);
//            rightClaw.setPosition(0);

//        if (gamepad2.dpad_up){
//            armMovement.setPosition(1);
//        }else{
//            armMovement.setPosition(0);
//        }
//        launcher1.setPower(1);
