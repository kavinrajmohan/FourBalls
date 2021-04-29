import processing.core.PApplet;

public class FourBalls extends PApplet{

    public static final int HEIGHT = 500;
    public static final int WIDTH = 600;
    public static final int DIAMETER = 10;

    public static final int ballOneHeight = HEIGHT * 1 / 5;
    public static final int ballTwoHeight = HEIGHT * 2 / 5;
    public static final int ballThreeHeight = HEIGHT * 3 / 5;
    public static final int ballFourHeight = HEIGHT * 4 / 5;

    public static int ballOneSpeed = 1;
    public static int ballTwoSpeed = 2;
    public static int ballThreeSpeed = 3;
    public static int ballFourSpeed = 4;

    public static int ballOnePosition = 1;
    public static int ballTwoPosition = 1;
    public static int ballThreePosition = 1;
    public static int ballFourPosition = 1;


    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(ballOnePosition, ballOneHeight, DIAMETER, DIAMETER);
        ballOnePosition += ballOneSpeed;
    }

    private void drawCircle2() {
        ellipse(ballTwoPosition, ballTwoHeight, DIAMETER, DIAMETER);
        ballTwoPosition += ballTwoSpeed;
    }

    private void drawCircle3() {
        ellipse(ballThreePosition, ballThreeHeight, DIAMETER, DIAMETER);
        ballThreePosition += ballThreeSpeed;
    }

    private void drawCircle4() {
        ellipse(ballFourPosition, ballFourHeight, DIAMETER, DIAMETER);
        ballFourPosition += ballFourSpeed;
    }

}
