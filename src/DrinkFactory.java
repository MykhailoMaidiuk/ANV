
public class DrinkFactory {

public static Drink createDrink(String type){
    if(type.equalsIgnoreCase("tea")){
        return new Tea();
    } else if (type.equalsIgnoreCase("coffee")) {
        return new Coffee();
    }else
    throw new IllegalArgumentException("Choose correct drink");
}
}
