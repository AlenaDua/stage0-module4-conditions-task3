package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        //Basic Salary <= 10000: taxes - 15%.
        //10000 < Basic Salary <= 20000: taxes - 18%
          //      Basic Salary > 20000 : taxes - 20%

        if (salary > 0  ) {
            if (salary <= 10000) {
               double salary1 = (double) salary * 0.85;
                System.out.printf("%.1f\n", salary1);
            } else if (salary <= 20000) {
                double salary2 = (double) salary * 0.82;
                System.out.printf("%.1f\n", salary2);
            } else if (salary > 20000) {
                double salary3 = (double) salary * 0.80;
                System.out.printf("%.1f\n", salary3);
            }
        } else {
            System.out.println("wrong input!");
        }

    }
}
