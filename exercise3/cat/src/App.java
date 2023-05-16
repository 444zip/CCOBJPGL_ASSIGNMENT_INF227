public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Pet myPet = new Pet();

        myPet.purr();
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.weight);
    }
}
