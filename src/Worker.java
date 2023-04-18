public class Worker extends Person
{

    private double hourlyPayRate;

    public Worker(String idNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(idNum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        double overtime = 0;
        double regular = 0;
        if (hoursWorked > 40)
        {
            overtime = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            hoursWorked = 40;
            regular = hoursWorked * hourlyPayRate;
            return overtime + regular;
        } else
        {
            regular = hoursWorked * hourlyPayRate;
            return regular;
        }
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        if (hoursWorked > 40)
        {
            System.out.println("Hours of Regular Pay: "+hoursWorked);
            System.out.println("Total Regular Pay: $" + 40 * hourlyPayRate);
            System.out.println("Hours of Overtime Pay: " + (hoursWorked - 40));
            System.out.println("Total Overtime Pay: $" + (hoursWorked - 40) * (hourlyPayRate * 1.5));
            System.out.println("Total Pay: $" + calculateWeeklyPay(hoursWorked));
        } else
        {
            System.out.println("Hours of regular pay: " + hoursWorked);
            System.out.println("Total Pay: $" + calculateWeeklyPay(hoursWorked));
        }
        return "";
    }


}