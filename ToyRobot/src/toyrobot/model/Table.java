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
public class Table {
    private int xLenght;
    private int yLenght;

    public Table(int xLenght, int yLenght) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
    }

    public Table() {
    }

    public int getxLenght() {
        return xLenght;
    }

    public void setxLenght(int xLenght) {
        this.xLenght = xLenght;
    }

    public int getyLenght() {
        return yLenght;
    }

    public void setyLenght(int yLenght) {
        this.yLenght = yLenght;
    }
    
}
