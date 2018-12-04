/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyrobot.controller;

import toyrobot.model.Table;

/**
 *
 * @author Diend
 */
public class TableController {
    private final Table table;

    public TableController() {
        this.table = new Table(4,4);
    }

    public Table getTable() {
        return table;
    }
    
    public boolean validPosition(int x, int y) {
        if (y > table.getyLenght() 
                || y < 0 
                || x > table.getxLenght()
                || x < 0 ) {
            return false;
        } else {
            return true;
        }
    }
}
