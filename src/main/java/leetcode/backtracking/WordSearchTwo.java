pacakge leetcode.backtracking;

class TrieNode {
  HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
  String word = null;
  TrieNode() {}
}

class WordSearchTwo [
     char[][] board; 
    List<String> ret;
    int ROWS;
    int COLS; 
    
    public List<String> findWords(char[][] board, String[] words) {
    
        this.board = board;
        TrieNode root = new TrieNode();
        this.ret = new ArrayList<>();
        
        for(String word: words) {
            TrieNode node = root;
            for(char c: word.toCharArray()) {
                if(!node.children.containsKey(c)) {
                    TrieNode tmp = new TrieNode();
                    node.children.put(c, tmp);
                    node = node.children.get(c);
                } else 
                  node = node.children.get(c);
            }
            node.word = word;
        }
        
        ROWS = board.length;
        COLS = board[0].length;
        
        for(int row=0;row<ROWS;row++)
            for(int col=0;col<COLS;col++)
                backtracking(root, row, col);
        

        return ret;
    }
    
    void backtracking(TrieNode node, int row, int col) {
        if (node.word != null && !ret.contains(node.word))
            ret.add(node.word);
            
        if (row < 0 || col < 0 || row >= this.ROWS || col >= this.COLS)
            return;
        
        char c = this.board[row][col];
        
        if (node.children.containsKey(c)) {
            this.board[row][col] = '#';
            
            int[][] dirs = new int[][] {
                {1,0},
                {0,-1},
                {-1, 0},
                {0, 1},
            };

            for(int[] dir: dirs) {
                backtracking(node.children.get(c), row + dir[0], col+dir[1]);
            }
            
            this.board[row][col] = c;
        }
        
       if (node.children.isEmpty()) {
          node.children.remove(c);
        }
    }
    
    
]