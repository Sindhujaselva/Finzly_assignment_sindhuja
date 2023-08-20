

public abstract class LibrayItem  {
    private String title;
    private int itemID;
    public LibrayItem(String title,int itemID){
        this.title = title;
        this.itemID = itemID;
    }
    public void setTitle(String title){
        this.title = title;

    }
    public void setItemID(int  itemID){
        this.itemID = itemID;

    }
    public String getTitle(){
        return title;
    }
    public  int getItemID(){
        return itemID;
    }

    public void displayinfo(String title,int itemID){
        System.out.println(itemID);

    }

    public abstract void borroeitem(LibrayItem item);


    class Book extends  LibrayItem{
    String author;
    public Book(String author,String title,int itemID){
        super(title,itemID);
        this.author =author;
//        super(title,itemID);
    }
    public void setAuthor(String author){
        this.author =author;

    }
    public String getAuthor(){
        return  author;
    }

    @Override
    public void displayinfo(String title,int itemID) {
        super.displayinfo(title,itemID);
    }

        @Override
        public void borroeitem(LibrayItem item) {

        }
    }
class DVD extends LibrayItem{
    double duration ;

    public DVD(double duration,String title,int itemID){
        super(title,itemID);
        this.duration =duration;

    }
    public void setDuration(double duration){
        this.duration=duration;

    }
    public double getDuration(){
        return  duration;
    }
    @Override
    public void displayinfo(String title,int itemID){
        super.displayinfo(title,itemID);

    }

    @Override
    public void borroeitem(LibrayItem item) {

    }


}
abstract class LibraryMember{
    int memberId;
    String name;

    public LibraryMember(int memberId,String name){
        this.name= name;
        this.memberId = memberId;


    }


    public abstract  void borroeitem(LibrayItem item);

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}


class StudentMember extends LibraryMember{
    StudentMember(String name,int memberID){
        super(memberID, name);
    }

    @Override
    public void borroeitem(LibrayItem item){

    }

}

class FacultyMember extends LibrayItem {
    FacultyMember(String name, int memberID) {
        super(name, memberID);
    }

    @Override
    public void borroeitem(LibrayItem item) {
        System.out.println("Faculty " +   " is borrowing " + item.getTitle());

    }
}
}
//class Main1{
//    public static void main(String[] args) {
//        LibrayItem li = new LibrayItem("computer",52315);
//        Book bk = new Book("sindhuja","fighting ",5025);
//        DVD vb = new DVD(5.0,"hellobook",523);
//
//        Book.displayInfo();
//        System.out.println();
//        dvd.displayInfo();
//        System.out.println();
//
//
//
//        LibraryMember student = new StudentMember(1001, "Alice");
//        LibraryMember faculty = new FacultyMember(2001, "Professor Smith");
//
//
//    }
//
