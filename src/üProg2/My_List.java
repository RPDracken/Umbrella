package üProg2;

public class My_List {

	My_Element m_Tail = null;
	My_Element m_Head = null;
		
	
	void add_Elem_List(int Imput){
		My_Element Temp_Node = new My_Element(Imput);
		if (m_Head == null && m_Tail == null){
			m_Head = Temp_Node;
			m_Tail = Temp_Node;
		}else if (m_Head.m_next == null){
			m_Head.m_next = Temp_Node;
			Temp_Node.m_prev = m_Head;
			m_Head = Temp_Node;
		// wenn m_Tail.m_next == null ist bedeutet das die Beziehungen von m_next und m_prev getauscht worden.
		// m_Tail ist jetzt der neue Head.
		}else if (m_Tail.m_next == null){
			My_Element Temp_Head = m_Head;
			m_Head = m_Tail;
			m_Tail = Temp_Head;
			m_Head.m_next = Temp_Node;
			Temp_Node.m_prev = m_Head;
			m_Head = Temp_Node;
		}
	}
	void delete_Elem_List(int Imput){
		My_Element Temp_Node = m_Head;
		while (Temp_Node != null && Temp_Node.myImput() != Imput){
			Temp_Node = Temp_Node.m_prev;
		}
		if (Temp_Node != null && Temp_Node.myImput() == Imput){
			Temp_Node.m_prev.m_next = Temp_Node.m_next;
			Temp_Node.m_next.m_prev = Temp_Node.m_prev;
		}else{
			System.out.println("Das zu löschende Element existiert nicht!");
		}
	}
	void show_List(){
		My_Element Temp_Node = m_Tail;
		if (Temp_Node.m_prev != null){
			Temp_Node = m_Head;
		}
		while (Temp_Node != null){
			System.out.print(Temp_Node.myImput() + " ");
			Temp_Node = Temp_Node.m_next;
		}
		System.out.println();
	}
	void sort_List(){
		int list_Length = 0;
		My_Element Temp_Node = m_Tail;
		if (Temp_Node.m_prev != null){
			Temp_Node = m_Head;
		}
		for (int count = 0; Temp_Node.m_next != null; ++count){
			list_Length = count;
		}
		My_Element Temp_Temp = Temp_Node.m_next;
		for (int count = 0; count<=list_Length; ++count){
			if (Temp_Node.myImput() > Temp_Temp.myImput()){
				My_Element Temporary = Temp_Node;
			}
		}
	}
	void pair_Switch(){
		My_Element Temp_Node = m_Tail;
		if (m_Tail.m_prev != null){
			Temp_Node = m_Head;
		}
		while(Temp_Node.m_next != null && Temp_Node.m_next.m_next != null){
			Temp_Node.m_next.m_prev = Temp_Node.m_prev;
			Temp_Node.m_prev = Temp_Node.m_next;
			Temp_Node.m_next = Temp_Node.m_next.m_next;
			Temp_Node.m_next.m_prev = Temp_Node;
			Temp_Node.m_prev.m_next = Temp_Node;
			Temp_Node = Temp_Node.m_next;
		}
		if(m_Tail.m_prev != null){
			m_Tail = m_Tail.m_prev;
		}
		if(m_Head.m_next != null){
			m_Head = m_Head.m_next;
		}
	}
}
