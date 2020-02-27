package object_classes;

public class Client {
    private String firstName;
    private String lastName;
    private String pinCode;
    private double balance;


    public Client (String firstName, String lastName, double balance) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBalance(balance);
    }

    private void setFirstName(String firstName) {
        if(!firstName.matches("[a-zA-z]+") || firstName.isEmpty()) {
            throw new IllegalArgumentException("Invalid first name.");
        }
        this.firstName = firstName;
    }
    private void setLastName(String lastName){
        if(!lastName.matches("[a-zA-z]+") || lastName.isEmpty()){
            throw new IllegalArgumentException("Invalid last name.");
        }
        this.lastName = lastName;
    }

    private void setBalance(double balance) {
        if(balance < 0){
            throw new IllegalArgumentException("Моля, въведете валидни стойности.");
        }
        this.balance = balance;
    }
    public void setPinCode(String pinCode){
        this.pinCode = pinCode;
    }

    public void withdraw(double amount){
        if (this.balance < amount) {
            throw new IllegalArgumentException("Недостатъчна наличност по сметка.");
        }
        if (amount == 10 || amount == 20 || amount == 50 || amount == 100 || amount == 200 || amount == 300 || amount == 400) {
           this.balance -= amount;
            System.out.println(String.format("Изтеглихте %.2f BGN.", amount));
        } else {
            System.out.println("Невалидна сума, опитайте отново.");
        }

    }
    public double showBalance(){
        return this.balance;
    }


}
