package module5;

class CarDoor {
    private static boolean door;

    public static boolean isDoor() {
	return door;
    }

    public static void setDoor(boolean door) {
	CarDoor.door = door;
    }

    public static boolean isWindow() {
	return window;
    }

    public static void setWindow(boolean window) {
	CarDoor.window = window;
    }

    private static boolean window;

    public CarDoor() {
	door = false;
	window = false;
    }

    public CarDoor(boolean door, boolean window) {
	this.door = door;
	this.window = window;
    }

    public static void openDoor() {
	setDoor(true);
    }

    public static void closedDoor() {
	setDoor(false);
    }

    public static void changeDoor() {
	if (isDoor() == true)
	    closedDoor();
	openDoor();
    }

    public static void openWindows() {
	setWindow(true);

    }

    public static void closedWindow() {
	setWindow(false);
    }

    public static void changeWindow() {
	if (isWindow() == false)
	    openDoor();
	closedWindow();
    }

    public static void status() {
	if (isDoor() == true) 
	    System.out.print("Door open ,");
	System.out.print("Door closed ,");

	if (isWindow() == true)
	    System.out.print("window open");
	System.out.print("window closed");
    }

}
