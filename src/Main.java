public class Main {
    public static void main(String[] args) {
        Abonent abonent = new Abonent("a", "b", "c", "d", "e", 1, 2, 3);
        Abonent abonent1 = new Abonent("a", "b", "c", "d");
        Abonent abonent2 = new Abonent("a", "b", "c", "d", "e", 1, 2, 0);
        Abonent abonent3 = new Abonent("a", "b", "c", "d", "e", 1, 2, 12);
        Abonent abonent4 = new Abonent("a", "b", "c", "d", "e", 1, 2, 14);
        Abonent[] array = new Abonent[5];
        array[0] = abonent;
        array[1] = abonent1;
        array[2] = abonent2;
        array[3] = abonent3;
        array[4] = abonent4;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDolg() > 0) {
                System.out.println(array[i]);
            }
        }
    }
}