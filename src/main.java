public class main {
    public static void main(String[] args) {

        int price = 29_007;

        int milesEquivalent = 20;

        int bonus = price / milesEquivalent;

        System.out.println("Вами потрачено: " + price + " рублей");
        System.out.println("Вами накоплено: " + bonus + " бонусных миль");

    }
}
