import java.util.HashMap;
import java.util.Scanner;

 class CharacterHashing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        // HashMap for frequency
        HashMap<Character, Integer> map = new HashMap<>();

        // Pre-computation
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("\nHashMap:");
        System.out.println(map);

        System.out.print("\nEnter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {

            System.out.print("Enter character: ");
            char c = sc.next().charAt(0);

            System.out.println(
                "Frequency of " + c + " is " +
                map.getOrDefault(c, 0)
            );
        }

        sc.close();
    }
}