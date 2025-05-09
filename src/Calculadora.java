import java.util.Map;

public class Calculadora {

    private double USDaARS;
    private double ARSaUSD;
    private double USDaBRL;
    private double BRLaUSD;
    private double USDaCOP;
    private double COPaUSD;
    public void CalcularTodosLosRatios(Map<String, Double> ratios) {
        USDaARS = ratios.get("ARS");
        ARSaUSD = 1/ratios.get("ARS");
        USDaBRL = ratios.get("BRL");
        BRLaUSD = 1/ratios.get("BRL");
        USDaCOP = ratios.get("COP");
        COPaUSD = 1/ratios.get("COP");
    }

    public double convertirUSDaARS(double cantidad) {
        return cantidad*USDaARS;
    }
    public double convertirARSaUSD(double cantidad) {
        return cantidad*ARSaUSD;
    }
    public double convertirUSDaBRL(double cantidad) {
        return cantidad*USDaBRL;
    }
    public double convertirBRLaUSD(double cantidad) {
        return cantidad*BRLaUSD;
    }
    public double convertirUSDaCOP(double cantidad) {
        return cantidad*USDaCOP;
    }
    public double convertirCOPaUSD(double cantidad) {
        return cantidad*COPaUSD;
    }




}
