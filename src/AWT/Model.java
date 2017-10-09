package AWT;

public class Model {
	int m_W1_maxX;
	int m_W1_maxY;
	int m_W1_X1,m_W1_X2,m_W1_Y1,m_W1_Y2;
	int m_W2_X1,m_W2_X2,m_W2_Y1,m_W2_Y2;
	Model(int maxX,int maxY) {
		m_W1_maxX = maxX;
		m_W1_maxY = maxY;
		genNewKoor();
	}
	void genNewKoor() {
		m_W1_X1 = (int)(Math.random() * m_W1_maxX);
		m_W1_X2 = (int)(Math.random() * m_W1_maxX);
		m_W1_Y1 = (int)(Math.random() * m_W1_maxY);
		m_W1_Y2 = (int)(Math.random() * m_W1_maxY);
		m_W2_X1 = (int)(Math.random() * m_W1_maxX);
		m_W2_X2 = (int)(Math.random() * m_W1_maxX);
		m_W2_Y1 = (int)((Math.random() * m_W1_maxY) + m_W1_maxY);
		m_W2_Y2 = (int)((Math.random() * m_W1_maxY) + m_W1_maxY);
	}
}
