import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();
        age.add(34);
        age.add(23);
        age.add(57);
        age.add(12);
        age.add(12);
        age.add(10);
        age.add(78);
        age.add(12);
        // System.out.println(age.get(1));
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < age.size(); i++)
            index.add(i);
        for (int i = 0; i < age.size(); i++)
            System.out.print(age.get(i) + " ");
        System.out.println();
        for (int i = 0; i < age.size(); i++)
            System.out.print(index.get(i) + " ");
        System.out.println();
        for (int i = 0; i < age.size(); i++) {
            // index.add(i);
            for (int j = 0; j < age.size() - 1; j++) {
                if (age.get(index.get(j)) > age.get(index.get(j + 1))) {
                    int temp = index.get(j);
                    index.set(j, index.get(j + 1));
                    index.set(j + 1, temp);

                }
            }
        }
        for (int i = 0; i < age.size(); i++)
            System.out.print(index.get(i) + " ");
        System.out.println();
        for (int i : index)
            System.out.print(age.get(i) + " ");

    }
}
