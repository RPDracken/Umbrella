package üProg2;

public class My_Element {
	My_Element m_next = null;
	My_Element m_prev = null;
	private int m_Imput = 0;
	
	My_Element(int c){
		m_Imput = c;
	}
	int myImput(){
		return m_Imput;
	}
}