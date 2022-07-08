class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
        {
            return false;
        }
        
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0,h=m*n-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(matrix[mid/m][mid%m]==target)
            {
                return true;
            }
            if(matrix[mid/m][mid%m]<target)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return false;
    }
}