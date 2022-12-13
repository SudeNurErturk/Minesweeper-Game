import java.awt.Color;
import java.util.Random;

public class Shape {
	private int Width= 6,Weight=12;
	private int x,y;
	private Random rand;
	private int speedX,speedY;
	private Color col;
	public Shape(int x, int y,int speedX, int speedY) {
		rand = new Random();
		this.x = x;
		this.y = y;
		this.speedX= speedX;
		this.speedY= speedY;
		
		col = new Color(rand.nextInt(255),rand.nextInt(250),rand.nextInt(250));
	}
	public Color getCol() {
		return col;
	}
	public void setCol(Color col) {
		this.col = col;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSpeedX() {
		return speedX;
	}
	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}
	public int getSpeedY() {
		return speedY;
	}
	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}
	public void move() {
		x = x+ speedX;
		
	}
	
	
}
