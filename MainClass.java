package MM;

public class MainClass {

    public static void main(String[] args) {

        int N = 5;
        char symbol = ' ';
        char star = ' ';
        char line = ' ';
        for (int row = 1; row <= N + 1; row++) {
            for (int mirror = 1; mirror <= 1; mirror++) {
                for (int lastSymbol = 1; lastSymbol <= 2; lastSymbol++) {
                    for (int i = 1; i <= 2; i++) {
                        if (i == 1 || i == 3 || i == 5 || i == 7) {
                            line = '-';
                            symbol = line;
                        } else {
                            star = '*';
                            symbol = star;
                        }
                        if (row == 1) {
                            for (int j = 1; j <= N; j++) {
                                System.out.print(symbol);
                            }
                        } else if(row == 2){
                            for (int j = 1; j <= N-1; j++) {
                                System.out.print(line);
                            }
                            for (int j = 1; j <= N+2; j++) {
                                System.out.print(star);
                            }
                        }
                    }
                    if (lastSymbol == 2) {
                        symbol = '-';
                        for (int k = 1; k <= N; k++) {
                            System.out.print(symbol);
                        }
                    }
                }
            }
            System.out.println("\n");
        }
        Pattern pat = new Pattern();
        pat.createPattern();
    }
}
