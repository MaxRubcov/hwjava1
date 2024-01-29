public class Main {
    public static void main(String[] args) {
        int price = 8363; // цена билета
        int x = 20; //количество рублей для одной бонусной мили
        int bonus = price / x; // количество начисленных миль
        System.out.println(bonus);
    }
}
