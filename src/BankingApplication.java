import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер вашей операционной системы. Android - 1, IOS - 0.");
        int clientOS = input.nextInt();
        System.out.println("Введите год производства телефона");
        int yearsOfPhoneCreation = input.nextInt();
        int clientDeviceYear = 2015;

        if (clientOS == 1){
            if (yearsOfPhoneCreation >= clientDeviceYear){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0){
            if (yearsOfPhoneCreation >= clientDeviceYear){
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        } else {
            System.out.println("На вашу операционную систему невозможно установить приложение");
        }
    }
}
