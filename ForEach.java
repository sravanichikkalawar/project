import java.util.ArrayList;
import java.util.List;
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =new ArrayList<String>();
		list.add("ankitha");
		list.add("srija");
		list.add("mayank");
		list.forEach((n)->System.out.println(n));
		System.out.println("printed all");

	}

}
