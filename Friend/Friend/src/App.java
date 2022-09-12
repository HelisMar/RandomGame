import java.util.Random;

public class App {
    static int counter = 0;
    public static void main(String[] args) throws Exception {

        System.out.print("Tere tulemast äraarvamise mängu! Pead arvama ära numbri 1-10\n");
        
        int randomNumber = GetRandomNumber();
        boolean success = GuessTheNumber(randomNumber);
// Kui ei arvanud siis küsi uuesti  / success - False siis küsin uuesti
        if(!success) {
            success = GuessTheNumber(randomNumber);
        }
        if(!success) {
            success = GuessTheNumber(randomNumber);
        }
        if(success) {
            System.out.println("Arvasid ära " + counter + " käiguga.");
        }  
    }
    static boolean CheckIfCorrect() {
        return false;
    }
    static int GetUserNumber() {
        System.out.print("Sisesta täis arva, et ära arvata(" + counter++ + "/3): \n");
        return Integer.parseInt(System.console().readLine());
    }

    static int GetRandomNumber() {
        Random rand = new Random();
        int min = 0;
        int max = 11;
        return (rand.nextInt(max - min) + min);
    }

    static boolean GuessTheNumber(int randomNumber) {
        int userInput = GetUserNumber();
        if(randomNumber == userInput) {
            System.out.println("Kasutaja arvas ära.");
            return true;
        }
        System.out.println("Ei Arvanud ära");
        PrintTips(userInput, randomNumber);
        return false;
    }

    static void PrintTips(int userInput, int randomNumber) {

            if(userInput > randomNumber) {
                System.out.println("Sisestatud arv on suur.");
            }
            if(userInput < randomNumber) {
                System.out.println("Sisestatud arv on väike.");
            }
        }
    }

