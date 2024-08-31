public class App {
    public static void main(String[] args) throws Exception {
        Bank_Account ob1=new Bank_Account("Rupayan Ghosh", 's', 500);
        ob1.displayDetails();
        System.out.println();
        Bank_Account ob2=new Bank_Account("Bahni Ghosh", 'c', 1300);
        ob2.displayDetails();
        System.out.println();
        ob1.deposite_money(1000);
        System.out.println();
        ob1.withdraw_money(1300);
        System.out.println();
        ob1.withdraw_money(900);
        System.out.println();
        ob2.deposite_money(1000);
        System.out.println();
        ob2.withdraw_money(1200);
        System.out.println();
        ob2.withdraw_money(900);
        System.out.println();
        ob2.withdraw_money(75);
        
        
    }   
}
