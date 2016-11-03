/*
Copyright (c) 2016 Robert Atkinson

All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted (subject to the limitations in the disclaimer below) provided that
the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list
of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

Neither the name of Robert Atkinson nor the names of his contributors may be used to
endorse or promote products derived from this software without specific prior
written permission.

NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESSFOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcontroller.external.samples.HardwarePushbot;

/**
 This is lawton's TeleOp program :)
 */

@TeleOp(name="Lawtona")

public class Lawton extends OpMode{

    DcMotor left;
    DcMotor right;
    //DcMotor launcher1;
    //DcMotor launcher2;



    double leftwheelpower;
    double rightwheelpower;
    double launcherpower;


    @Override
    public  void init() {
        left = hardwareMap.dcMotor.get("leftwheel");
        right = hardwareMap.dcMotor.get("rightwheel");
        left.setDirection(DcMotor.Direction.REVERSE);

        //launcher1 = hardwareMap.dcMotor.get("particlemotor");
        //launcher2 = hardwareMap.dcMotor.get("particlemotor2");
        //launcher1.setDirection(DcMotor.Direction.REVERSE);

        //leftClaw = hardwareMap.servo.get("leftservo");
        //rightClaw = hardwareMap.servo.get("rightservo");
        //armMovement = hardwareMap.servo.get("arm");
    }

    @Override()
    public void loop(){
        if(gamepad2.right_bumper){
            if (gamepad1.right_bumper){
                leftwheelpower = gamepad1.left_stick_y;
                rightwheelpower = gamepad1.right_stick_y;
                left.setPower(-leftwheelpower);
                right.setPower(-rightwheelpower);
            }
            else {
                leftwheelpower = gamepad2.left_stick_y;
                rightwheelpower = gamepad2.right_stick_y;
                left.setPower(-leftwheelpower);
                right.setPower(-rightwheelpower);
            }
            leftwheelpower = gamepad2.left_stick_y;
            rightwheelpower = gamepad2.right_stick_y;
            left.setPower(-leftwheelpower);
            right.setPower(-rightwheelpower);

        }else {
            leftwheelpower = gamepad1.left_stick_y;
            rightwheelpower = gamepad1.right_stick_y;
            left.setPower(-leftwheelpower);
            right.setPower(-rightwheelpower);
        }
        //launcherpower = gamepad2.left_trigger;
        //launcher1.setPower(-launcherpower);
        //launcher2.setPower(-launcherpower);




        }
    }

