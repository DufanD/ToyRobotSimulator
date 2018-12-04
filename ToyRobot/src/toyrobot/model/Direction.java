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
public enum Direction {
    
    NORTH("NORTH", 1), EAST("EAST", 2), SOUTH("SOUTH", 3), WEST("WEST", 4);
    
    private final String strDirection;
    private final int intDirection;
    private static final Direction[] vals = values();
    
    public Direction next()
    {
        if ((this.ordinal()+1) % vals.length > vals.length)
            return vals[0];
        return vals[(this.ordinal()+1) % vals.length];
    }
    
    public Direction previous()
    {
        if ((this.ordinal()-1) % vals.length < 0)
            return vals[vals.length-1];
        return vals[(this.ordinal()-1) % vals.length];
    }
    
    private Direction(String strDirection, int intDirection) {
        this.strDirection = strDirection;
        this.intDirection = intDirection;
    }

    public String getStrDirection() {
        return strDirection;
    }

    public int getIntDirection() {
        return intDirection;
    }
}
