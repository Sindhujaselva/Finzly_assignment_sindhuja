public class Animal {
    private String name;
    private int age;

    Animal(){

    }
    Animal(String name,int age){
        this.name = name;
        this.age =age;
    }
    public void makesound(){
        System.out.println("Animal sound");
    }


}
class Lion extends Animal{
    public Lion(String name,int age) {
        super(name, age);
    }
    @Override
    public void makesound() {
        System.out.println("lion");
    }
}
class Girafee extends Animal{
    public Girafee(String name,int age){
        super(name,age);
    }


    @Override
    public void makesound() {
        System.out.println("girafee sound");
    }
}
class Elephant extends Animal{
    public Elephant(String name,int age){
        super(name, age);
    }


    @Override
    public void makesound(){
        System.out.println("elephant sound");
    }



}
class Zoo{

}
