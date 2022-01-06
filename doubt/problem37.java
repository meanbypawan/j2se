/*
 Create class Tile to store the edge length of a square 
 tile , and create another class Floor to store
  length and width of a rectangular floor. 
  Add method totalTiles(Tile t) in Floor class 
  with Tile as argument to calculate the whole number 
  of tiles needed to cover the floor completely.
*/
class Tile{
  private int edgeLength;
  public Tile(int edgeLength){
    this.edgeLength = edgeLength;
  }
  public int getEdgeLength(){
    return edgeLength;
  }
}
class Floor{
  private int length;
  private int width;
  public Floor(int length, int width){
    this.length = length;
    this.width = width;
  }
  public int totalTiles(Tile t){
     return (length*width)/(t.getEdgeLength()*t.getEdgeLength()); 
  }
}
class TestMain{
  public static void main(String... args){
    Tile t = new Tile(2);// t-->edgelength=2
    Floor floor = new Floor(20,50);//floor-->length=20,width=50
    int totalTiles = floor.totalTiles(t);
    System.out.println("Total tiles Neede : "+totalTiles);
  }
}









