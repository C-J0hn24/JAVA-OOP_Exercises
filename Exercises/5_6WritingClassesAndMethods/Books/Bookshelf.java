class Book{
    private String Title,Author,Publisher,Copr_Date;
    //Setter Getter parameters for 'Title' Variable
    Book(String Title,String Author,String Publisher,String Copr_Date){
        // assigning data from parameters to variables using 'this.' keyword
        this.Title= Title;
        this.Author=Author;
        this.Copr_Date=Copr_Date;
        this.Publisher = Publisher;
    }
        
    String getTitle(){
        return Title;
    }
    void setTitle(String Title){
        this.Title =Title;
    }
    //Setter Getter parameters for 'Author' Variable
    String getAuthor() {
        return Author;
    }
    void setAuthor(String Author){
        this.Author =Author;
    }
    //Setter Getter parameters for 'Publisher' Variable
    String getPublisher(){
        return Publisher;
    }
    void setPublisher(String Publisher){
        this.Publisher = Publisher;
    }
    //Setter Getter parameters for 'Copr_Date' Variable
    String getCopr_Date(){
        return Copr_Date;
    }
    void setCopr_Date(String Copr_Date){
        this.Copr_Date=Copr_Date;
    }
    // toString to format the output
    public String toString(){
        String str= "Book Title : "+getTitle()+ "\n"+"Author : "+getAuthor()+ "\n"+"Published By : "+getPublisher()+ "\n"+"Copyright Date : "+getCopr_Date()+ "\n";
        return str;
    }
}

public class Bookshelf {
    public static void main(String[] args) {
        Book book = new Book("A Book", "A Person", "A Publishing Company","2069/69/69");
        System.out.println(book.toString());
    }
}
