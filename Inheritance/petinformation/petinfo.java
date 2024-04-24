

import java.util.Scanner;

public class petinfo {
    Scanner input = new Scanner(System.in);

    String petName , catName , catBreed;
    int petAge , catAge;

    petName = input.nextLine();
    petAge = input.nextInt();
    input.nextLine();
    catName = input.nextLine();
    input.nextLine();
    catBreed = input.nextLine();

    //TO DO: Create generic pet ( using petName, petAge) and then call printInfo

    Pet pika = new Pet();
    pika.setName(petName);
    pika.setAge(petAge);

    
}
