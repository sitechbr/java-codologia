public class SheepPosition {
    private int x;
    private int y;

    SheepPosition(int x, int y) throws Exception{
        if (((x <= 0) || (x > 9)) || ((y <= 0) || (y > 9))) {
            this.x =0;
            this.y= 0;
            throw new Exception();
        } else {
            this.x = x;
            this.y = y;
        }

    }

    public  void getPos() {
        System.out.printf("Position x=%s, y=%s\n",this.x,this.y);
    }
}
