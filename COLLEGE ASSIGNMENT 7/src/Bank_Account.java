public class Bank_Account {
    static long[] Account_Number_List=new long[1000];
    static int i=0;
    String Account_Holder_Name;
    long Account_Number;
    int S,C;
    double balance;

    public Bank_Account(String Account_Holder_Name,char type,double balance){
        if(type=='S' || type=='s' || type=='C' || type=='c');
        else{
            System.out.println("Account Type Miss-Matched.Try again with 'S' or 'C'...");
            return;
        }
        
    
        
        this.Account_Holder_Name=Account_Holder_Name;
        if(type=='S' || type=='s'){
            this.S=1;
            this.C=0;
        }
        else{
            this.S=0;
            this.C=1;
        }

        if(this.S==1 && balance>=500){
            this.balance=balance;
        }
        else if(this.C==1 && balance>=1000){
            this.balance=balance;
        }
        else{
            System.out.println("Balance is low according to your account type.Try again...");
            S=0;
            C=0;
            this.Account_Holder_Name="";
            return;
        }

        this.Account_Number=12200122070L+i;
        Account_Number_List[i++]=this.Account_Number;
    }

    public void displayDetails(){
        if(Account_Number==0){
            System.out.println("You donot have any account.");
            return;
        }
        System.out.println("Account Number="+Account_Number);
        System.out.println("Account holder name="+Account_Holder_Name);
        if(this.S==1)
        System.out.println("Account Type= Savings A/C" );
        if(this.C==1)
        System.out.println("Account Type= Current A/C" );

        System.out.println("Balance="+balance);
    }

    public void checkBalance(){
        System.out.println("Account Number="+Account_Number);
        System.out.println("Present Balance="+balance);
    }

    public void withdraw_money(double withdraw_money){
        if(balance>=withdraw_money){
            if(this.S==1 && (this.balance-withdraw_money)>=500){
                this.balance-=withdraw_money;
                System.out.println("Withdrawal is successful.");
                checkBalance();
            }
            else if(this.C==1 && (this.balance-withdraw_money)>=1000){
                this.balance-=withdraw_money;
                System.out.println("Withdrawal of "+withdraw_money+" is successful.");
                checkBalance();
            }
            else{
                if(this.S==1){
                    System.out.println("Withdrawal of "+withdraw_money+"isnot possible.You have to atleast Rs.500 in your Savings A/C.");
                }
                else{
                    System.out.println("Withdrawal of "+withdraw_money+" isnot possible.You have to atleast Rs.1000 in your Current A/C.");
                }
            }
        }
        else{
            System.out.println("Withdrawal of "+withdraw_money+" isnot possible due to unsufficient balance.");
        }
    }

    public void deposite_money(double deposite_money){
            this.balance+=deposite_money;
            System.out.println("Deposite is successful.");
            checkBalance();
    }


}
