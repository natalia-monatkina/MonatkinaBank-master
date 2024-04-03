package bank;

import java.util.Scanner;

public class ATM {
    public  void  start() {
        showStartATMInfo();
        checkUserChoice();
    }
    private void checkUserChoice () {
        String choice = getScannerData();
        switch (choice) {
            case "1" -> showATMFunctionality();
            case "2" -> askAdminData();
            default -> showChoiceError();
        }
    }
    private void  askCardData() {
        System.out.println("Вставьте карту.");
        String cardNumber = getScannerData();
        checkPinCode(cardNumber);
    }
    private void checkPinCode(String cardNumber) {
        for (int i=0; i<Bank.getAccounts().size(); i++) {
            if(cardNumber.equals(Bank.getAccounts().get(i).getClient().getCard().getCARD_NUMBER())) {
                System.out.println("Введите пин-код:");
                String pinCode = getScannerData();
                if (pinCode.equals(Bank.getAccounts().get(i).getClient().getCard().getPinCode())){
                    System.out.println("Добро пожаловать в банкомат!");
                }
            }
        }
    }
    private void showStartATMInfo () {
        System.out.println("Добро пожаловать! Выберите действие:");
        System.out.println("1 - Вставить карту");
        System.out.println("2 - Создать лицевой счёт ");
    }
    private String getScannerData () {
        return new Scanner(System.in).nextLine();
    }
    private void showChoiceError () {
        System.out.println("Попробуйте еще раз");
        checkUserChoice();
    }
    private void askAdminData() {
        System.out.println("Для создания лицевого счета вы должны указать некоторые данные, а именно: ..." );
    }
    private void showATMFunctionality() {
        System.out.println("Выберите действие:\n" +"1- Вывести деньги\n" +"2- Пополнить счет\n" +"3- Перевести\n" +"4- Оплатить квитанцию" );
    }
}