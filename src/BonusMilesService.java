public class BonusMilesService {
    public int calculate(int cost) {
        int formula = 20;
        int bonusMiles = cost / formula;
        return bonusMiles;
    }
}
