package com.tms.task4;

import com.tms.task4.car.*;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private HashMap<Car, Integer> carFleet;
    private int sedanAmount;
    private int crossoverAmount;
    private int minivanAmount;
    private int cabrioletAmount;

    public void parkTheCar(Car car) {

        if (this.carFleet == null) {
            this.carFleet = new HashMap<>();
        }

        if (car instanceof Sedan) {
            setSedanAmount(getSedanAmount() + 1);
            updateSedanCarValue();
        } else {
            if (car instanceof Crossover) {
                setCrossoverAmount(getCrossoverAmount() + 1);
                updateCrossoverCarValue();
            } else {
                if (car instanceof Minivan) {
                    setMinivanAmount(getMinivanAmount() + 1);
                    updateMinivanCarValue();
                } else {
                    setCabrioletAmount(getCabrioletAmount() + 1);
                    updateCabrioletCarValue();
                }
            }
        }
        int amount = countCertainCarTypeInGarage(car);
        this.carFleet.put(car, amount);
    }

    public void leftTheGarage(Car car) {
        if (this.carFleet != null) {
            this.carFleet.remove(car);
        }

        if (car instanceof Sedan) {
            setSedanAmount(getSedanAmount() - 1);
            updateSedanCarValue();
        } else {
            if (car instanceof Crossover) {
                setCrossoverAmount(getCrossoverAmount() - 1);
                updateCrossoverCarValue();
            } else {
                if (car instanceof Minivan) {
                    setMinivanAmount(getMinivanAmount() - 1);
                    updateMinivanCarValue();
                } else {
                    setCabrioletAmount(getCabrioletAmount() - 1);
                    updateCabrioletCarValue();
                }
            }
        }
    }

    private int countCertainCarTypeInGarage(Car car) {
        if (car instanceof Sedan) {
            return getSedanAmount();
        } else {
            if (car instanceof Crossover) {
                return getCrossoverAmount();
            } else {
                if (car instanceof Minivan) {
                    return getMinivanAmount();
                } else {
                    return getCabrioletAmount();
                }
            }
        }
    }

    private void updateSedanCarValue() {
        for (Map.Entry<Car, Integer> item : carFleet.entrySet()) {
            if (item.getKey() instanceof Sedan) {
                carFleet.put(item.getKey(), getSedanAmount());
            }
        }
    }

    private void updateCrossoverCarValue() {
        for (Map.Entry<Car, Integer> item : carFleet.entrySet()) {
            if (item.getKey() instanceof Crossover) {
                carFleet.put(item.getKey(), getCrossoverAmount());
            }
        }
    }

    private void updateMinivanCarValue() {
        for (Map.Entry<Car, Integer> item : carFleet.entrySet()) {
            if (item.getKey() instanceof Minivan) {
                carFleet.put(item.getKey(), getCrossoverAmount());
            }
        }
    }

    private void updateCabrioletCarValue() {
        for (Map.Entry<Car, Integer> item : carFleet.entrySet()) {
            if (item.getKey() instanceof Cabriolet) {
                carFleet.put(item.getKey(), getCabrioletAmount());
            }
        }
    }

    public HashMap<Car, Integer> getCarFleet() {
        return this.carFleet;
    }

    public int getSedanAmount() {
        return sedanAmount;
    }

    public void setSedanAmount(int sedanAmount) {
        this.sedanAmount = sedanAmount;
    }

    public int getCrossoverAmount() {
        return crossoverAmount;
    }

    public void setCrossoverAmount(int crossoverAmount) {
        this.crossoverAmount = crossoverAmount;
    }

    public int getMinivanAmount() {
        return minivanAmount;
    }

    public void setMinivanAmount(int minivanAmount) {
        this.minivanAmount = minivanAmount;
    }

    public int getCabrioletAmount() {
        return cabrioletAmount;
    }

    public void setCabrioletAmount(int cabrioletAmount) {
        this.cabrioletAmount = cabrioletAmount;
    }
}
