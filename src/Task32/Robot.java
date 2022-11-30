package Task32;

public class Robot {
    int x ;
    int y ;
    Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void turnLeft() {
        switch (direction){
            case UP -> {
                direction=Direction.LEFT;
                break;
            }
            case LEFT -> {
                direction=Direction.DOWN;
                break;
            }
            case DOWN -> {
                direction=Direction.RIGHT;
                break;
            }
            case RIGHT -> {
                direction=Direction.UP;
                break;
            }
        }
        System.out.println(direction);
    }

    public void turnRight() {
        switch (direction){
            case UP -> {
                direction=Direction.RIGHT;
                break;
            }
            case RIGHT -> {
                direction=Direction.DOWN;
                break;
            }
            case DOWN -> {
                direction=Direction.LEFT;
                break;
            }
            case LEFT -> {
                direction=Direction.UP;
                break;
            }
        }
        System.out.println(direction);
    }

    public void stepForward() {
        if (direction == Direction.UP) {
            System.out.println("шаг вверх");
            this.y++;
        }
        if (direction == Direction.DOWN) {
            System.out.println("шаг вниз");
            this.y--;
        }
        if (direction == Direction.LEFT) {
            System.out.println("шаг налево");
            this.x--;
        }
        if (direction == Direction.RIGHT) {
            System.out.println("шаг направо");
            this.x++;
        }
    }
}
