public class App {

    static boolean iwillReview = true;
    static boolean IwillNotFail = true;
    public static void main(String[] args) throws Exception {
       
        App myApp = new App();

        // precondition
        assert iwillReview == true: "tinamad ako mag aral";

        myApp.exam();

        // postcondition
        assert IwillNotFail == true: "soOorry u failed";

    }

    void exam(){
        IwillNotFail = false;

    }
}
