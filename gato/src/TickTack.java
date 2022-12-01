import java.util.Scanner;
public class TickTack {
    String[][] tickTackToe =
                        {{" ","|"," ","|"," "},
                        {"-","-","-","-","-"},
                        {" ","|"," ","|"," "},
                        {"-","-","-","-","-"},
                        {" ","|"," ","|"," "}};

    int xCoor = 0, yCoor = 0, counter = 1;
    int rOne = 0,rTwo = 0, rThree = 0;
    int cOne = 0, cTwo = 0, cThree = 0;
    int dOne = 0, dTwo = 0;
    String x = "";
    Scanner in = new Scanner(System.in);



    public void play() {
        while (!x.equals("win")){
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
                    //first row
                    case "1,1" -> {
                        xCoor = 0;
                        yCoor = 0;
                        checker = true;
                    }
                    case "1,2" -> {
                        xCoor = 0;
                        yCoor = 2;
                        checker = true;
                    }
                     case "1,3" -> {
                        xCoor = 0;
                        yCoor = 4;
                        checker = true;
                    }
                    //second row
                    case "2,1" -> {
                        xCoor = 2;
                        yCoor = 0;
                        checker = true;
                    }
                    case "2,2" -> {
                        xCoor = 2;
                        yCoor = 2;
                        checker = true;
                    }
                    case "2,3" -> {
                        xCoor = 2;
                        yCoor = 4;
                        checker = true;
                    }
                    //third row
                    case "3,1" -> {
                        xCoor = 4;
                        yCoor = 0;
                        checker = true;
                    }
                    case "3,2" -> {
                        xCoor = 4;
                        yCoor = 2;
                        checker = true;
                    }
                    case "3,3" -> {
                        xCoor = 4;
                        yCoor = 4;
                        checker = true;
                    }
                    default -> System.out.println("that is not a valid option");
                }
            }

            //check whose turn is it and alocate the piece
            counter ++;
            if (counter % 2 == 0){
                tickTackToe[yCoor][xCoor] = "x";
            }else{
                tickTackToe[yCoor][xCoor] = "o";
            }
        }
    }
}
