import java.util.Scanner;
public class TickTack {
    String[][] tickTackToe =
                        {{" ","|"," ","|"," "},
                        {"-","-","-","-","-"},
                        {" ","|"," ","|"," "},
                        {"-","-","-","-","-"},
                        {" ","|"," ","|"," "}};

    //game objects
    int xCoor = 0, yCoor = 0, counter = 1;

    //win conditions
    int rOne = 0,rTwo = 0, rThree = 0;
    int cOne = 0, cTwo = 0, cThree = 0;
    int dOne = 0, dTwo = 0;

    //check if a slot is ocupied
    boolean ocupied11 = false,ocupied12 = false,ocupied13 = false;
    boolean ocupied21 = false,ocupied22 = false,ocupied23 = false;
    boolean ocupied31 = false,ocupied32 = false,ocupied33 = false;

    //coordinate input
    String coordinates = "";
    Scanner in = new Scanner(System.in);

    public void play() {
        while (!coordinates.equals("win")){
            for (int fila = 0; fila < 5; fila++) {
                for (int columna = 0; columna < 5; columna++) {
                    System.out.print(tickTackToe[fila][columna]);
                }
                System.out.println();
            }
            boolean checker = false;
            while (!checker) {
                coordinates = in.next();
                switch (coordinates) {
                    //first row
                    case "1,1" -> {
                        if(!ocupied11){
                            xCoor = 0;
                            yCoor = 0;
                            checker = true;
                            ocupied11 = true;
                        }else{
                            System.out.println("ocupied");
                        }
                    }
                    case "1,2" -> {
                        if(!ocupied12){
                            xCoor = 2;
                            yCoor = 0;
                            checker = true;
                            ocupied12 = true;
                        }else{
                            System.out.println("ocupied");
                        }
                    }
                     case "1,3" -> {
                        if(!ocupied13){
                            xCoor = 4;
                            yCoor = 0;
                            checker = true;
                            ocupied13 = true;
                        }else{
                            System.out.println("ocupied");
                        }
                    }
                    //second row
                    case "2,1" -> {
                         if(!ocupied21){
                            xCoor = 0;
                            yCoor = 2;
                            checker = true;
                            ocupied21 = true;
                        }else{
                            System.out.println("ocupied");
                        }
                    }
                    case "2,2" -> {
                        if(!ocupied22){
                            xCoor = 2;
                            yCoor = 2;
                            checker = true;
                            ocupied22 = true;
                        }else{
                            System.out.println("ocupied");
                        }
                    }
                    case "2,3" -> {
                        if(!ocupied23){
                            xCoor = 4;
                            yCoor = 2;
                            checker = true;
                            ocupied23 = true;
                        }else{
                            System.out.println("ocupied");
                        }
                    }
                    //third row
                    case "3,1" -> {
                        if(!ocupied31){
                            xCoor = 0;
                            yCoor = 4;
                            checker = true;
                            ocupied31 = true;
                        }else{
                            System.out.println("ocupied");
                        }
                    }
                    case "3,2" -> {
                        if(!ocupied32){
                            xCoor = 2;
                            yCoor = 4;
                            checker = true;
                            ocupied32 = true;
                        }else{
                            System.out.println("ocupied");
                        }
                    }
                    case "3,3" -> {
                        if(!ocupied33){
                            xCoor = 4;
                            yCoor = 4;
                            checker = true;
                            ocupied33 = true;
                        }else{
                            System.out.println("ocupied");
                        }
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
