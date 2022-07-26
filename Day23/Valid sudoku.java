class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet ans=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!ans.add("row"+i+board[i][j]) || !ans.add("col"+j+board[i][j]) || !ans.add("box"+(i/3)*3+j/3 +board[i][j])){
                        return false;
                    }
                }
                }
            }
return true;
    }
}