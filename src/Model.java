
public class Model {
	 private int x, y, mMaxX, mMaxY;
	 private int h�he = 20;
	 private int breite = 20;
	 Model(int maxX, int maxY){
		 mMaxX = maxX;
		 mMaxY = maxY;
	 }
	 void reLocate(){
		x = (int)Math.random() * mMaxX;
		y = (int)Math.random() * mMaxY;
	 }
	 int reH�he(){
		 return h�he;
	 }
	 int reBreite(){
		 return breite;
	 }
	 int get_x(){
		 return x;
	 }
	 int get_y(){
		 return y;
	 }
}
