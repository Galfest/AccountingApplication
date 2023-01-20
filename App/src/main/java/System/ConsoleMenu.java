package System;


import java.util.Scanner;

public class ConsoleMenu {

    public static void consoleMenu() {
        System.out.println("Убедитесь что MySQL Server запущен.\nЕсли готовы продолжать, введите Да");
//        new Scanner(System.in);
        String answer = new Scanner(System.in).nextLine();
        if (answer.equals("Да")) {
            DBConnector.connectToDB();
            System.out.println("Добро пожаловать в программу учета\nВыберите доступные действия:\n1.Заведение новой позиции.\n2.Посмотреть список функций.\n3.Добавить новую функцию.");
            Scanner scanner = new Scanner(System.in);
            int use = scanner.nextInt();
            switch (use) {
                case (1):
                    System.out.println("Введите номер команды:");
                    int answer1 = new Scanner(System.in).nextInt();
                    System.out.println("1");
                    break;
                case (2):
                    System.out.println("Введите номер команды:");
                    int answer2 = new Scanner(System.in).nextInt();
                    System.out.println("2");
                    break;
                case (3):
                    System.out.println("Введите номер команды:");
                    int answer3 = new Scanner(System.in).nextInt();
                    System.out.println("3");
                    break;

            }
        }
        else {
            System.out.println("Подключите базу и запустите программу еще раз.");
        }
    }
}
