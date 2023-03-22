class Box{
  double width;
  double height;
  double depth;
}
class DemoBox{
  public static void main(String[] args){
    Box mybox=new Box();
    double vol;
    
    mybox.width=12;
    mybox.height=11;
    mybox.depth=11.5;
    
    vol=mybox.width*mybox.height*mybox.depth;
    System.out.println(vol);
  }
}
