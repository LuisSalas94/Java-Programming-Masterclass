public class WallArea {
    private double height;
    private double width;

    public WallArea(double width, double height ) {
        if(width < 0){
          this.width = 0;
        }
        if(height < 0){
          this.height = 0;
        }
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        if(width < 0){
          this.width = 0;
        }else{
          this.width = width;
        }
    }

    public void setHeight(double height){
        if(height < 0){
           this.height = 0;
        }else{
           this.height = height;
        }
    }

    public double getArea(){
        return  height * width;
    }

}
