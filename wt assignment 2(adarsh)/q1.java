class Account {
     protected int acc_no;
     protected double balance;
    
     public Account(int acc_no, double balance) {
      this.acc_no = acc_no;
      this.balance = balance;
     }
     public void display() {
      System.out.println("Account Number: " + acc_no);
      System.out.println("Balance: " + balance);
     }
    }
    class Person extends Account {
     private String name;
     private String aadhar_no;
     public Person(int acc_no, double balance, String name, String aadhar_no) {
      super(acc_no, balance);
      this.name = name;
      this.aadhar_no = aadhar_no;
     }
     @Override
     public void display() {
     System.out.println("Name: " + name);
      System.out.println("Aadhar Number: " + aadhar_no);
      super.display();
     }
    }
    public class q1 {
     public static void main(String[] args) {
      Person person1 = new Person(1, 69, "Adarsh Mishra", "1234 5678 9012");
      Person person2 = new Person(2, 690, "Chetan Dev", "9876 5432 1098");
      Person person3 = new Person(3, 6969, "Pavan", "2468 1357 8024");
      Person person4 = new Person(4, 696969, "Abhijeet sir", "8642 9753 1032");
      Person person5 = new Person(5, 69.69, "Ankit Sir", "3141 5926 5358");
     
     person1.display();
     System.out.println();
      person2.display();
      System.out.println();
      person3.display();
      System.out.println();
      person4.display();
     person5.display();
    System.out.println();
     }
    }
    
    