public class StringHandlingMethods
{
    public static void main(String args[])
    {
        String str1 = "Madanapalle Institute of Technology and Science ";
        String str2 = "Aditya College of Engineering";
        System.out.println("Concatenation of str1 and str2 : " + str1.concat(str2));
        System.out.println("Index of 'C' in str1: " + str1.indexOf('C'));
        System.out.println("Index of 'of' in str2: " + str2.indexOf("of"));
        System.out.println("Replacing 'o' with 'x' in str1: " + str1.replace('o', 'x'));
        System.out.println("Replacing 'Awesome' with 'Great' in str2: " + str2.replace("College", "Great"));
        System.out.println("Uppercase version of str1: " + str1.toUpperCase());
        System.out.println("Lowercase version of str2: " + str2.toLowerCase());
    }
}
