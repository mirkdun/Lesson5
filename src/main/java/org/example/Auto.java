package org.example;

public class Auto {
    private String name = "Honda";
    private int enginePower = 250;
    private String bodyType = "Coupe";
    private double maxSpeed = 261.45;
    private String color = "Red";

    public Auto() {
    }

    public Auto(String name, int enginePower, String color, double maxSpeed, String bodyType) {
        this.name = name;
        this.enginePower = enginePower;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void vrum() {
        System.out.println("ВРУМ-ВРУМ");
    }

    public void bip() {
        System.out.println("БИП-БИП");
    }

    public void vyiy() {
        System.out.println("ВВУУУУУИИИИУУУУУУУУУ");
    }

    public void elements() {
        System.out.println("Название: " + name);
        System.out.println("Мощность двигателя: " + enginePower + " лс");
        System.out.println("Тип кузова: " + bodyType);
        System.out.println("Максимальная скорость: " + maxSpeed + " км/час");
        System.out.println("Цвет: " + color);
    }
}

