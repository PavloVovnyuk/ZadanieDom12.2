public class Tablicy {
    public void createTablicy() {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;

        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int N = 3;
        try {
            if (tablica == null) {
                throw new NullPointerException ();
            }
            if (tablica.length < N) {
                throw new ArrayIndexOutOfBoundsException ();
            }
            for (int i = 0; i < tablica.length / N; i++) {
                sum = sum + tablica[i];
                System.out.println (tablica[i]);
            }
            System.out.println (" suma 1 tabklicy " + sum);
            for (int j = tablica.length / N; j < tablica.length - tablica.length / N; j++) {
                sum1 = sum1 + tablica[j];
                System.out.println (tablica[j]);
            }
            System.out.println (" suma 2 tabklicy " + sum1);

            for (int i = tablica.length - tablica.length / N; i < tablica.length; i++) {
                sum2 = sum2 + tablica[i];
                System.out.println (tablica[i]);
            }
            System.out.println (" suma 3 tabklicy " + sum2);


        } catch (NullPointerException e) {
            System.out.println ("Tablica ma znaczenie null");


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("Tablica jest mniejsza od N");
        }
    }
}
