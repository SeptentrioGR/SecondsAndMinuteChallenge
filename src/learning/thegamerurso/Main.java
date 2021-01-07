package learning.thegamerurso;

//Create a method called get DurectionString with two parameters , first parameter minutes and 2nd parameter seconds.
//you should validate that the first parameter minutes is >= 0;
//you should validate taht the 2nd parameter seconds is >= 0 and <= 59
//the method should return "invaliud value" in teh method if either of the above are not true
//if  the parameter are valid then calculate how many hours minutes  and seconds passed to this metho and rteturn that  value as string in format "XXh YYm ZZs"
//where XX represents a number of hours, YY the minutes and ZZ the seconds
//
//Create a 2nd method of thes ame name but with only oine parameter seconds
//validate it is >= 0, and return "invalid value" if it is not true
//if it is valid then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly
//call  both methods to prin value to the console

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(long minute,long seconds){
        if(minute < 0 || seconds <0 || seconds>59){
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minute /60;
        long remainingMinutes = minute % 60;

        String hourString = hours + "h ";
        if(hours < 10){
            hourString= "0" + hours;
        }

        String remainingMinutesString = remainingMinutes + "m ";
        if(remainingMinutes < 10){
            remainingMinutesString= "0" + remainingMinutes;
        }

        String secondsString = seconds + "s ";
        if(seconds < 10){
            secondsString= "0" + seconds;
        }
        return hourString + remainingMinutesString + secondsString;
    }

    public static String getDurationString(long seconds) {
        if(seconds<=0){
            return INVALID_VALUE_MESSAGE;
        }
        long minute = seconds * 60;
        long remianingSeconds = seconds % 60;
        return getDurationString(minute,remianingSeconds);
    }
}
