class Solution {
    public static boolean isEmpty(char[][] board,int [] emptyCell){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    emptyCell[0]=i;
                    emptyCell[1]=j;
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isSafe(char[][] board,char charValue,int colIndex,int rowIndex){
        //horizontal
        for(int col=0;col<9;col++){
            if(board[rowIndex][col]==charValue){
                return false;
            }
        }
        for(int row=0;row<9;row++){
            if(board[row][colIndex]==charValue){
                return false;
            }
        }
        int row=rowIndex-rowIndex%3;
        int col=colIndex-colIndex%3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int actualR=row+i;
                int actualC=col+j;
                if(board[actualR][actualC]==charValue){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean solveSudokuHelp(char[][] board){
        int[] emptyCell=new int[2];
        if(!isEmpty(board,emptyCell)){
            return true;
        }
        int rowIndex=emptyCell[0];
        int colIndex=emptyCell[1];
        for(int value=1;value<=9;value++){
            char charValue=(char)(value+'0');
            if(isSafe(board,charValue,colIndex,rowIndex)){
                board[rowIndex][colIndex]=charValue;
                if(solveSudokuHelp(board)==true){
                    return true;
                }
                board[rowIndex][colIndex]='.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        solveSudokuHelp(board);
    }
}