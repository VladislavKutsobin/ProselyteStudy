package net.proselyte.javacore;

import java.util.Scanner;

class Field {
     char field[] = {'1', '1', '1', '1', '1', '1', '1', '1', '1'};
     int combinations[] = {0,1,2,3,4,5,6,7,8,0,3,6,1,4,7,2,5,8,0,4,8,6,4,2};
     int step = 1;

     int getStep() {
         return step;
     }

     void drawField() {
         System.out.println(field[6] + " " + field[7] + " " + field[8]);
         System.out.println(field[3] + " " + field[4] + " " + field[5]);
         System.out.println(field[0] + " " + field[1] + " " + field[2]);
     }
}

class GameLogic extends Field {
    int CheckWin() {
        int result = 0;
        for(int i=0; i<combinations.length;i+=3 ) {
            if(field[combinations[i]] + field[combinations[i+1]] + field[combinations[i+2]] == 264) return 1;
            else if(field[combinations[i]] + field[combinations[i+1]] + field[combinations[i+2]] == 237) return 2;
            else if(step==10) result = -1;
            else result = 0;
        }
        return result;
    }

    void setVars(int i, char ch) {
        if((i>0 && i<10) && field[i-1]<60) {
            field[i-1] = ch;
            step++;
        }
        else System.out.println("Ошибка!!!");
    }
}

public class GameRunner {
    public static void main(String[] args) throws java.io.IOException {
        GameLogic obj = new GameLogic();
        int index;
        Scanner cin = new Scanner(System.in);
        System.out.println("        Правила игры!       ");
        System.out.println("Каждый игрок по очереди вводит ячейку, которую хочет занять");
        System.out.println("Ниже отображено поле игры");
        obj.drawField();

        while(obj.CheckWin()==0) {
            if(obj.getStep()%2==1) {
                System.out.println("Ход № " + obj.getStep() + " Первого игрока(Х): ");
                index = cin.nextInt();
                obj.setVars(index, 'X');
            }
            else {
                System.out.println("Ход № " + obj.getStep() + " Второго игрока(O): ");
                index = cin.nextInt();
                obj.setVars(index, 'O');
            }

            obj.drawField();
            switch (obj.CheckWin()) {
                case 1:
                    System.out.println("Победа первого игрока");
                    break;
                case 2:
                    System.out.println("Победа второго игрока!");
                    break;
                case -1:
                    System.out.println("Ничья");
                    break;

            }
        }
        cin.close();
    }
}
