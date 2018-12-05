/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyrobot;

import java.util.Scanner;
import toyrobot.controller.RobotController;
import toyrobot.model.Direction;

/**
 *
 * @author Diend
 */
public class ToyRobotMain {
    static Scanner scanner = new Scanner(System.in);
    static RobotController robotController = new RobotController();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        standardInput();
    }
    
    public static void standardInput(){
        //Save "PLACE" word
        String placeWord    = scanner.next();
        
        //Save robot initialize position
        String inputRobot[] = scanner.next().split(",");
        scanner.nextLine();
        checkInitWord(placeWord, inputRobot);
    }
    
    //Check validation of "PLACE" word and initialize robot's position
    public static void checkInitWord(String placeWord, String[] inputRobot) {
        if (!placeWord.equals("PLACE") 
                || !robotController.getTableController()
                        .validPosition(Integer.parseInt(inputRobot[0]), 
                                Integer.parseInt(inputRobot[1]))) {
            System.out.println("Invalid Input");
        } else {
            robotController = new RobotController(Integer.parseInt(inputRobot[0]), 
                    Integer.parseInt(inputRobot[1]), 
                    Direction.valueOf(inputRobot[2]));
            String actionWord = scanner.nextLine();
            checkInputWord(actionWord);            
            System.out.println(robotController.report());
        }
    }
    
    public static void checkInputWord(String actionWord) {
        while (!actionWord.equals("REPORT")) {
            switch (actionWord) {
                case "MOVE":
                    robotController.move();
                    break;
                case "LEFT":
                    robotController.left();
                    break;
                case "RIGHT":
                    robotController.right();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            actionWord = scanner.nextLine();
        }
    }
}
