public class Ship {
//attributes
    private double x;
    private double y;
    private String type;
    private int status;
    private double aim_X;
    private double aim_Y;
    private double gun_x;
    private double gun_y;

//constructor
    public Ship (double x, double y, String type, int status, double aim_X, double aim_Y, double gun_x, double gun_y) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.status = status;
        this.aim_X = aim_X;
        this.aim_Y = aim_Y;
        this.gun_x = gun_x;
        this.gun_y = gun_y;
    }

    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }

    public String getType () {
        return type;
    }

    public double getStatus () {
        return status;
    }

    public double getY_Aim () {
        return aim_X;
    }

}
