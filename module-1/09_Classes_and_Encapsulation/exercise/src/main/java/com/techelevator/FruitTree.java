package com.techelevator;

public class FruitTree {
// Instance Variables
    private String typeOfFruit;
    private int piecesOfFruitLeft;
// Getters & Setters
    public String getTypeOfFruit(){
        return typeOfFruit;
    }
    public int getPiecesOfFruitLeft(){
        return piecesOfFruitLeft;
    }
//Constructor
    public FruitTree( String typeOfFruit, int startingPiecesOfFruit){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = piecesOfFruitLeft;
    }
// Methods
    public boolean pickFruit(int numberOfPiecesToRemove){
        boolean isThereStillFruit = true;
        piecesOfFruitLeft = getPiecesOfFruitLeft();
            if(piecesOfFruitLeft <= numberOfPiecesToRemove){
                isThereStillFruit = false;
                }else{
                    piecesOfFruitLeft = piecesOfFruitLeft-numberOfPiecesToRemove;
                }
                return isThereStillFruit = true;

    }

}
