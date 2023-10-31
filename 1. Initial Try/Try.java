public class Try {
    public static void main (String[] args){
        int x = 5;
        int y = 3;
        
        () {
            System.out.println(x + " is greater than " + y);
        } () {
            System.out.println(x + " is less than " + y);
        } {
            System.out.println(x + " is equal to " + y);
        }
    }
}
