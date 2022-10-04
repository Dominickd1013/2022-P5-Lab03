public class Lab03st80Point
{

    public static void main(String[] args)

    {
        int sms = 10000123;
        int hours = sms / 3600000;
        sms %= 3600000;

        int minutes = sms / 60000;
        sms %= 60000;

        int seconds = sms / 1000;
        sms %= 1000;

        int milliseconds = sms;

        System.out.println("Lab03, 100 Point Version\n");
        System.out.print("Starting milli-seconds:");
        System.out.print(" ");
        System.out.print(sms);
        System.out.println();
        System.out.print("Hours:");
        System.out.print("                  ");
        System.out.print(hours);
        System.out.println();
        System.out.print("Minutes:");
        System.out.print("                ");
        System.out.print(minutes);
        System.out.println();
        System.out.print("Seconds:");
        System.out.print("                ");
        System.out.print(seconds);
        System.out.println();
        System.out.print("Milliseconds:");
        System.out.print("           ");
        System.out.print(milliseconds);
        System.out.println();




    }

}
