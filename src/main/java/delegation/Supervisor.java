package delegation;

public class Supervisor {
    Worker worker= new Worker();
    public void prepareReport(){
        worker.prepareReport();
    }
}
