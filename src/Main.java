public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonusTicketL = service.calculate(100);
        System.out.println("Меньший:бонус милей" + bonusTicketL);
        int bonusTicketA = service.calculate(500);
        System.out.println("Средний:бонус милей" + bonusTicketA);
        int bonusTicketH = service.calculate(1_000);
        System.out.println("Максимальный:бонус милей" + bonusTicketH);
    }
}
