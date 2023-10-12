package org.firstinspires.ftc.teamcode;

public class Intake extends LinearOpMode{
    // I declared the motor here
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor Intake = null;
    public void runOpMode() {
        Intake = hardwareMap.get(DcMotor.class, "Intake");
        Intake.setDirection(DcMotor.Direction.FORWARD);

        // Wait for the game to start (driver presses PLAY)
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            double max;

            double start   = -gamepad1.;
            double Intake  = start

            Intake.setPower(Intake);
            
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("Front left/Right", "%4.2f, %4.2f", leftFrontPower, rightFrontPower);
            telemetry.addData("Back  left/Right", "%4.2f, %4.2f", leftBackPower, rightBackPower);
            telemetry.update();
        }





}}
