//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OrderSubject order = new OrderSubject();
        order.addObservers(new EmployeeObserver("Barista"));
        order.addObservers(new EmployeeObserver("Oficiant"));

        CustomDrink customDrink = new CustomDrink.Builder("coffee").milk().sugar().build();

        String msg = customDrink + " in " + CafeConfig.getInstance().getCafeName();
        System.out.println(customDrink + " in " + CafeConfig.getInstance().getCafeName());
        order.notifiedAll(msg);
    }
}