public class SalaryWorker extends Worker{
    double annualSalary;

    public SalaryWorker(String idNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(idNum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return (annualSalary / 52);
    }

    @Override
    public String displayWeeklyPay(double hoursWorked)
    {
        System.out.println("Weekly Pay: $" + String.format("%.2f", calculateWeeklyPay(hoursWorked)));
        return "";
    }
}