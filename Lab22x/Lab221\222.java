class Matrix{
    public int[][] matricesAdd(int[][] m1, int[][] m2){
        int[][] result = new int[m1.length][m1[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public int[][] matricesMult(int[][]m1, int[][]m2){
        if (m1[0].length != m2.length) System.exit(2);//Incorrect matrices


        int[][] result = new int[m1.length][m2[0].length];

        for (int i = 0; i < m1.length ; i++) {
            for (int j = 0; j <m2[0].length ; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;

    }


}
