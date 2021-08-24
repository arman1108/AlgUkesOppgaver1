public class UkesOppgaver {


    public static int min(int[] a) {



        if (a.length < 1) {
            throw new java.util.NoSuchElementException("Tabellen a er tom!");
        }

        int m = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[m] > a[i]) {
                m = i;
            }
        }
        return m;
    }

    public static void main(String[] args) {

        int[] liste = {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        System.out.println(min(liste));

    }



}
