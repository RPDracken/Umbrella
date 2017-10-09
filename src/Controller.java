
public class Controller {
	My_Vector vec = new My_Vector();
	public static void main(String[]args){
		new Controller();
	}
	Controller(){
		fillVector();
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
		vec.pop_back();
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
		vec.pop_back();
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
		vec.pop_back();
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
		vec.pop_back();
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
		vec.pop_back();
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
		vec.pop_back();
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
		vec.push_back(10);
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
		vec.push_back(1);
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
		vec.push_back(15);
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
		vec.push_back(120);
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
		vec.push_back(1);
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
		vec.push_back(10);
		System.out.println("Die Länge des Vectors beträgt: " + vec.vector_length());
		printVector();
	}
	public void fillVector(){
		for (int i=0; i<10;++i){
			vec.push_back(i);
		}
	}
	private void printVector(){
		for (int i = 0; i<vec.vector_length(); ++i){
			System.out.print(vec.vector_int(i) + " ");
		}
		System.out.println();
	}

}
