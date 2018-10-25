package twModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] input = new String[100000];
        int counter = 0;
        User[] competitor=new User[2];
        int change =0;
        while (input[counter].toLowerCase() != "yield") {
            int temp = counter;
            switch (input[counter].toLowerCase()) {
                case "add": {
                    temp++;
                    input[temp] = read.next();
                    switch (input[counter].toLowerCase()) {
                        case "block": {
                            competitor[change%2].block.add();

                        }
                        case "home": {

                        }
                        case "army": {
                            System.out.println("jhhhhhh");
                        }
                        case "defense": {

                        }
                        case "bazaar": {

                        }
                        default:
                            System.out.println("not possible");
                    }
                }
                case "remove": {
                    break;
                }
                case "upgrade": {
                    break;
                }
                case "see": {
                    break;
                }
                case "done": {
                    change++;
                    break;
                }
                case "attack": {
                    break;
                }
                case "loot": {
                    break;
                }

            }
        }
    }
}