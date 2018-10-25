package twModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] input = new String[100000];
        int counter = 0;
        User[] competitor = new User[2];
        competitor[0] = new User();
        competitor[1] = new User();
        input[0] = read.next();
        int change = 0;
        while (!input[counter].toLowerCase().equals("yield")) {
            int temp = counter;
            switch (input[temp].toLowerCase()) {
                case "add": {
                    temp++;
                    input[temp] = read.next();
                    switch (input[temp].toLowerCase()) {
                        case "block": {
                            competitor[change%2].userId();
                            break;
                        }
                        case "home": {
                            break;
                        }
                        case "army": {
                            break;
                        }
                        case "defense": {
                            break;
                        }
                        case "bazaar": {
                            temp++;
                            break;
                        }
                        default: {
                            System.out.println("not possible");
                            break;
                        }
                    }
                    break;
                }
                case "remove": {

                    break;
                }
                case "upgrade": {
                    break;
                }
                case "see": {
                    temp++;
                    input[temp] = read.next();
                    if (input[temp].toLowerCase() == "grills")
                        System.out.println(30000);
                    else if (input[temp].toLowerCase() == "score")
                        System.out.println(200);
                    else
                        System.out.println("not possible");
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
            temp++;
            counter = temp;
            input[counter]=read.next();
        }
    }

}