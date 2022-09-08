package org.mervegundogmus.oopj.week7.Employee;

public class Test {



	public static void main(String[] args )throws SalaryPaidOnBankException {
  
        Employee merve = new Employee(5, "Merve", 10, "Engineer") {
			
			@Override
			public void work() {
				// TODO Auto-generated method stub
				
			}
		};
		
        try {
             System.out.println(merve);
             double salary = merve.calculateSalary();
             System.out.print("Your salary: " + salary + " ");
             if (salary >= 7000) {
                 throw new SalaryPaidOnBankException("Salary paid on bank exception");
             }else System.out.println();
            } 
        catch (SalaryPaidOnBankException salaryPaidOnBankException) {
                System.out.println("\n" + salaryPaidOnBankException.getMessage());
            } 
        finally {
               
            }

    }


}

    
