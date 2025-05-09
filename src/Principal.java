import java.io.IOException;
import java.util.Map;

//BOB - Boliviano boliviano
//BRL - Real brasileño
//CLP - Peso chileno
//COP - Peso colombiano
//USD - Dólar estadounidense

//para obtener el ratio a cierta moneda, luego de obtener el map del exchange accedemos a sus ratios directamente asi->
//double BOB = ratios.get("BOB");
public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConsultaDeAPI consulta = new ConsultaDeAPI();
        Map<String, Double> ratios = consulta.consultarExchange();

        Calculadora calc = new Calculadora();
        calc.CalcularTodosLosRatios(ratios);

        MenuUsuario menu = new MenuUsuario();
        menu.printMenu(calc);


    }
}
