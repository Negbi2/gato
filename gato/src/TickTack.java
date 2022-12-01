import java.util.Scanner;
public class TickTack {
    String[][] tickTackToe =
                        {{" ","|"," ","|"," "},
                        {"-","-","-","-","-"},
                        {" ","|"," ","|"," "},
                        {"-","-","-","-","-"},
                        {" ","|"," ","|"," "}};

    int xCoor = 0,yCoor = 0, counter = 1;
    String x = "";
    String y = "";
    Scanner in = new Scanner(System.in);

    public void play() {
        while (!x.equals("win") && !y.equals("win")) {
            for (int fila = 0; fila < 5; fila++) {
                for (int columna = 0; columna < 5; columna++) {
                    System.out.print(tickTackToe[fila][columna]);
                }
                System.out.println();
            }
            boolean checker = false;
            while (!checker) {
                x = in.next();
                switch (x) {
                    case "1" -> {
                        xCoor = 0;
                        checker = true;
                    }
                    case "2" -> {
                        xCoor = 2;
                        checker = true;
                    }
                    case "3" -> {
                        xCoor = 4;
                        checker = true;
                    }
                    case "win" -> System.out.println("congratulations you won");
                    default -> System.out.println("that is not a valid option");
                }
            }
            checker = false;
            while (!checker) {
                y = in.next();
                switch (y) {
                    case "1" -> {
                        yCoor = 0;
                        checker = true;
                    }
                    case "2" -> {
                        yCoor = 2;
                        checker = true;
                    }
                    case "3" -> {
                        yCoor = 4;
                        checker = true;
                    }
                    case "win" -> System.out.println("congratulations you won");
                    default -> System.out.println("that is not a valid option");
                }
            }
            counter ++;
            if (counter%2 == 0) {
                tickTackToe[yCoor][xCoor] = "x";
            }else{
                tickTackToe[yCoor][xCoor] = "0";
            }
        }
    }
}
