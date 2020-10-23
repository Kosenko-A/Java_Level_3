package ru.geekbrains.homeworks;

import java.util.concurrent.Semaphore;

public class FuelStation {
    private Semaphore semaphore;

    public FuelStation(Semaphore semaphore){
        this.semaphore = semaphore;
    }
    public float refuel(float fuel){
        try {
            semaphore.acquire();
            Thread.sleep(5000);
            return fuel;
        }catch (Exception e){
            throw new RuntimeException("SWW", e);
        }finally {
            semaphore.release();
        }
    }

}
