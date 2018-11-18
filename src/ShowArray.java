public class ShowArray {
    public ShowArray() {
    }

    public static void main(String[] args) {

        int[][][] array = {{{1, 2, 3}, {1, 2}}};

        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k <array[i][j].length; k++) {

                    array[i][j][k] = 1;
                    1++
                    System.out.println(array);  nice try
                }
            }
        }*/

int[] oneD = {1,2}; //int[] =new int [2]
int[][] dwoD = {{1,2},{2,3}}; //int [] [] = new int [1][2];

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print("array");
                    System.out.print("[" + i + "]");
                    System.out.print("[" + j + "]");

                    System.out.print("[" + k + "]");
                    System.out.println(" " + array[i][j][k]);


                }
            }
        }
    }
}