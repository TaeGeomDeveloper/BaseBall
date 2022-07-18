public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // get, set
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int Y){
        this.y = y;
    }

    @Override
    public String toString(){
        return  "X값 : "+this.x+"  Y값 : "+this.y;
    }

    @Override
    public boolean equals(Object obj){
        boolean flag = false;
        Point point = (Point) obj;
        if(point.getX() == x && point.getY() == y){
            flag = true;
        }
        return flag;
    }
}
