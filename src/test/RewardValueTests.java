package src.test;

public class RewardValueTests {

    @Test
    public void testCashToMilesConversion() {
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035;
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.001);
    }

    private void assertEquals(double expectedMiles, double milesValue, double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testMilesToCashConversion() {
        double milesValue = 20000.0;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        double expectedCash = milesValue * 0.0035;
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.001);
    }

    // Existing tests that already pass
    @Test
    public void testGetCashValue() {
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), 0.001);
    }

    @Test
    public void testGetMilesValue() {
        double milesValue = 20000.0;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue(), 0.001);
    }
}

