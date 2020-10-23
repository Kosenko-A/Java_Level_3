package ru.geekbrains.homeworks;

public abstract class Mashins implements Runnable {
    protected String name;
    protected float fuelVolume;
    protected float fuelConsumption;
    protected float size;
    protected FuelStation fuelStation;

    public Mashins(String name, float fuelVolume, float fuelConsumption, FuelStation fuelStation) {
        this.name = name;
        this.fuelVolume = fuelVolume;
        this.fuelConsumption = fuelConsumption;
        this.size = fuelVolume;
        this.fuelStation = fuelStation;
    }

    public void move() throws InterruptedException {
        while (true) {
            System.out.println(
                    String.format(
                            "%s is starting... It's fuel volume: %s",
                            name,
                            fuelVolume));
            size -= fuelConsumption;
            System.out.println(
                    String.format(
                            "%s is driving. It's fuel volume: %s",
                            name,
                            size));

            if (size <= 2.0f) {
                System.out.println(
                        String.format(
                                "%s need more fuel",
                                name));
                size = fuelStation.refuel(fuelVolume);
            }
            Thread.sleep(3000);
        }

    }

    @Override
    public void run() {
        try {
            move();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
