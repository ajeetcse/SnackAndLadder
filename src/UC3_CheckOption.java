public class UC3_CheckOption {
    static final int No_play = 0;
    static final int Ladder = 1;
        public static void main(String[] args){
            System.out.println("Snack and Ladder Program");
            int Player_start_Position = 0;
            int number_After_Rolling = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Number of Rolling After Dice by the Player " + number_After_Rolling);
            int checkOption = (int) Math.floor(Math.random() * 10) % 3 + 1;
            switch (checkOption) {
                case No_play:
                    System.out.println("Player is not playing at the same position ");
                    break;
                case Ladder:
                    Player_start_Position += number_After_Rolling;
                    System.out.println("Player move the Position " + Player_start_Position);
                    break;
                default:
                    Player_start_Position -= number_After_Rolling;
                    System.out.println("Snack the player bhiend the position" + Player_start_Position);
            }
        }
}
