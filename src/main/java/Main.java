import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Converter converter = new Converter();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Калькулятор");
            System.out.println("2. Конвертер");
            System.out.println("3. Выйти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showCalculatorMenu(scanner, calculator);
                    break;
                case 2:
                    showConverterMenu(scanner, converter);
                    break;
                case 3:
                    System.out.println("До свидания!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    public static void showCalculatorMenu(Scanner scanner, Calculator calculator) {
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Вернуться в предыдущее меню");

        int operation = scanner.nextInt();

        if(operation >= 1 && operation <= 4) {
            System.out.println("Введите два числа:");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            switch (operation) {
                case 1:
                    System.out.println("Результат: " + calculator.adding(x, y));
                    break;
                case 2:
                    System.out.println("Результат: " + calculator.subtracting(x, y));
                    break;
                case 3:
                    System.out.println("Результат: " + calculator.multiplying(x, y));
                    break;
                case 4:
                    System.out.println("Результат: " + calculator.dividing(x, y));
                    break;
            }
        } else if (operation == 5) {
            return;
        }  else {
            System.out.println("Неверный выбор. Попробуйте снова.");
        }
    }

    private static void showConverterMenu(Scanner scanner, Converter converter) {
        System.out.println("Выберите операцию:");
        System.out.println("1. Десятичная в бинарную");
        System.out.println("2. Бинарная в десятичную");
        System.out.println("3. Десятичная в восьмеричную");
        System.out.println("4. Восьмеричная в десятичную");
        System.out.println("5. Десятичную в шестнадцатеричную");
        System.out.println("6. Шестнадцатеричная в десятичную");
        System.out.println("7. Вернуться в предыдущее меню");

        int operation = scanner.nextInt();

        if(operation >= 1 && operation <= 6) {
            System.out.println("Введите число:");
            String value = scanner.next();

            switch (operation) {
                case 1:
                    System.out.println("Результат: " + converter.decimalToBinary(value));
                    break;
                case 2:
                    System.out.println("Результат: " + converter.binaryToDecimal(value));
                    break;
                case 3:
                    System.out.println("Результат: " + converter.decimalToOctal(value));
                    break;
                case 4:
                    System.out.println("Результат: " + converter.octalToDecimal(value));
                    break;
                case 5:
                    System.out.println("Результат: " + converter.decimalToHex(value));
                case 6:
                    System.out.println("Результат: " + converter.hexToDecimal(value));
                    break;
            }
        } else if (operation == 7) {
            return;
        } else {
            System.out.println("Неверный выбор. Попробуйте снова.");
        }
    }
}