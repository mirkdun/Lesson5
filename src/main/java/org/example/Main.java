package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Auto mazda = new Auto();

        System.out.println("Введите название: ");
        String name = scanner.nextLine();
        mazda.setName(name);

        System.out.println("Введите мощность двигателя: ");
        int enginePower = Integer.parseInt(scanner.nextLine());
        mazda.setEnginePower(enginePower);

        System.out.println("Введите тип кузова: ");
        String bodyType = scanner.nextLine();
        mazda.setBodyType(bodyType);

        System.out.println("Введите максимальную скорость: ");
        double maxSpeed = Double.parseDouble(scanner.nextLine());
        mazda.setMaxSpeed(maxSpeed);

        System.out.println("Введите цвет: ");
        String color = scanner.nextLine();
        mazda.setColor(color);

        if (mazda.getMaxSpeed() < 100) {
            mazda.bip();
        } else if (mazda.getMaxSpeed() >= 100 && mazda.getMaxSpeed() <= 200) {
            mazda.vrum();
        } else if (mazda.getMaxSpeed() > 200) {
            mazda.vyiy();
        }

        mazda.elements();
    }
}
