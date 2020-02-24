package MM;

public class Pattern {
    public void createPattern() {
        int n = 3;
        int symCount = n * 10;
        char star = '*';
        char line = '-';

        for (int i = 1; i <= n+1; i++) {
            for (int j = 1; j <= symCount; j++){
                if (j <= 3){
                    System.out.print(line);
                }else if (j > 3 && j < 7){
                    System.out.print(star);
                }
            }
            System.out.println("");
        }
    }
}
