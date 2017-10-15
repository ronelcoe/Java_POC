package com.coding.game;

public class Thor2D {

	public static void main(String[] args) {
        int lightX = 31; //in.nextInt(); // the X position of the light of power
        int lightY = 4; //in.nextInt(); // the Y position of the light of power
        int initialTX = 5; //in.nextInt(); // Thor's starting X position
        int initialTY = 4; //in.nextInt(); // Thor's starting Y position
	    
        String direction = "";
        if(initialTX < lightX) {
            ++initialTX;
            if (initialTY < lightY) {
                ++initialTY;
                direction = "SE";
            } else if (initialTY == lightY) {
                direction = "E";
            } else {
                --initialTY;
                direction = "NE";
            }
        } else if (initialTX > lightX) {
            --initialTX;
            if (initialTY < lightY) {
                ++initialTY;
                direction = "SW";
            } else if(initialTY == lightY) {
                direction = "W";    
            } else {
                --initialTX;
                direction = "NW";    
            }
        }  else if((initialTX == lightX) && (initialTY < lightY)) {
            ++initialTY;
            direction = "S";
        } else if((lightX == initialTX) && (initialTY > lightY)) {
            --initialTY;
            direction = "N";
        }
        
        /*
        if((initialTX < lightX) && (initialTY < lightY)) {
            ++initialTX;
            ++initialTY;
            direction = "SE";
        } else if((initialTX < lightX) && (initialTY > lightY)) {
            ++initialTX;
            --initialTY;
            direction = "NE";
        } else if((initialTX > lightX) && (initialTY < lightY)) {
            --initialTX;
            ++initialTY;
            direction = "SW";
        } else if((initialTX > lightX) && (initialTY > lightY)) {
            --initialTX;
            --initialTY;
            direction = "NW";    
        } else if((initialTX < lightX) && (initialTY == lightY)) {
            ++initialTX;
            direction = "E";
        } else if((initialTX > lightX) && (initialTY == lightY)) {
            --initialTX;
            direction = "W";    
        } else if((initialTX == lightX) && (initialTY < lightY)) {
            ++initialTY;
            direction = "S";
        } else if((lightX == initialTX) && (initialTY > lightY)) {
            --initialTY;
            direction = "N";
        }
        */
	}

}
