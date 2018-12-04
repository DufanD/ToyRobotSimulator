/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyrobot.controller;

import toyrobot.model.Direction;
import toyrobot.model.Robot;

/**
 *
 * @author Diend
 */
public class RobotController {
    private Robot robot;
    private TableController tableController;
    
    public RobotController(int x, int y, Direction direction){
        robot = new Robot(x, y, direction);
        tableController = new TableController();
    }

    public RobotController() {
        robot = new Robot();
        tableController = new TableController();
    }
    
    public void move(){
        switch (robot.getDirection().getStrDirection()) {
            case "NORTH":
                if (tableController.validPosition(0, robot.getyPosition() + 1))
                    robot.setyPosition(robot.getyPosition() + 1);
                break;
            case "EAST":
                if (tableController.validPosition(robot.getxPosition() + 1, 0))
                    robot.setxPosition(robot.getxPosition() + 1);
                break;
            case "SOUTH":
                if (tableController.validPosition(0, robot.getyPosition() - 1))
                    robot.setyPosition(robot.getyPosition() - 1);
                break;
            case "WEST":
                if (tableController.validPosition(robot.getxPosition() - 1, 0))
                    robot.setxPosition(robot.getxPosition() - 1);
                break; 
        }
    }
    
    public void right() {
        robot.setDirection(robot.getDirection().next());
    }
    
    public void left() {
        robot.setDirection(robot.getDirection().previous());
    }
    
    public String report() {
        return robot.toString();
    }

    public TableController getTableController() {
        return tableController;
    }
}
