// Last updated: 7/8/2026, 3:38:27 PM
class Solution {
    public int numRookCaptures(char[][] board) {
        int row=0,col=0,r=0,c=0;
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7;j++){
                if(board[i][j]=='R'){
                    row=i;
                    col=j;
                    break;
                }
            }
        }
        int count=0;
        r=row;
        c=col;
        while(r>=0 && board[r][c]!='B'){
            if(board[r][c]=='p'){
                count++;
                break;
            }
            r--;
        }
        r=row;
        c=col;
         while(r<=7 && board[r][c]!='B'){
            if(board[r][c]=='p'){
                count++;
                break;
            }
            r++;
        }
        r=row;
        c=col;
        while(c<=7 && board[r][c]!='B'){
            if(board[r][c]=='p'){
                count++;
                break;
            }
            c++;
        }
        r=row;
        c=col;
        while(c>=0 && board[r][c]!='B'){
            if(board[r][c]=='p'){
                count++;
                break;
            }
            c--;
        }
        return count;
        
    }
}