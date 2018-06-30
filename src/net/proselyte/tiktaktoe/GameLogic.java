package net.proselyte.tiktaktoe;

import java.util.Scanner;

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

    void SetVars(int i, char ch) {
        if((i>0 && i<10) && field[i-1]<60) {
            field[i-1] = ch;
            step++;
        }
        else System.out.println("Ошибка!!!");
    }

    void Start() {
        int index;
        Scanner cin = new Scanner(System.in);
        System.out.println("        RULES       ");
        System.out.println("Each player in turn selects the cell that he wants to occupy ");
        System.out.println("Below is the game field");
        DrawField();

        while(CheckWin()==0) {
            if(GetStep()%2==1) {
                System.out.println("Step № " + GetStep() + " first player(Х): ");
                index = cin.nextInt();
                SetVars(index, 'X');
            }
            else {
                System.out.println("Step № " + GetStep() + " Second player(O): ");
                index = cin.nextInt();
                SetVars(index, 'O');
            }

            DrawField();
            switch (CheckWin()) {
                case 1:
                    System.out.println("First player wins");
                    break;
                case 2:
                    System.out.println("Second player wins");
                    break;
                case -1:
                    System.out.println("Dead heat");
                    break;
            }
        }
        cin.close();
    }
}