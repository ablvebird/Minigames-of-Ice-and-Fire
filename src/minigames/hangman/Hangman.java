package minigames.hangman;

import toolkit.CSVScribe;

import java.util.List;

public class Hangman {


    String selectedCharacter;
    char[] splitCharacter;
    char[] splitEncripted;
    char letterInput;
    int chances;

    public Hangman(){
        List<String> characters = CSVScribe.readCSV("");
    }

    public void selectCharacter(){

    }

    public void splitCharacter(){
        //Method receives a String and splits it in an array of chars, returning it
    }

    public void matchCharacterInput(){
    }

    public void matchFound(){

    }

    //GETTERS & SETTERS
    public List<String> getCharacters() {
        return characters;
    }
    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    public String getSelectedCharacter() {
        return selectedCharacter;
    }
    public void setSelectedCharacter(String selectedCharacter) {
        this.selectedCharacter = selectedCharacter;
    }

    public char[] getSplitCharacter() {
        return splitCharacter;
    }
    public void setSplitCharacter(char[] splitCharacter) {
        this.splitCharacter = splitCharacter;
    }

    public char getLetterInput() {
        return letterInput;
    }
    public void setLetterInput(char letterInput) {
        this.letterInput = letterInput;
    }


}
