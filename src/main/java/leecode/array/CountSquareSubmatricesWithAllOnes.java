package leecode.array;

public class CountSquareSubmatricesWithAllOnes {

  int width;
  int height;
  int[][] matrix;
  public int countSquares(int[][] matrix) {
    int count=0;
    if (matrix.length==0)
      return count;
    this.matrix=matrix;
    height=matrix.length;
    width=matrix[0].length;

    int maxSide = Math.min(height, width);
    for(int side=1; side<=maxSide; side++) {
      for(int i=0;i<height;i++) {
        for(int j=0; j<width;j++) {
          if (matrix[i][j] == 1)
            if(checkSide(i,j,side)) {
              count++;
            }
        }

      }
    }


    return count;
  }

  boolean checkSide(int x, int y, int length) {
    if (x+length > height || y+length > width)
      return false;
    for(int i=x; i<x+length;i++) {
      for(int j=y; j<y+length;j++) {
        if (this.matrix[i][j] != 1)
          return false;
      }
    }
    return true;
  }

}
