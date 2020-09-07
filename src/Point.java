
public class Point {

    private double x, y;

    Point() {
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    public double Distance(double x, double y) {
        return Math.sqrt((x * x) + (y * y));
    }

    public double Distance(Point p) {
        return Math.sqrt((p.x * p.x) + (p.y * p.y));
    }

  public   double Distance(double x1,double y1,double x2,double y2){
    if(Distance(x1, y1)- Distance(x2, y2)>0){
    return Distance(x1, y1)- Distance(x2, y2);
    }else{
        return -(Distance(x1, y1)- Distance(x2, y2));  
    }
}

    public void Deplacer(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String Tostring() {
        return "Position: (" + x + " + " + y + " )";
    }

}
