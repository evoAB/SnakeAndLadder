package com.example.snakeandladder;

import javafx.util.Pair;

import java.util.ArrayList;

public class Board {
    ArrayList<Pair<Integer, Integer>> positionCoordinates;

    ArrayList<Integer> snakeLadderPosition;

    public Board() {
        positionCoordinates = new ArrayList<>();
        populatePositionCoordinates();
        populateSnakeLadder();
    }

    private void populatePositionCoordinates() {
        positionCoordinates.add(new Pair<>(0, 0));
        for (int i = 0; i < SnakeLadder.height; i++) {
            for (int j = 0; j < SnakeLadder.width; j++) {
                int xCord = 0;
                if(i%2==0)
                    xCord = j*SnakeLadder.tileSize + SnakeLadder.tileSize/2;
                else
                    xCord = SnakeLadder.tileSize*SnakeLadder.height - (j*SnakeLadder.tileSize) - SnakeLadder.tileSize/2;

                int yCord = SnakeLadder.tileSize* SnakeLadder.height - (i*SnakeLadder.tileSize) - SnakeLadder.tileSize/2;
                positionCoordinates.add(new Pair<>(xCord, yCord));
            }
        }
    }

    private void populateSnakeLadder() {
        snakeLadderPosition = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            snakeLadderPosition.add(i);
        }
        snakeLadderPosition.add(4, 25);
        snakeLadderPosition.add(13, 46);
        snakeLadderPosition.add(27, 5);
        snakeLadderPosition.add(33, 49);
        snakeLadderPosition.add(40, 3);
        snakeLadderPosition.add(42, 63);
        snakeLadderPosition.add(43, 18);
        snakeLadderPosition.add(50, 69);
        snakeLadderPosition.add(54, 31);
        snakeLadderPosition.add(62, 81);
        snakeLadderPosition.add(66, 45);
        snakeLadderPosition.add(76, 58);
        snakeLadderPosition.add(74, 92);
        snakeLadderPosition.add(89, 53);
        snakeLadderPosition.add(99, 41);
    }

    public int getNewPosition (int currentPosition) {
        if(currentPosition>0 && currentPosition<=100)
            return snakeLadderPosition.get(currentPosition);
        return -1;
    }

    int getXCoordinate(int position){
        if(position>=1 && position<=100)
            return positionCoordinates.get(position).getKey();
        return -1;
    }

    int getYCoordinate(int position){
        if(position>=1 && position<=100)
            return positionCoordinates.get(position).getValue();
        return -1;
    }

//    public static void main(String[] args) {
//        Board board = new Board();
//        for (int i = 0; i < board.positionCoordinates.size(); i++) {
//            System.out.println(i + " $ x :" + board.positionCoordinates.get(i).getKey() +
//                    "   y : " + board.positionCoordinates.get(i).getValue()
//            );
//        }
//    }
}
