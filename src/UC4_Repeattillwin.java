public class UC4_Repeattillwin {
    static final int Noplay = 0;
    static final int Ladder = 1;
        public static void main(String[] args){
            System.out.println("Snack and ladder program");
            int PlayerStartPosition = 0;
                    while(PlayerStartPosition <= 100){
                         int NumberAfterRolling = (int) Math.floor(Math.random() * 10) % 6 + 1;
                         System.out.println("Number of after rolling die by the player " + NumberAfterRolling);
                         int checkOption = (int) Math.floor(Math.random() * 10) % 6 + 1;
                         switch (checkOption){
                             case Noplay:
                                 System.out.println("Player is not playing there stay the same position");
                                 break;
                             case Ladder:
                                 PlayerStartPosition += NumberAfterRolling;
                                 System.out.println("Player go to ladder and move position " +PlayerStartPosition);
                                 break;
                             default:
                                 PlayerStartPosition -= NumberAfterRolling;
                                 if (PlayerStartPosition < 0)
                                     PlayerStartPosition =0;
                                 System.out.println("Player snack bite bhiend the position " + PlayerStartPosition);
                         }
                    }
        }
}
