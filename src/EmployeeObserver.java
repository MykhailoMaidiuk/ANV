public class EmployeeObserver implements Observer{


    private String name;

    public EmployeeObserver(String name) {
        this.name = name;
    }


    @Override
    public void upate(String status) {
        System.out.println(name + " notified:" + status);
    }


}
