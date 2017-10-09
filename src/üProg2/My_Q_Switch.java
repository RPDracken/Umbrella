package üProg2;

public class My_Q_Switch {
	
	private boolean m_Switch_State = false;
	// Ich weiß nicht genau wie es im Konstruktor funktioniert. 
	// Meine My_Q_Switch CLass muss mTail und mHead von der zu wechselnden Q übergeben kriegen.
	
	void switch_HEAD_to_TAIL_Q(My_Element h){
		if (!m_Switch_State){
			System.out.println("Bitte erst die activate_Switch_State() Methode aufrufen");
			System.out.println("Switch_State wird nach jedem Methodenaufruf wieder FALSE!");
		}else{
			My_Element m_Temp = h;
			My_Element m_Temp_Head = h;
	//Anfang bei m_Head. Die Beziehung von m_next und m_prev wird getauscht, so das aus m_Head m_Tail wird.
	//In My_List wird nun beim add befehl festgestellt, das Der Head der Tail geworden ist und so wird der Tail zum neuen Head.
			while(m_Switch_State){
				if(m_Temp != null){
					m_Temp = m_Temp_Head.m_prev;
					m_Temp_Head.m_prev = m_Temp_Head.m_next;
					m_Temp_Head.m_next = m_Temp;
					m_Temp_Head = m_Temp;
				}else{
					System.out.println("Ich bin fertig, Die Liste wurde getauscht");
					change_Switch_State();
				}
			}
		}
	}
	//verändert Switch_State um die While_Schleife zu beenden.
	private void change_Switch_State(){
		m_Switch_State = false;
	}
	//verändert Switch_State so, das es true ist und die anderen Funktionen funktionieren.
	void activate_Switch_State(){
		m_Switch_State = true;
	}
}