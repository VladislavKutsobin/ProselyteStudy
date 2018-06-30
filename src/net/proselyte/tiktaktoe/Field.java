package net.proselyte.tiktaktoe;

class Field {
    char field[] = {'1', '1', '1', '1', '1', '1', '1', '1', '1'};
    int combinations[] = {0,1,2,3,4,5,6,7,8,0,3,6,1,4,7,2,5,8,0,4,8,6,4,2};
    int step = 1;

    int GetStep() {
        return step;
    }

    void DrawField() {
        System.out.println(field[6] + " " + field[7] + " " + field[8]);
        System.out.println(field[3] + " " + field[4] + " " + field[5]);
        System.out.println(field[0] + " " + field[1] + " " + field[2]);
    }
}
