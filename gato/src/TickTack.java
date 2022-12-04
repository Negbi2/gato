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
    int rOneX = 0,rTwoX = 0, rThreeX = 0;
    int cOneX = 0, cTwoX = 0, cThreeX = 0;
    int dOneX = 0, dTwoX = 0;

    int rOneO = 0,rTwoO = 0, rThreeO = 0;
    int cOneO = 0, cTwoO = 0, cThreeO = 0;
    int dOneO = 0, dTwoO = 0;
    //check if a slot is ocupied
    boolean ocupied11 = false,ocupied12 = false,ocupied13 = false;
    boolean ocupied21 = false,ocupied22 = false,ocupied23 = false;
    boolean ocupied31 = false,ocupied32 = false,ocupied33 = false;

    //coordinate input
    String coordinates = "";
    Scanner in = new Scanner(System.in);

    public void play() {
        while (!coordinates.equals("win")){
            counter ++;


            //print the gameboard
            printScreen();

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

                            if(counter % 2 == 0){
                                rOneX += 1;
                                cOneX += 1;
                                dOneX += 1;
                            }else{
                                rOneO += 1;
                                cOneO += 1;
                                dOneO += 1;
                            }
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
                            if(counter % 2 == 0){
                                rOneX += 1;
                                cTwoX += 1;
                            }else{
                                rOneO += 1;
                                cTwoO += 1;
                            }
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
                            if(counter % 2 == 0){
                                rOneX += 1;
                                cThreeX += 1;
                                dTwoX += 1;
                            }else{
                                rOneO += 1;
                                cThreeO += 1;
                                dTwoO += 1;
                            }
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
                            if(counter % 2 == 0){
                                rTwoX += 1;
                                cOneX += 1;
                            }else{
                                rTwoO += 1;
                                cOneO += 1;
                            }
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
                            if(counter % 2 == 0){
                                rTwoX += 1;
                                cTwoX += 1;
                                dOneX += 1;
                                dTwoX += 1;
                            }else{
                                rTwoO += 1;
                                cTwoO += 1;
                                dOneO += 1;
                                dTwoO += 1;
                            }
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
                            if(counter % 2 == 0){
                                rTwoX += 1;
                                cThreeX += 1;
                            }else{
                                rTwoO += 1;
                                cThreeO += 1;
                            }
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
                            if(counter % 2 == 0){
                                rThreeX += 1;
                                cOneX += 1;
                                dTwoX += 1;
                            }else{
                                rThreeO += 1;
                                cOneO += 1;
                                dTwoO += 1;
                            }
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
                            if(counter % 2 == 0){
                                rThreeX += 1;
                                cTwoX += 1;
                            }else{
                                rThreeO += 1;
                                cTwoO += 1;
                            }
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
                            if(counter % 2 == 0){
                                rThreeX += 1;
                                cThreeX += 1;
                                dOneX += 1;
                            }else{
                                rThreeO += 1;
                                cThreeO += 1;
                                dOneO += 1;
                            }
                        }else{
                            System.out.println("ocupied");
                        }
                    }
                    default -> System.out.println("that is not a valid option");
                }
            }

            //check whose turn is it and allocate the piece
            if (counter % 2 == 0){
                tickTackToe[yCoor][xCoor] = "x";
            }else{
                tickTackToe[yCoor][xCoor] = "o";
            }
            //check if the game has benn won
            if (counter >= 5){
                if(this.hasWon()){
                    printScreen();
                    if (counter % 2 == 0){
                        System.out.println("congratulations on winning x");
                    }else{
                        System.out.println("congratulations on winning o");
                    }
                    return;
                }
            }
            //checks if there has been a tie
            if(counter == 10){
                printScreen();
                System.out.println("it's a tie");
                return;
            }
        }
    }
    public boolean hasWon(){
        if (rOneX == 3){
            coordinates = "win";
            return true;
        }
        if (rTwoX == 3){
            coordinates = "win";
            return true;
        }
        if (rThreeX == 3){
            coordinates = "win";
            return true;
        }
        if (rOneO == 3){
            coordinates = "win";
            return true;
        }
        if (rTwoO == 3){
            coordinates = "win";
            return true;
        }
        if (rThreeO == 3){
            coordinates = "win";
            return true;
        }
        if (cOneX == 3){
            coordinates = "win";
            return true;
        }
        if (cTwoX == 3){
            coordinates = "win";
            return true;
        }
        if (cThreeX == 3){
            coordinates = "win";
            return true;
        }
        if (cOneO == 3){
            coordinates = "win";
            return true;
        }
        if (cTwoO == 3){
            coordinates = "win";
            return true;
        }
        if (cThreeO == 3){
            coordinates = "win";
            return true;
        }
        if (dOneX == 3){
            coordinates = "win";
            return true;
        }
        if (dTwoX == 3){
            coordinates = "win";
            return true;
        }
        if (dOneO == 3){
            coordinates = "win";
            return true;
        }
        if (dTwoO == 3){
            coordinates = "win";
            return true;
        }
        return false;
    }
    public void printScreen(){
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(tickTackToe[fila][columna]);
            }
            System.out.println();
        }
    }
}
