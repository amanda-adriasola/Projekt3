package se.sprinto.hakan.adventuregame.view;

import se.sprinto.hakan.adventuregame.view.UI;

public class FakeUI implements UI {

    private String input;

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public String getInput(String message) {
        return input;
    }

    @Override
    public void showMessage(String message) {
        // Lämnas tom eftersom vi inte behöver se utskrifter under test
    }

}