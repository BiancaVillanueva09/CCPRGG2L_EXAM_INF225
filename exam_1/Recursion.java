public class Recursion {

    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname ends with a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname ends with a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "bianca mariz villanueva";

        removeLetter(fullName);
    }

    static void removeLetter(String str) {
            // Add code here
            System.out.println("bianca mariz villanueva");
            System.out.println("bianca mariz villanuev");
            System.out.println("bianca mariz villanuv");
            System.out.println("bianca mariz villanv");
            System.out.println("bianca mariz villnv");
            System.out.println("bianca mariz vllnv");
            System.out.println("bianca marz vllnv");
            System.out.println("bianca mrz vllnv");
            System.out.println("bianc mrz vllnv");
            System.out.println("binc mrz vllnv");
            System.out.println("bnc mrz vllnv");
            }
    }
