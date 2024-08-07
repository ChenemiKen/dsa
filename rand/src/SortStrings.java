import java.util.ArrayList;
import java.util.List;

public class SortStrings {
  void sort(){
    List<String> subStrings = new ArrayList<>();

    for(int i=0; i<subStrings.size(); i++){
      for(int j=i; j<subStrings.size(); j++){
        String s1 = subStrings.get(i);
        if(s1.compareTo(subStrings.get(j)) > 0){
          subStrings.set(i, subStrings.get(j));
          subStrings.set(j, s1);
        }
      }
    }
  }
}
