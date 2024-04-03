package bank;

import javax.management.StringValueExp;

public class Card {
    private final String CARD_NUMBER;
    private String pinCode;
    public  Card() {
        CARD_NUMBER = generateNumbers(16);
        pinCode = generateNumbers(4);
    }
    private  int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    private  String generateNumbers(int lenght) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i < lenght; i++) {
            builder.append(rnd(0,9));
        }
        return  builder.toString();
    }
    private void generatePinCode() {
        String pin = "";
        for (int i = 0; i < 4; i++) {
            pin += String.valueOf(rnd(0, 9));
        }
    }

    public Card(String CARD_NUMBER) {
        this.CARD_NUMBER = CARD_NUMBER;
    }

    public String getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}