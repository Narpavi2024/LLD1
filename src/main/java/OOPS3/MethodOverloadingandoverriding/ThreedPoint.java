package OOPS3.MethodOverloadingandoverriding;

public class ThreedPoint extends Point{
    private int z;
   public  ThreedPoint(int x,int y,int z){
        super(x,y);
        this.z = z;
    }
    public void display() {
        System.out.println("["+super.x+", "+super.y+", "+this.z+"]");
    }


}
