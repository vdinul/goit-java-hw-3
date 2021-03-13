public class ATM {

    public int countBanknotes(int sum) {
        int anzahl = 0; // number of bank notes
        int summe = sum;
        int residuum = 0;

        if ( sum > 500) {
            anzahl = summe / 500;
            summe = summe - (anzahl * 500);
        }
        if ( summe > 200) {
            residuum = summe / 200;
            anzahl = anzahl + residuum;
            summe = summe - (residuum * 200);
        }
        if ( summe > 100) {
            residuum = summe / 100;
            anzahl = anzahl + residuum;
            summe = summe - (residuum * 100);
        }
        if ( summe > 50) {
            residuum = summe / 50;
            anzahl = anzahl + residuum;
            summe = summe - (residuum * 50);
        }
        if ( summe > 20) {
            residuum = summe / 20;
            anzahl = anzahl + residuum;
            summe = summe - (residuum * 20);
        }
        if ( summe > 10) {
            residuum = summe / 10;
            anzahl = anzahl + residuum;
            summe = summe - (residuum * 10);
        }
        if ( summe > 5) {
            residuum = summe / 5;
            anzahl = anzahl + residuum;
            summe = summe - (residuum * 5);
        }
        if ( summe > 2) {
            residuum = summe / 2;
            anzahl = anzahl + residuum;
            summe = summe - (residuum * 2 );
        }
        anzahl += summe;
        return anzahl;
    }
}