public class Main {
    public static void main(String[] args) {
        int price = 8363; // цена билета
        int perMile = 20; //количество рублей для одной бонусной мили
        int bonus = price / perMile; // количество начисленных миль
        System.out.println(bonus);
    }
}
