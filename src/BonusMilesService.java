public class BonusMilesService {
    public int calculate(int ticketCost) {
        int oneMileBonus = 20;
        int bonusMiles = ticketCost / oneMileBonus;
        return bonusMiles;
    }
}