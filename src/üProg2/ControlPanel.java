package üProg2;

public class ControlPanel {
	
	public static void main (String[]args){
		My_List Liste1 = new My_List();
		My_Q_Switch Switch1 = new My_Q_Switch();
		
		Liste1.add_Elem_List(5);
		Liste1.add_Elem_List(6);
		Liste1.add_Elem_List(9);
		Liste1.show_List();
		//Switch1.activate_Switch_State();
		//Switch1.switch_HEAD_to_TAIL_Q(Liste1.m_Head);
		//Liste1.show_List();
		Liste1.add_Elem_List(10);
		Liste1.add_Elem_List(3);
		Liste1.show_List();
		//Switch1.activate_Switch_State();
		//Switch1.switch_HEAD_to_TAIL_Q(Liste1.m_Head);
		//Liste1.show_List();
		Liste1.add_Elem_List(20);
		Liste1.show_List();
		//Liste1.delete_Elem_List(5);
		//Liste1.show_List();
		Liste1.delete_Elem_List(120);
		Liste1.add_Elem_List(7);
		Liste1.show_List();
		Liste1.pair_Switch();
		Liste1.show_List();
		
	}
}
