package org.mervegundogmus.oopj.week6.Temperature;

public interface Temperature {
    public double getTempInFarenheit(double celcius);
    public double getTempInCelcius(double farenheit);
    public double getCurrentTemp();
    public double setDefaultTemp(double defaultCelcius);
    }