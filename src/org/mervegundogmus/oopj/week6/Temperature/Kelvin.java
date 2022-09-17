package org.mervegundogmus.oopj.week6.Temperature;

public class Kelvin extends Temperature {

    public Kelvin(double degree) {
        super(degree);
    }

    @Override
    public double convert(DegreeType type) {
        if (type == DegreeType.Celcius) {
            return this.getDegree() - 273;
           } else if(type== DegreeType.Fahrenheit){
            return 1.8*(this.getDegree()-273) + 32;
           }
           return this.getDegree();
    }
    
}
