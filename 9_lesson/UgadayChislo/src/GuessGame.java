;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void printWin(String user,int num) {
        System.out.println("У нас есть победитель");
        System.out.printf("Игрок %s угадал число %s",user,num);
    }

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 1 до 9 ....");

        while (true) {
            p1.rundGuess();
            p2.rundGuess();
            p3.rundGuess();

            System.out.printf("Первый игрок думает, что это %s\n", p1.guessp);
            System.out.printf("Второй игрок думает, что это %s\n", p2.guessp);
            System.out.printf("Третий игрок думает, что это %s\n", p3.guessp);

            if(p1.guessp==targetNumber) {
                p1.pisRight = true;
                printWin("p1", p1.guessp);
                break;

            }
            if(p2.guessp==targetNumber) {
                p2.pisRight = true;
                printWin("p2", p2.guessp);
                break;
            }
            if(p3.guessp==targetNumber) {
                p3.pisRight = true;
                printWin("p3", p3.guessp);
                break;
            }

            System.out.printf("Игроки должны попробовать еше раз");


        }

    }
}
