package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int isLeapYear;
        if( ((year% 4 == 0) && (year% 100 != 0)) || (year% 400 == 0) ){
            isLeapYear = 1;
        }else{
            isLeapYear = 0;
        }

        switch (isLeapYear){
            case 1:
                System.out.println("leap");
                break;
            case 0:
                System.out.println("not leap");


        }
    }
}
