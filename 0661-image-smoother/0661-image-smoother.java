class Solution {
    public int[][] imageSmoother(int[][] img) {
        int row = img.length;
        int cols = img[0].length;
        int[][] result = new int[row][cols];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < cols; j++){
                int sum = 0;
                int count = 0;
                for(int m = i - 1; m <= i + 1; m++){
                    for(int n = j - 1; n <= j + 1; n++){
                        if(m >= 0 && m < row && n >= 0 && n < cols){
                            sum += img[m][n];
                            count++;
                        }
                    }
                }
                result[i][j] = sum / count;
            }
        }
        return result;
    }
}