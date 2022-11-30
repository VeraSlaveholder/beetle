package Task32;

public class RobotMovement {
    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot.getX());
        System.out.println(robot.getY());
        moveRobot(robot, -10, 20);
        System.out.println(robot.getX());
        System.out.println(robot.getY());


    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.RIGHT);
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        } else if (robot.getX() > toX) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.LEFT);
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }
        if (robot.getY() < toY) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.UP);
            do {
                robot.stepForward();
            } while (robot.getY()!=toY);
        }else if(robot.getY() > toY) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.DOWN);
            do {
                robot.stepForward();
            } while (robot.getY()!=toY);
        }
    }
}
