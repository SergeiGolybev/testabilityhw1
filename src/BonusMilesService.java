public class BonusMilesService {
    public int calculate(int price) {
        int milesForRub = 20;
        int bonusMiles = price / milesForRub;
        return bonusMiles;
    }
}
