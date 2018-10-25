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
        int userBuiltBlocks = 0;
        while (!input[counter].toLowerCase().equals("yield")) {
            int temp = counter;
            switch (input[temp].toLowerCase()) {
                case "add": {
                    temp++;
                    input[temp] = read.next();
                    switch (input[temp].toLowerCase()) {
                        case "block": {
                            userBuiltBlocks = competitor[change % 2].userBlockId();
                            competitor[change % 2].i = 0;
                            System.out.println(userBuiltBlocks);
                            break;
                        }
                        case "home": {
                            temp++;
                            input[temp] = read.next();
                            if (competitor[change % 2].getMyHomeId() <= userBuiltBlocks)
                                System.out.println(competitor[change % 2].getMyHomeId());
                            else
                                System.out.println("not possible");
                            temp++;
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
                            input[temp] = read.next();
                            competitor[change % 2].setMyBazaar(Integer.parseInt(input[temp]));
                            if (competitor[change % 2].getMyBazaarId() <= userBuiltBlocks)
                                System.out.println(competitor[change % 2].getMyBazaarId());
                            else
                                System.out.println("not possible");
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
                    temp++;
                    input[temp] = read.next();
                    switch (input[temp].toLowerCase()) {
                        case "block": {
                            temp++;
                            input[temp] = read.next();
                            if (Integer.parseInt(input[temp]) == userBuiltBlocks) {
                                competitor[change % 2].i = 1;
                            }
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
            input[counter] = read.next();
        }
    }

}