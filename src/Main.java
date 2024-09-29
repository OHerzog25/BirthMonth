//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int birthMonth = 11;

        if (birthMonth > 0 && birthMonth < 13)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println(birthMonth + " is invalid. Input a number between 1-12");
        }
    }
}