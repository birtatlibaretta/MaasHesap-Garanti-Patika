public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        double bonus = 0;
        if (workHours > 40) {
            bonus = 30 * (workHours - 40);
        }
        return bonus;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int yearsOfService = currentYear - hireYear;
        double raise = 0;
        if (yearsOfService < 10) {
            raise = salary * 0.05;
        } else if (yearsOfService < 20) {
            raise = salary * 0.1;
        } else {
            raise = salary * 0.15;
        }
        return raise;
    }

    public String toString() {
        return "Ad: " + name + "\nMaaş: " + salary + "\nÇalışma Saati: " + workHours + "\nBaşlangıç Yılı: " + hireYear + "\nVergi: " + tax() + "\nBonus: " + bonus() + "\nMaaş Artışı: " + raiseSalary() + "\nVergi ve bonuslarla birlikte maaş: " + (salary + tax() + bonus()) + "\nToplam Maaş: " + (salary + raiseSalary());
    }

}
