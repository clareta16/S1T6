package n1exercici1;

public class Main1 {
    public static void main(String[] args) {
        int dos = 2;
        int tres = 3;
        int quatre = 4;


        NoGenericMethods llista1 = new NoGenericMethods(dos, tres, quatre);
        NoGenericMethods llista2 = new NoGenericMethods(tres, quatre, dos);
        NoGenericMethods llista3 = new NoGenericMethods(quatre, dos, tres);


        System.out.println(llista1);
        System.out.println(llista2);
        System.out.println(llista3);

    }

}


