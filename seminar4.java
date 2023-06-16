import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class seminar4 {
    public static void main(String[] args) {
        ArrayList<String[]> humans = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("ФИО, возраст, пол: ");
        while (true) {
            String a = iScanner.nextLine();
            if (a.equals("q"))
                break;
            humans.add(a.split(" "));
        }
        for (String[] i : humans) {
            System.out.printf("%s %s. %s. %s %s \n", i[0], i[1].toUpperCase().charAt(0),
                    i[2].toUpperCase().charAt(0), i[3], i[4]);
        }
        // ArrayList<String>surname = new ArrayList<>(null);
        // ArrayList<String>name = new ArrayList<>(null);
        // ArrayList<String>lastname = new ArrayList<>(null);
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();

        for (String[] i : humans) {
            // surname.add(i[0]);
            // name.add(i[1]);
            // lastname.add(i[2]);
            age.add(Integer.parseInt(i[3]));
            gender.add(i[4].toLowerCase().contains("m"));
        }
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < age.size(); i++)
            index.add(i);
        for (int i = 0; i < age.size(); i++) {
            for (int j = 0; j < age.size() - 1; j++) {
                if (age.get(index.get(j)) > age.get(index.get(j + 1))) {
                    int temp = index.get(j);
                    index.set(j, index.get(j + 1));
                    index.set(j + 1, temp);

                }
            }
        }
        System.out.println("");
        for (int i : index) System.out.printf("%s %s. %s. %s %s \n", humans.get(i)[0],
                                            humans.get(i)[1].toUpperCase().charAt(0),
                                            humans.get(i)[2].toUpperCase().charAt(0),
                                            humans.get(i)[3], humans.get(i)[4]);

        ArrayList<Integer> males = new ArrayList<>();
        ArrayList<Integer> females = new ArrayList<>();
        for(int i: index){
            if (gender.get(i)) 
            males.add(i);
            else females.add(i);
        }
        System.out.println("Males are:");
        for (int i : males) System.out.printf("%s %s. %s. %s %s \n", humans.get(i)[0],
                                            humans.get(i)[1].toUpperCase().charAt(0),
                                            humans.get(i)[2].toUpperCase().charAt(0),
                                            humans.get(i)[3], humans.get(i)[4]);
        System.out.println("Females are:");
        for (int i : females) System.out.printf("%s %s. %s. %s %s \n", humans.get(i)[0],
                                            humans.get(i)[1].toUpperCase().charAt(0),
                                            humans.get(i)[2].toUpperCase().charAt(0),
                                            humans.get(i)[3], humans.get(i)[4]);


        // String a = iScanner.nextLine();
        // if (a.equals("q"))System.exit(0);
        // else {
        // humans.sort(new Comparator<String[]>(){

        // public int compare(String[] o1, String[] o2){
        // return Integer.parseInt(o1[3])-Integer.parseInt(o2[3]);

        // }}
        // );
        // for (String[] i : humans){

        // System.out.printf("%s %s. %s. %s %s \n",i[0],i[1].toUpperCase().charAt(0),
        // i[2].toUpperCase().charAt(0),i[3],i[4]);
        // }

        // }
        iScanner.close();
    }
}


//John Ver Bill 34 m
//Vera nir Card 23 f
//Sara Red Green 67 f
//Genry Dad Met 56 m
//Larry Gas Berry 12 m
//Perry Duck Nose 25 m
//Eve Vector Mode 27 f
//Clara Sara Bum 47 f
//Fred Patrick Gun 87 m
//Sam Donut Baker 18 m