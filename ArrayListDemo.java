import java.util.ArrayList;
public class ArrayListDemo{

	public ArrayList<Integer> combine(ArrayList<Integer> list, ArrayList<Integer> list2){
		ArrayList<Integer> listFinal = new ArrayList<>();
		for(int i = 0; i < list.size(); i++)
			listFinal.add(list.get(i));
		for(int i = 0; i < list2.size(); i++)
			listFinal.add(list2.get(i));
		return listFinal;
	}
	public static void main(String[]args){

	}
}