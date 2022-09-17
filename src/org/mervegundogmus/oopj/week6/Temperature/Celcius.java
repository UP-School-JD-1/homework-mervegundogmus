package org.mervegundogmus.oopj.week6.Temperature;

public class Celcius extends Temperature {
    
    public Celcius(double degree) {
        super(degree);
    }

    @Override
    public double convert(DegreeType type) {
       if (type == DegreeType.Kelvin) {
        return 273+ this.getDegree();
       } else if(type== DegreeType.Fahrenheit){
        return (this.getDegree() * 1.8) + 32;
       }
       return this.getDegree();
    }



    
}
