class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int i = 0;
        Set<Character> map = new HashSet<>(); 
        while (i < 9) {
            for (int j = 0; j < 9; j++) {
                 if (board[i][j] == '.') {
                          
                    } else {
                                if (map.contains(board[i][j])) { 
                                            return false;
                                } else {
                                          map.add(board[i][j]);
                                 }
                    }
                }
                map.clear(); 
                i++;
            }
        map.clear();
           i=0;
            //cloumn logic
            while (i < 9) {
            for (int j = 0; j < 9; j++) {
                 if (board[j][i] == '.') {
                          
                    } else {
                                if (map.contains(board[j][i])) { 
                                            return false;
                                } else {
                                          map.add(board[j][i]);
                                 }
                    }
                }
                map.clear(); 
                i++;
            }
        map.clear();
        i=0;
        while(i<9){
            for(int j=0;j<3;j++){
                if (board[j][i] == '.') {
                          //j++;
                    } else {
                     //System.out.println(board[j][i]);
                                if (map.contains(board[j][i])) { 
                                            return false;
                                } else {
                                          map.add(board[j][i]);
                                 }
                    }
                }
               if(i == 2 || i == 5){
                map.clear();
                  // System.out.println();
               }
                i++;

            }
        map.clear();
        i=0;
          while(i<9){
            for(int j=3;j<6;j++){
                if (board[j][i] == '.') {
                          //j++;
                    } else {
                    //System.out.println(board[j][i]);
                                if (map.contains(board[j][i])) { 
                                            return false;
                                } else {
                                          map.add(board[j][i]);
                                 }
                    }
                }
               if(i == 2 || i == 5){
                map.clear();
                  // System.out.println();
               }
                i++;
            
            }
        map.clear();
        i=0;
                while(i<9){
            for(int j=6;j<9;j++){
                if (board[j][i] == '.') {
                         // j++;
                    } else {
                    //System.out.println(board[j][i]);
                                if (map.contains(board[j][i])) { 
//System.out.println(j+" "+i);
                                            return false;
                                } else {
                                          map.add(board[j][i]);
                                 }
                    }
                }
               if(i == 2 || i == 5){
                map.clear();
                 //  System.out.println();
               }
                i++;
            
            }
        
        
        return true;
    }
}
