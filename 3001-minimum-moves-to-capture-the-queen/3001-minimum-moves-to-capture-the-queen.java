class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {

    int tempRow = c;
    int tempCol = d;

    while(tempCol < 9 && tempRow < 9) {
        if(tempRow == a && tempCol == b) {
            break;
        }

        if(tempRow == e && tempCol == f) {
            return 1;
        }
        tempCol++;
        tempRow++;
    }

    tempRow = c;
    tempCol = d;
    while(tempCol >= 0 && tempRow < 9) {
        if(tempRow == a && tempCol == b) {
            break;
        }
        if(tempRow == e && tempCol == f) {
            return 1;
        }
        tempCol--;
        tempRow++;
    }

    tempRow = c;
    tempCol = d;
    while(tempCol < 9 && tempRow >= 0) {
        if(tempRow == a && tempCol == b) {
            break;
        }
        if(tempRow == e && tempCol == f) {
            return 1;
        }
        tempCol++;
        tempRow--;
    }

    tempRow = c;
    tempCol = d;
    while(tempCol >= 0 && tempRow >= 0) {
        if(tempRow == a && tempCol == b) {
            break;
        }
        if(tempRow == e && tempCol == f) {
            return 1;
        }
        tempCol--;
        tempRow--;
    }

    tempRow = a;
    while(tempRow >= 0) {
        if(tempRow == c && b == d) {
            break;
        }
        if(tempRow == e && b == f) {
            return 1;
        }
        tempRow--;
    }

    tempRow = a;
    while(tempRow < 9) {
        if(tempRow == c && b == d) {
            break;
        }
        if(tempRow == e && b == f) {
            return 1;
        }
        tempRow++;
    }

    tempCol = b;
    while(tempCol >= 0) {
        if(a == c && tempCol == d) {
            break;
        }
        if(a == e && tempCol == f) {
            return 1;
        }
        tempCol--;
    }

    tempCol = b;
    while(tempCol < 9) {
        if(a == c && tempCol == d) {
            break;
        }
        if(a == e && tempCol == f) {
            return 1;
        }
        tempCol++;
    }

    return 2;
}


}