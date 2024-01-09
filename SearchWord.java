import java.util.*;
class SearchWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String searchWord = sc.next();
        ArrayList<String> FilteredStringList = new ArrayList<String>();
        String[] inputArray = inputString.split(" ");
        FilteredStringList = searchString(inputArray,searchWord);
        displayInTerminal(FilteredStringList);
    }
    public static ArrayList searchString(String[] inputArray,String searchWord){
        ArrayList<String> filtered = new ArrayList<String>();
        for(int index = 0;index<inputArray.length;index++){
            if(inputArray[index].equals(searchWord)){
                filtered.add(inputArray[index]);
                return filtered;
            }
        }
        return filtered;
    }
    public static void displayInTerminal(ArrayList<String> FilteredStringList){
        if(FilteredStringList.size() == 0){
            System.out.println("NotFound");
        }
        else{
            System.out.println("Found");
        }
    }
    
}
