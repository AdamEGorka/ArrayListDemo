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
	public static void print(ArrayList<Integer> list){
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i)+", ");
	}
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
		int hold = 0;
		while(hold < list.size()){
			for(int j = 0; j <= hold; j++)
				if(list.get(hold) == list.get(j)){
					list.remove(hold);


				}

			hold++;
		}
		return list;
	}
	public static void main(String[]args){
		ArrayList<Integer> list = new ArrayList<>();
			list.add(2);
			list.add(2);
			list.add(5);
			list.add(2);
			list.add(2);
		System.out.println(removeDuplicates(list));
	}
}