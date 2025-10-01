public class BankAccountMain {
    public static void main(String[] args){
        BankAccountClass Abank = new BankAccountClass(12122018);

        System.out.printf(Abank.deposit(100));
        System.out.printf(Abank.withdraw(20));
    }
}
