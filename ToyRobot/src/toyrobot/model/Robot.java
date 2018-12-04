/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyrobot.model;

/**
 *
 * @author Diend
 */
public class Robot {
    private int xPosition;
    private int yPosition;
    private Direction direction;

    public Robot(int xPosition, int yPosition, Direction direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public Robot() {
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return xPosition + "," + yPosition + "," + direction.getStrDirection();
    }
}
