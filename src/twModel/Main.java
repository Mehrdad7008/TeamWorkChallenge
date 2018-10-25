package twModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] input = new String[100000];
        int counter = 0;
        User[] competitor = new User[2];
        int change = 0;
        while (input[counter].toLowerCase() != "yield") {
            int temp = counter;
            switch (input[counter].toLowerCase()) {
                case "add": {
                    temp++;
                    input[temp] = read.next();
                    switch (input[counter].toLowerCase()) {
                        case "block": {
                            competitor[change % 2].block.add();
                            System.out.println(competitor[change % 2].block.getBlockId());
                            break;
                        }
                        case "home": {
                            throw new IllegalArgumentException();
                        }
                        case "army": {
                            throw new IllegalArgumentException();
                        }
                        case "defense": {
                            throw new IllegalArgumentException();
                        }
                        case "bazaar": {
                            temp++;
                            competitor[change%2].block.blockId = read.nextInt();
                            System.out.println(competitor[change % 2].block.getBlockId());
                            break;
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
                    temp++;
                    input[temp]=read.next();
                    if(input[temp].toLowerCase()=="grills")
                        System.out.println(30000);
                    else if(input[temp].toLowerCase()=="score")
                        System.out.println(200);
                    else
                        System.out.println("not possible");
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
        }
    }
}