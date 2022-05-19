public class UC5_WinningPosition {
    static final int Noplay = 0;
    static final int Ladder = 1;
    public static void main(String[] args){
        System.out.println("Welcome to snack and ladder program ");
            int playerStartPosition = 0;
            int winningPosition = 100;
            while ((playerStartPosition <= winningPosition)){
                int numAfterrolling = (int) Math.floor(Math.random() * 10) % 6 + 1;
                System.out.println("After rolling die by the player " +numAfterrolling);
                int checkOption = (int) Math.floor(Math.random() * 10) % 3 + 1;
                switch (checkOption){
                    case Noplay:
                        System.out.println("Player is not playing there stay the same position ");
                        break;
                    case Ladder:
                        playerStartPosition += numAfterrolling;
                        if (playerStartPosition > winningPosition)
                            playerStartPosition = winningPosition - numAfterrolling;
                        System.out.println("Player go to ladder and move position " +playerStartPosition);
                        break;
                    default:
                        playerStartPosition -= numAfterrolling;
                        if (playerStartPosition < 0)
                            playerStartPosition = 0;
                        System.out.println("Player snack bite bhiend the position " +playerStartPosition);
                }
            }
    }
}
