public class SudokuOrNot {

    public static void main(String[] args) {

        int[][] arr = {
                {8, 1, 2, 7, 5, 3, 6, 4, 9},
                {9, 4, 3, 6, 8, 2, 1, 7, 5},
                {6, 7, 5, 4, 9, 1, 2, 8, 3},
                {1, 5, 4, 2, 3, 7, 8, 9, 6},
                {3, 6, 9, 8, 4, 5, 7, 2, 1},
                {2, 8, 7, 1, 6, 9, 5, 3, 4},
                {5, 2, 1, 9, 7, 4, 3, 6, 8},
                {4, 3, 8, 5, 2, 6, 9, 1, 7},
                {7, 9, 6, 3, 1, 8, 4, 5, 2}};

        boolean isSudoku = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int element = arr[i][j], count = 0;
                for (int k = 0; k < arr[i].length; k++) {
                    if (element == arr[i][k]) {
                        count++;
                    }
                    if (count > 1) {
                        isSudoku = false;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int element = arr[i][j], count = 0;
                for (int k = 0; k < arr[i].length; k++) {
                    if (element == arr[k][j]) {
                        count++;
                    }
                    if (count > 1) {
                        isSudoku = false;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int element1 = arr[i][j], count = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        int element2 = arr[k][l];
                        if (element1 == element2) {
                            count++;
                        }
                        if (count > 1) {
                            isSudoku = false;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                int element1 = arr[i][j], count = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 3; l < 6; l++) {
                        int element2 = arr[k][l];
                        if (element1 == element2) {
                            count++;
                        }
                        if (count > 1) {
                            isSudoku = false;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 9; j++) {
                int element1 = arr[i][j], count = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 6; l < 9; l++) {
                        int element2 = arr[k][l];
                        if (element1 == element2) {
                            count++;
                        }
                        if (count > 1) {
                            isSudoku = false;
                        }
                    }
                }
            }
        }

        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                int element1 = arr[i][j], count = 0;
                for (int k = 3; k < 6; k++) {
                    for (int l = 0; l < 3; l++) {
                        int element2 = arr[k][l];
                        if (element1 == element2) {
                            count++;
                        }
                        if (count > 1) {
                            isSudoku = false;
                        }
                    }
                }
            }
        }

        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                int element1 = arr[i][j], count = 0;
                for (int k = 3; k < 6; k++) {
                    for (int l = 3; l < 6; l++) {
                        int element2 = arr[k][l];
                        if (element1 == element2) {
                            count++;
                        }
                        if (count > 1) {
                            isSudoku = false;
                        }
                    }
                }
            }
        }

        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
                int element1 = arr[i][j], count = 0;
                for (int k = 3; k < 6; k++) {
                    for (int l = 6; l < 9; l++) {
                        int element2 = arr[k][l];
                        if (element1 == element2) {
                            count++;
                        }
                        if (count > 1) {
                            isSudoku = false;
                        }
                    }
                }
            }
        }

        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                int element1 = arr[i][j], count = 0;
                for (int k = 6; k < 9; k++) {
                    for (int l = 0; l < 3; l++) {
                        int element2 = arr[k][l];
                        if (element1 == element2) {
                            count++;
                        }
                        if (count > 1) {
                            isSudoku = false;
                        }
                    }
                }
            }
        }

        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                int element1 = arr[i][j], count = 0;
                for (int k = 6; k < 9; k++) {
                    for (int l = 3; l < 6; l++) {
                        int element2 = arr[k][l];
                        if (element1 == element2) {
                            count++;
                        }
                        if (count > 1) {
                            isSudoku = false;
                        }
                    }
                }
            }
        }

        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                int element1 = arr[i][j], count = 0;
                for (int k = 6; k < 9; k++) {
                    for (int l = 6; l < 9; l++) {
                        int element2 = arr[k][l];
                        if (element1 == element2) {
                            count++;
                        }
                        if (count > 1) {
                            isSudoku = false;
                        }
                    }
                }
            }
        }

        System.out.println("isSudoku = " + isSudoku);
    }
}