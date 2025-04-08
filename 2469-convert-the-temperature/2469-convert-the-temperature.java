class Solution {
    public double[] convertTemperature(double celsius) {
        double[] doublex = new double[2];
        doublex[0]=celsius +273.15000;
        doublex[1]= celsius*1.8 + 32.00000;
        return doublex;
        
    }
}