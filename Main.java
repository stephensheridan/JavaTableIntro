class Main {
  public static void main(String[] args) {
    // Create a table of integer using a list
    // 4 rows X 5 cols
    int[][] data = {{1,2,3,4,5},
                    {1,2,3,4,5},
                    {1,2,3,4,5},
                    {1,2,3,4,5}};

    // NOTES: data.length gives the number of rows and
    // data[0].length gives the number of columns
    
    // Let's print the table row by row
    System.out.println("Table printed row by row");
    for(int i = 0; i < data.length; i++){
      for(int j = 0; j < data[0].length; j++){
        System.out.printf("data[%d][%d] = %d\n", i,j,data[i][j]);
      }
    }

    // Let's print the table column by column
    System.out.println("Table printed column by column");
    for(int j = 0; j < data[0].length; j++){
      for(int i = 0; i < data.length; i++){
        System.out.printf("data[%d][%d] = %d\n", i,j,data[i][j]);
      }
    }
  }
}