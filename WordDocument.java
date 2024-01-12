import java.util.*;
class WordDocument{
    DocumentParts[] documentParts;
    
    WordDocument(DocumentParts[] documentPartList) {
        documentParts = documentPartList;
    }
    public void open(){
        
    }
    public void save(){
        
    }
    public void convert(Iconvertor iConverter) {
        for (DocumentParts parts : documentParts) {
            parts.convert(iConverter);
        }
    }
}
interface Iconvertor{
    void convert(Paragraph p);
    void convert(Header h);
    void convert(HyperLink hl);
    void convert(Footer f);
}
class HTMLConvertor implements Iconvertor{
    public void convert(Paragraph p){
        
    }
    public void convert(Header h){
        
    }
    public void convert(HyperLink hl){
        
    }
    public void convert(Footer f){
        
    }
}
abstract class DocumentParts{
    public String DocumentPartName;
    public abstract void save();
    public abstract void paint();
    public abstract void convert(Iconvertor ic);
}
class Header extends DocumentParts{
    String title;
    public void save(){
        System.out.println("Save Header");
    }
    public void paint(){
        System.out.println("Paint Header");
    }
    public void convert(Iconvertor ic){
        ic.convert(this);
    }
}
class Paragraph extends DocumentParts{
    String content;
    public void save(){
        System.out.println("Save Paragraph");
    }
    public void paint(){
        System.out.println("Paint Header");
    }
    public void convert(Iconvertor ic){
        ic.convert(this);
    }
}
class HyperLink extends DocumentParts{
    String text;
    public void save(){
        System.out.println("Save HyperLink");
    }
    public void paint(){
        System.out.println("Paint HyperLink");
    }
    public void convert(Iconvertor ic){
        ic.convert(this);
    }
    
}
class Footer extends DocumentParts{
    String text;
    public void save(){
        System.out.println("Save Footer");
    }
    public void paint(){
        System.out.println("Paint Footer");
    }
    public void convert(Iconvertor ic){
        ic.convert(this);
    }
}
class Main{
    public static void main(String[] args){
        Header headerObj = new Header();
        Paragraph paragraphObj = new Paragraph();
        HyperLink hyperLinkObj = new HyperLink();
        Footer footerObj = new Footer();
        DocumentParts[] documentPartList = new DocumentParts[]{headerObj, paragraphObj, hyperLinkObj, footerObj};
        WordDocument wordDocumentObj = new WordDocument(documentPartList);
        Iconvertor htmlConvertor = new HTMLConvertor();
        
        wordDocumentObj.convert(htmlConvertor);
        
        headerObj.save();
        headerObj.paint();
    }
}
