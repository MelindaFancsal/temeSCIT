package mapExample;

import java.util.HashMap;
import java.util.Map;

public class TestMain {
    /*
    Pentru un sir de numere dat, afisati numarul de aparitii al fiecarui cuvant/ caracter. Delimitarea cuvintelor din string se face dupa spatiu
     */
    public static void main(String[] args) {
        String sir = "a b c a";

        Map<String, Integer> resultat = retriveNrAparitii(sir);
        System.out.println(resultat);

        /*
        int a =1;
        int z = 1;
        int c = a++;  // c = c + a;  a = a+1
        int d = ++z;  //z = z+ 1; d = z;
        System.out.println(c + "  " + d);*/
    }

    public static Map<String, Integer> retriveNrAparitii(String sir) {
       //v1
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] sirNumere = sir.split(" ");

        for (String item : sirNumere) {
            if (map.containsKey(item)) {
                int value = map.get(item);
                map.put(item, value+1);
            } else {
                map.put(item, 1);
            }
        }

        return map;
    }

}
