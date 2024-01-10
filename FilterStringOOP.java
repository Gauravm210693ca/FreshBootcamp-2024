
import java.util.*;

class StartsWithStrategy {
    private String startString;
    public void setStartsWith(String key){
        startString = key;
    }
    public boolean invoke(String item){
        return item.startsWith(startString);
    }
}

class ConsoleDisplayController {
    private ArrayList<String> content;
    public void setContent(ArrayList<String> msg){
        content = msg;
    }
    public void display(){
        System.out.print(content.toString());
    }
}



class StringListFilterController {
    StartsWithStrategy predicate = new StartsWithStrategy();
    public ArrayList<String> filter(ArrayList<String> stringList){
        ArrayList<String> filteredArray = new ArrayList<>();
        predicate.setStartsWith("b");
        for(int i=0;i<stringList.size();i++){
            if(predicate.invoke(stringList.get(i))){
                filteredArray.add(stringList.get(i));
            }
        }
        return filteredArray;
    }
}

class ArrayFilter {
    public static void main(String args[]) {
      ArrayList<String> inputString = new ArrayList<>();
      inputString.add("war");
      inputString.add("boy");
      inputString.add("toy");
      inputString.add("car");
      inputString.add("far");
      
      StringListFilterController stringListFilterControllerObj = new StringListFilterController();
      
      ConsoleDisplayController consoleDisplayControllerObj = new ConsoleDisplayController();
      
      ArrayList<String> filteredArray = stringListFilterControllerObj.filter(inputString);
      
      
      consoleDisplayControllerObj.setContent(filteredArray);
      consoleDisplayControllerObj.display();
    }
}
