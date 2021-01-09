package module5;

class CarDoor {
    public static boolean isDoorDriver() {
	return doorDriver;
    }

    public static void setDoorDriver(boolean doorDriver) {
	CarDoor.doorDriver = doorDriver;
    }

    public static boolean isDoorPassengerFront() {
	return doorPassengerFront;
    }

    public static void setDoorPassengerFront(boolean doorPassengerFront) {
	CarDoor.doorPassengerFront = doorPassengerFront;
    }

    public static boolean isDoorPassengerRearLeft() {
	return doorPassengerRearLeft;
    }

    public static void setDoorPassengerRearLeft(boolean doorPassengerRearLeft) {
	CarDoor.doorPassengerRearLeft = doorPassengerRearLeft;
    }

    public static boolean isDoorPassengerRearRight() {
	return doorPassengerRearRight;
    }

    public static void setDoorPassengerRearRight(boolean doorPassengerRearRight) {
	CarDoor.doorPassengerRearRight = doorPassengerRearRight;
    }

    public static boolean isWindowDriver() {
	return windowDriver;
    }

    public static void setWindowDriver(boolean windowDriver) {
	CarDoor.windowDriver = windowDriver;
    }

    public static boolean isWindowPassengerFront() {
	return windowPassengerFront;
    }

    public static void setWindowPassengerFront(boolean windowPassengerFront) {
	CarDoor.windowPassengerFront = windowPassengerFront;
    }

    public static boolean isWindowPassengerRearLeft() {
	return windowPassengerRearLeft;
    }

    public static void setWindowPassengerRearLeft(boolean windowPassengerRearLeft) {
	CarDoor.windowPassengerRearLeft = windowPassengerRearLeft;
    }

    public static boolean isWindowPassengerRearRight() {
	return windowPassengerRearRight;
    }

    public static void setWindowPassengerRearRight(boolean windowPassengerRearRight) {
	CarDoor.windowPassengerRearRight = windowPassengerRearRight;
    }

    private static boolean doorDriver;
    private static boolean doorPassengerFront;
    private static boolean doorPassengerRearLeft;
    private static boolean doorPassengerRearRight;
    private static boolean windowDriver;
    private static boolean windowPassengerFront;
    private static boolean windowPassengerRearLeft;
    private static boolean windowPassengerRearRight;

    public CarDoor() {
	doorDriver = false;
	doorPassengerFront = false;
	doorPassengerRearLeft = false;
	doorPassengerRearRight = false;
	windowDriver = false;
	windowPassengerFront = false;
	windowPassengerRearLeft = false;
	windowPassengerRearRight = false;
    }

    public CarDoor(boolean doorDriver, boolean doorPassengerFront, boolean doorPassengerRearLeft,
	    boolean doorPassengerRearRight, boolean windowDriver, boolean windowPassengerFront,
	    boolean windowPassengerRearLeft, boolean windowPassengerRearRight) {
	this.doorDriver = doorDriver;
	this.doorPassengerFront = doorPassengerFront;
	this.doorPassengerRearLeft = doorPassengerRearLeft;
	this.doorPassengerRearRight = doorPassengerRearRight;
	this.windowDriver = windowDriver;
	this.windowPassengerFront = windowPassengerFront;
	this.windowPassengerRearLeft = windowPassengerRearLeft;
	this.windowPassengerRearRight = windowPassengerRearRight;

    }
}
