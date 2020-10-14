package ru.geekbrains.homeworks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class TransportMove {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3);
        ExecutorService executorService = Executors.newCachedThreadPool();
        FuelStation fuelStation = new FuelStation(semaphore);

        for (int i = 0; i<3; i++){
            executorService.execute(
                    new Car ("Car "+ i, fuelStation)
            );
        }
        for (int i = 0; i<3; i++){
            executorService.execute(
                    new Truck ("Truck "+ i, fuelStation)
            );
        }
        for (int i = 0; i<3; i++){
            executorService.execute(
                    new Bus ("Bus "+ i, fuelStation)
            );
        }
            executorService.shutdown();
    }
}
