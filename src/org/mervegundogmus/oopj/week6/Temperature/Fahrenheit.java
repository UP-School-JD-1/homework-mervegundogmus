package org.mervegundogmus.oopj.week6.Temperature;

public class Fahrenheit extends Temperature {

    public Fahrenheit(double degree) {
        super(degree);
    }

    @Override
    public double convert(DegreeType type) {
        if (type == DegreeType.Celcius) {
            return (this.getDegree() - 32) * .5556;
           } else if(type== DegreeType.Kelvin){
            return (this.getDegree() + 459.67) * 5/9;
           }
           return this.getDegree();
    }
    
}
