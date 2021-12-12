public class AddAmount {
    private int amount=50;
    AddAmount(){}

    public AddAmount(int a) {
        this.amount = a+amount;
    }
    public void display(){
        System.out.println(amount);
    }

}
class main {
    public static void main(String[] args) {


        AddAmount a = new AddAmount(40);
        AddAmount b = new AddAmount();
        a.display();
        b.display();
    }


}