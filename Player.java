import java.util.ArrayList;

public class Player {
	private String name; //���a�m�W
	private int chips; //���a�����w�X
	private int bet; //���a�����U�`���w�X
	private ArrayList<Card> oneRoundCard; //���P�����d
	
	public Player(String name, int chips) { //�s�WPlayer����ɡA�ݭn�m�W�B�֦����w�X����ӰѼ�
		oneRoundCard = new ArrayList<Card>();
		this.name = name;
		this.chips = chips;
	}
	public String getName() { //name��getter
		return name;	
	}
	public int makeBet() {
		if(chips != 0) { //�ˬd�O�_�٦����A�S���F�N����A�~��U�`
			bet=1; //�U�`�G�@��1��
		}
        return bet; //�^�ǹw�p�U�`���w�X�򥻤U�`
	}
	public void setOneRoundCard(ArrayList<Card> cards) {
		oneRoundCard=cards; //�]�w���P���ұo�쪺�d setter
	}
	public boolean hitMe() {
		int TotalValue = getTotalValue();
		if (TotalValue >= 17) { //16�I�H�U�n�P�A17�I�H�W���n�P => �O�_�n�P�A�O�^��true�A���A�n�P�h�^��false
			return false;
		} else {
			return true;
		}
	}
	public int getTotalValue() {
		 int TotalValue = 0;
		 for(int n=0; n<oneRoundCard.size(); n++) {
			 if(oneRoundCard.get(n).getRank() == 11 || oneRoundCard.get(n).getRank() == 12 || oneRoundCard.get(n).getRank() == 13)
		    {
				 TotalValue += 10;
		    }
			 TotalValue += oneRoundCard.get(n).getRank();
	     }
 		 return TotalValue;  //�^�Ǧ��P���ұo���d�I�ƥ[�`
	}
    public int getCurrentChips() { //�^�Ǫ��a�{���w�X
    	return chips;
    }
    public void increaseChips (int diff) { //���a�w�X�ܰʡAsetter
    	chips += diff;
    }

	public void sayHello() { //���aSay Hello
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
} 

