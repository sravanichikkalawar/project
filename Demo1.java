import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> lst=Arrays.asList("apple","banana","date","apple");
List<String>lst2=lst.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
lst2.forEach(n->System.out.println(n));
List<String> lst3=lst.stream().filter(s->s.startsWith("a"))
.map(s->s.toUpperCase())
.collect(Collectors.toList());



Set<String> lst1=Arrays.stream("sathwik","swetha","vani","ankitha","ram");
Set<String> lst4=lst1.stream()
             .sorted().collect(Collectors.toSet());
           
             //.collect(Collectors.toSet());
           
           lst4.forEach(n->System.out.println(n));
	}

}
