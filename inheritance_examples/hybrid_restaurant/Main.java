public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[] {
            new Chef("Karan", 201),
            new Waiter("Priya", 202)
        };

        for (Worker w : workers) {
            w.performDuties();
        }
    }
}
