import java.util.Scanner;

public class MenuUsuario {
    public void printMenu(Calculadora calc) {
        Scanner sc = new Scanner(System.in);
        double cantidadIngresada = 0;
        Double cantidadCalculada = 0.0;

        String inputMenu = "0";

        while (!inputMenu.equals("7")) {
            String monedaOrigen = "";
            String monedaDestino = "";

            System.out.println("""
                    ----------------------------------------------
                    "BIENVENIDO AL CONVERSOR DE MONEDAS"
                    Elija la conversión a realizar
                                    
                    1) Dólar =>> Peso Argentino
                    2) Peso Argentino =>> Dólar
                    3) Dólar =>> Real Brasileño
                    4) Real Brasileño =>> Dólar
                    5) Dólar =>> Peso Colombiano
                    6) Peso Colombiano =>> Dólar
                    7) Salir
                    ----------------------------------------------
                    """);
            inputMenu = sc.nextLine();

//            if (inputMenu.equals("7")||!inputMenu.matches(".*[1-6].*")){
//                continue;
//            }

            if (inputMenu.equals("7")) {
                continue;
            } else if (!inputMenu.matches("[1-6]")) {
                System.out.println("Input Erroneo, intentelo de nuevo \nPresione Enter para proseguir");
                sc.nextLine();
                continue;
            }
            System.out.println("Ingrese cantidad a convertir: ");
            cantidadIngresada=sc.nextDouble();
            sc.nextLine();



            switch (inputMenu) {
                case "1":
                    cantidadCalculada = calc.convertirUSDaARS(cantidadIngresada);
                    monedaOrigen = "USD";
                    monedaDestino = "ARS";
                    break;
                case "2":
                    cantidadCalculada = calc.convertirARSaUSD(cantidadIngresada);
                    monedaOrigen = "ARS";
                    monedaDestino = "USD";
                    break;
                case "3":
                    cantidadCalculada = calc.convertirUSDaBRL(cantidadIngresada);
                    monedaOrigen = "USD";
                    monedaDestino = "BRL";
                    break;
                case "4":
                    cantidadCalculada = calc.convertirBRLaUSD(cantidadIngresada);
                    monedaOrigen = "BRL";
                    monedaDestino = "USD";
                    break;
                case "5":
                    cantidadCalculada = calc.convertirUSDaCOP(cantidadIngresada);
                    monedaOrigen = "USD";
                    monedaDestino = "COP";
                    break;
                case "6":
                    cantidadCalculada = calc.convertirCOPaUSD(cantidadIngresada);
                    monedaOrigen = "COP";
                    monedaDestino = "USD";
                    break;
                default:
                    System.out.println("Input erróneo en menú");
                    continue;
            }

            System.out.println(cantidadIngresada + " " + monedaOrigen + " = " + cantidadCalculada + " " + monedaDestino);
            System.out.println("Oprima Enter para continuar, o ingrese 7 para salir");
            inputMenu = sc.nextLine();


        }
        System.out.println("¡Gracias por usar el Conversor de Moneda!");
    }
}
