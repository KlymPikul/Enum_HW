public class Main {
    public static void main(String[] args) {
        Color color = Color.GREEN;
        System.out.println("RGB код цвета " + color + ": " + color.getRGBCode());

        Coin coin = Coin.DIME;
        System.out.println("Номинал монеты " + coin + ": " + coin.getValue() + " cents");

        Month month = Month.JUNE;
        System.out.println("Дней в месяце " + month + ": " + month.getDays());

    }
}
