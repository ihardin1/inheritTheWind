import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        Worker worker1, worker2, worker3;
        SalaryWorker salary1, salary2, salary3;
        ArrayList<Worker> workerList = new ArrayList<Worker>();

        workerList.add(new Worker("000001", "Jason", "blaacker", "Mr.", 1992, 20.00));
        workerList.add(new Worker("000002", "tristen", "helgen", "Mr.", 1998, 16.00));
        workerList.add(new Worker("000003", "jeremy", "wald", "Mr.", 1987, 15.00));
        workerList.add(new SalaryWorker("000004", "aalaya", "brown", "Mrs.", 1996, (20000/(52*40)), 20000));
        workerList.add(new SalaryWorker("000005", "asia", "hardin", "Mrs.", 2000, (50000/(52*40)), 50000));
        workerList.add(new SalaryWorker("000006", "chris", "helgen", "Mr.", 1973, (52000/(52*40)), 52000));

        for(Worker worker : workerList)
        {
            System.out.println("Week 1");
            System.out.println(worker.displayWeeklyPay(30));
        }
        for(Worker worker : workerList)
        {
            System.out.println("Week 2");
            System.out.println(worker.displayWeeklyPay(50));
        }
        for(Worker i : workerList)
        {
            System.out.println("Week 3");
            System.out.println(i.displayWeeklyPay(40));
        }
    }
}
