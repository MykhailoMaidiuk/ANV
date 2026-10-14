//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       // System.out.printf(CafeConfig.getInstance().getCafeName());
        System.out.println(DrinkFactory.createDrink("tea").serve() +
                " in " + CafeConfig.getInstance().getCafeName());
        System.out.println(DrinkFactory.createDrink("coffee").serve() +
                " in " + CafeConfig.getInstance().getCafeName());
        System.out.println(DrinkFactory.createDrink("pepsi").serve() +
                " in " + CafeConfig.getInstance().getCafeName());
    }
}