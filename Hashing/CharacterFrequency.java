public class main {
    public static void main(String args[]) {
        String input = "abcdderrtf";
        int arr[] = new int[26];
        for(int i=0;i<input.length();i++){
            arr[input.charAt(i)-'a'] += 1;
        }
        for(int i=0;i<input.length();i++){
            System.out.println("Character "+ input.charAt(i) + arr[input.charAt(i)-'a']);
        }
    }
}
