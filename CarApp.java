package cars;

public class CarApp {
    public static void main(String[] args) {



        try {
            Tesla tesla = new Tesla("Tesla-kun", 1568);
            tesla.listenToRadio("1l5");
           // int i = 5 / 0;
            tesla.driveAtSpeed(90);

        } catch (Exception ne) {
           System.err.println(ne.getMessage());
//            System.out.println(ne.getMessage());
            ne.printStackTrace();
        }


        System.out.println("turn off the car");
















//        double p = 1.0;
//        String str = "bla";
//
//        try {
//            p = Double.valueOf(str);
//        } catch (Exception ex) {
//            System.out.println("Exception Happened");
//
//            return; //return statement here!!!
//        } finally {
//            System.out.println("Finally");
//            System.out.println("send log to system administrator");
//        }
//        System.out.println("After finally");



    }
}
