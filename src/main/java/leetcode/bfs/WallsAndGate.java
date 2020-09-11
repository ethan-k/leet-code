package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGate {
  int m;
    int n;
    public void wallsAndGates(int[][] rooms) {
           
        if (rooms.length == 0)
            return;
        
        Queue<int[]> q = new LinkedList<>();
        m = rooms.length;
        n = rooms[0].length;
        for(int x=0;x<m;x++) {
            for(int y=0;y<n;y++) {       
                if (rooms[x][y] == 0) {
                    q.offer(new int[] {x, y});            
                }
            }
        }
        
        int depth = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++ ) {
                int[] room = q.poll();    
                int xx = room[0];
                int yy = room[1];
                if (rooms[xx][yy] == 2147483647) {
                    rooms[xx][yy] = depth;
                } else if (rooms[xx][yy] < depth) {
                    continue;
                } else {
                    rooms[xx][yy] = Math.min(rooms[xx][yy], depth);
                }
                if (xx + 1 < m && rooms[xx+1][yy] != -1) {
                    q.offer(new int[] { xx+1, yy});
                }
                if (yy + 1 < n && rooms[xx][yy+1] != -1) {
                    q.offer(new int[] { xx, yy+1});
                }
                
                if (xx -1 >=0 && rooms[xx-1][yy] != -1) {
                    q.offer(new int[] { xx-1, yy});
                }
                if (yy -1 >=0 && rooms[xx][yy-1] != -1) {
                    q.offer(new int[] { xx, yy-1});
                }
            }
            depth++;
            
        }
    }  
}
