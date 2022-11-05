abstract class Bank {

   abstract int getRateofInterest();       //abstract method
}

class BOC extends Bank{
    int getRateofInterest(){
        return 8;                         //integer ekak nisa return demme
    }
}
class Peoples extends Bank{
    @Override
    int getRateofInterest() {
        return 1;
    }
}

class TestBank{
    public static void main(String[] args) {
        Bank b;
        b= new BOC();
        System.out.println("Rate of interest :-  " +b.getRateofInterest() + "%");
        b= new Peoples();

        System.out.println("Rate of interest :-  " +b.getRateofInterest() + "%");
    }
}