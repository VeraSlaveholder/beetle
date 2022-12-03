package Task42;

public class Robot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int n = 0;
        for (int i = 0; i < 3; i++) {
            n++;
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw new RobotConnectionException("error");
                }
            }
        }
    }
}
