package org.mervegundogmus.oopj.week6.Temperature;

public class Converter implements Temperature {

    private double defaultTemp = 25.0;

    public double Temperature(double defaultTemp){
        return this.defaultTemp = defaultTemp;
    }

    @Override
    public double getTempInFarenheit(double celcius) {
        return ((double)(9/5)*(celcius + 32.0));
    }

    @Override
    public double getTempInCelcius(double farenheit) {
        return ((double)5/9*(farenheit - 32.0));
    }

    @Override
    public double getCurrentTemp() {
        return defaultTemp;
    }

    @Override
    public double setDefaultTemp(double defaultCelcius){
        return this.defaultTemp = defaultCelcius;
    }
}