// Last updated: 7/8/2026, 3:35:01 PM
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin=celsius+273.15;
        double far=celsius*1.80+32.00;
        return new double[]{kelvin,far};
        
    }
}