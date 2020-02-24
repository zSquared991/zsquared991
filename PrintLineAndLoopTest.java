public class PrintLineAndLoopTest {

    public static void main(String[] args) {

        //this works as a test loop for your own code, and I use it just as a copy paste
        //whenever I know i will need them later. You can always comment them out with the
        // // method or /*  */ method

        for (int i = 0; i < 25; i++) {
            System.out.println(i);
        }

        //change the string, take input as the string, do whatever, this is just an example
        String str = "1 AM is not a time to be awake! Go to bed you fools. You absolute baboons.";

        /*
        Initializes an array as a separate strings basically.
        It makes it so that every part is its own String based on the regex.

        The regex is where it splits. I have it set to a space, so that everything has its own string assigned
        but you could do the ! or  any specific letters or numbers.
        */
        String[] strSplit = str.split(" ");

       /*
        The following for loop is just for testing and showing where things are located in the array. You should erase
        or comment it out before you submit anything.
         */

        for (int i = 0; i < strSplit.length; i++) {
            System.out.println(strSplit[i] + "       This is the index that goes into the [] ->" + i);
        }

        /*
         So for the example we all need, and what probably will help to understand the Midterm most ,look at the next
         part of this.
         */

        String userInput = "Wed 4:35 pm"; // This would be the input from a scanner.
        String[] strSpliced = userInput.split(" ");

        /*
        The following for loop is just for testing and showing where things are located in the array. You should erase
        or comment it out before you submit anything.
         */

        for (int i = 0; i < strSpliced.length; i++) {
            System.out.println(strSpliced[i] + "       STR SPLICED " + i);
        }

        String day = strSpliced[0];
        int dayNum;
        String time = strSpliced[1];
        String[] split2 = time.split(":");
        String hour = split2[0];
        String minute = split2[1];
        int hourReal;


        if(strSpliced[2].equals("pm")){
           hourReal = Integer.parseInt(hour) + 12;
        }else{
            hourReal = Integer.parseInt(hour);
        }
        /*
        The above statement makes it so that it is in military time, and follows the 24 hour timecode.
        The below makes it so that the time wouldn't read as 24:35 if it was 12:35 pm. This gave 10/50 points on the
        midterm
         */

        if(hourReal >= 24){
            hourReal = 0;
        }

        System.out.println(hourReal);
        /*
        The above is just a test statement. I use them as much as I can to check variable outputs. They help A LOT
        if you aren't sure what exactly is happening.
         */

        /*
        Now we can start with the case statements or the if statements. Whichever you prefer.
        I am going to use case statements because they are easier to manage and slightly more efficient.
         */

        switch(day) {
            case "Mon":
                dayNum = 1;
                break;
            case "Tue":
                dayNum = 2;
                break;
            case "Wed":
                dayNum = 3;
                break;
            case "Thu":
                dayNum = 4;
                break;
            case "Fri":
                dayNum = 5;
                break;
            case "Sat":
                dayNum = 6;
                break;
            case "Sun":
                dayNum = 7;
                break;
            default:
                dayNum = 1;
        }

        /*
        The SOutPLine below is just for spacing from the test code, and can be removed for a submission to ZyBooks or
        anything else.
         */
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Day: " + dayNum);
        System.out.println("Hour: " + hourReal);
        System.out.println("Minute: " + minute);

    }

}
