public class Homework6_Rojan {
    public static void main(String[] args) {
        MoneyCalculation moneyCalculation = new MoneyCalculation();
        moneyCalculation.depositMoney(500);
        moneyCalculation.depositMoney(150);
        moneyCalculation.withdrawMoney(50);

    if(moneyCalculation.fetchBalance()==600){
        System.out.println(moneyCalculation.fetchBalance());
        System.out.println("Yes the balance is as expected that is 600");
    }
    else{
        System.out.println(moneyCalculation.fetchBalance());
        System.out.println("No balance didnot that as of your expectation");
    }
    }
}

class MoneyCalculation{
    public int balance;
    public void depositMoney(int deposit){
        balance = balance + deposit;
    }
    public void withdrawMoney(int withdraw){
        balance = balance - withdraw;
    }
    public int fetchBalance(){
        return balance;
    }
}