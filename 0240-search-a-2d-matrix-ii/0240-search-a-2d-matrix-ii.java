class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int t;
        // for(int i=0;i<matrix.length;i++){
        //     if(matrix[i][i]>=target){
        //         t=i;
        //     }
        //     else{
        //         return false;
        //     }
        // }
        // for(int j=0;j<=t;j++){
        //     if(matrix[j][t]==target || matrix[t][j]==target){
        //         return true;
        //     }
           
        // }
       
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]==target){
                return true;
            }
            
        }
    }
     return false;
     }  
}