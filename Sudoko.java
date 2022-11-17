import java.util.*;
public class Sudoko {
    public boolean isSafe(char[][] board,int row,int col,int num){
        for(int i=0;i<board.length;i++){
            if(board[i][col]==(char)(num+'0')){
                return false;
            }
        }
        for(int j=0;j<board.length;j++){
            if(board[row][j]==(char)(num+'0')){
                return false;
            }
        }
        int sr=3*(row/3);
        int sc=3*(col/3);
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==(char)(num+'0')){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char[][] board,int row,int col){
        if(row==board.length){
            return true;
        }
        int nrow=0;
        int ncol=0;
        if(col==board.length-1){
            nrow=row+1;
            ncol=0;
        }
        else{
            nrow=row;
            ncol=col+1;
        }
        if(board[row][col]!='.'){
            if(helper(board,nrow,ncol)){
                return true;
            }
        }
        else{
            for(int i=0;i<9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=(char)(i+'0');
                    if(helper(board, nrow, ncol)){
                        return true;
                    }
                    else{
                        board[row][col]='.';
                    }  
                }
            }
        }
        return false;
    }
    public void sudokoSol(char[][] board){
        helper(board,0,0);
        System.out.println("Sudoko");
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        char[][] board=new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=input.next().charAt(0);
            }
        }
        input.close();
        Sudoko obj=new Sudoko();
        obj.sudokoSol(board);

    }
}
