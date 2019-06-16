public class BankManager {

    public static void main(String [] args){

        class BankAccount {
            public double account;
            public double balance;


            public BankAccount(double account, double balance) {
                this.account = account;
                this.balance = balance;
            }
        }


        class CheckingAccount extends BankAccount{
            double limit;

            public CheckingAccount(double account, double balance, double limit) {
                super(account, balance);
                this.limit = limit;
            }
        }

        class SavingsAccount extends BankAccount{
            double costam1;

            public SavingsAccount(double account, double balance, double costam1) {
                super(account, balance);
                this.costam1 = costam1;
            }
        }

        class COD extends BankAccount {
            double costam2;

            public COD(double account, double balance, double costam2) {
                super(account, balance);
                this.costam2 = costam2;
            }
        }

        SavingsAccount ob1 = new SavingsAccount(1.2,1.5, 1.1);
        COD ob2 = new COD(2.2,2.4, 2.5);
        CheckingAccount ob3 = new CheckingAccount(3.3, 3.5, 3.6);


        System.out.println(ob1.account);
        System.out.println(ob1.balance);
        System.out.println(ob1.costam1);

        System.out.println(ob2.account);
        System.out.println(ob2.balance);
        System.out.println(ob2.costam2);

        System.out.println(ob3.account);
        System.out.println(ob3.balance);
        System.out.println(ob3.limit);
    }
}
