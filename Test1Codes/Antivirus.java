public class Antivirus {
    private String productkey;
    private boolean value;

    Antivirus(){
        this.productkey = "free version";
        this.value = false;

    }
    public Antivirus(String productkey){
        this.productkey = productkey;
        this.value = true;

    }
    public void scan(){
        if(value){
            Tranaction.done();
            System.out.println("Activated");

        }
        else {
            Tranaction.Failed();
            System.out.println("invalid");
        }
    }

}

class Tranaction{
    static void done(){
        System.out.println("productKey appproved");
    }
    static void Failed(){
        System.out.println("transaction not done -pleaase pay first");
    }
}