class FilterArray{
    public ArrayList StringStartsWith(String[] inputString,Character searchChar){
        ArrayList<String> FilteredArray = new ArrayList<String>();
        for(int i=0;i<inputString.length;i++){
            if(inputString[i].charAt(0)==searchChar){
                FilteredArray.add(inputString[i]);
            }
        }
        return FilteredArray;
    } 
}
class Display{
    public void displayInTerminal(ArrayList<String> FilteredList){
        if(FilteredList.size()==0){
            System.out.println("No such Entry");
            return;
        }
        for(int i=0;i<FilteredList.size();i++){
            System.out.println(FilteredList.get(i));
        }
    }
}
class FilterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilterArray fltr = new FilterArray();
        Display display = new Display();
        
        String inputString = sc.nextLine();
        String[] inputStringArray = inputString.split(" ");
        Character searchChar = sc.next().charAt(0);
        ArrayList<String> FilteredList = new ArrayList<String>();
        FilteredList = fltr.StringStartsWith(inputStringArray,searchChar);
        display.displayInTerminal(FilteredList);
    }
}
