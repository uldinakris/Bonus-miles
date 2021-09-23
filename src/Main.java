public class Main {
    public static void main(String[] args) {
        int ticketCost = 10_000;
        BonusMilesService service = new BonusMilesService();
        int bonusMiles = service.calculate(ticketCost);
        System.out.println(bonusMiles);
    }
}

