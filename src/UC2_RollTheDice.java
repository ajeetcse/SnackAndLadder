//package snackladderproblem;
public class UC2_RollTheDice {
    public static void main(String[] args){
        int die1;
        int die2;
        int roll;

        die1 = (int) Math.floor(Math.random() * 6) + 1;
        die2 = (int) Math.floor(Math.random() * 6) + 1;
        roll = die1 + die2;
        System.out.println("First Die " +die1);
        System.out.println("Second Die " +die2);
        System.out.println("Roll of Die " +roll);
    }
}
