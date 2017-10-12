package a1;

import java.util.Random;
import java.util.Scanner;

public class DuelMain {

public static void main(String[] args) {
    Random battle = new Random();
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);

    int hero, match, restart;
    Battle bat = new Battle();
    Hero valon = new Hero(6,0,19);
    Hero rintar = new Hero(8,1,16);
    Hero zersious = new Hero(5,2,18);
    Hero balrock = new Hero(10,0,15);
    Hero hawkeye = new Hero(7,1,17);
    Hero yusef = new Hero(13,2,10);
    Villain valonVillain;
    Villain rintarVillain;
    Villain zersiousVillain;
    Villain balrockVillain;
    Villain hawkeyeVillain;
    Villain yusefVillain;
    



        System.out.println("Choose your HERO");
        System.out.println("Press 1 for the Mage Lord Valon             Press 2 for the Warrior Rintar");
        System.out.println("Attack      6               Attack      8");
        System.out.println("Defense     0               Defense     1");
        System.out.println("Health      19              Health      16");
        System.out.println("");
        System.out.println("");
        System.out.println("Press 3 for the Paladin Prince Zersious     Press 4 for the Orc Balrock");
        System.out.println("Attack      5               Attack      10");
        System.out.println("Defense     2               Defense     0");
        System.out.println("Health      18              Health      15");       
        System.out.println("");
        System.out.println("");
        System.out.println("Press 5 for the Elf Hawkeye         Press 6 for the Dragon Summoner Yusef");
        System.out.println("Attack      7               Attack      13");
        System.out.println("Defense     1               Defense     2");
        System.out.println("Health      17              Health      10");
        hero = input.nextInt();
        if(hero == 1){System.out.println("You have chosen Lord Valon!");
        for(hero = 1;;){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = 1+battle.nextInt(5);
            if(match == 1){
                System.out.println("Rintar!");
                System.out.println("");
                rintarVillain = new Villain(8,1,16);
                bat.calculateWinner(valon, rintarVillain);
            }else if(match == 2){
                System.out.println("Prince Zersious!");
                System.out.println("");
                zersiousVillain = new Villain(5,2,18);
                bat.calculateWinner(valon, zersiousVillain);
            }else if(match == 3){
                System.out.println("Balrock!");
                System.out.println("");
                balrockVillain = new Villain(10,0,15);
                bat.calculateWinner(valon, balrockVillain);
            }else if(match == 4){
                System.out.println("Hawkeye!");
                System.out.println("");
                hawkeyeVillain = new Villain(7,1,17);
                bat.calculateWinner(valon, hawkeyeVillain);
            }else if(match == 5){
                System.out.println("Yusef!");
                System.out.println("");
                yusefVillain =  new Villain(13,2,10);
                bat.calculateWinner(valon, yusefVillain);}
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(restart == 1){
                System.out.println("");
            }else if(restart == 2){
                System.out.println("Thank you for playing!");
                break;}
                }
                }
        if(hero == 2){System.out.println("You have chosen Rintar!");
        for(hero = 2;;){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = 1+battle.nextInt(5);
            if(match == 1){
                System.out.println("Lord Valon!");
                System.out.println("");
                valonVillain =  new Villain(6,0,19);
                bat.calculateWinner(rintar, valonVillain);
            }else if(match == 2){
                System.out.println("Prince Zersious!");
                System.out.println("");
                zersiousVillain = new Villain(5,2,18);
                bat.calculateWinner(rintar, zersiousVillain);
            }else if(match == 3){
                System.out.println("Balrock!");
                System.out.println("");
                balrockVillain = new Villain(10,0,15);
                bat.calculateWinner(rintar, balrockVillain);
            }else if(match == 4){
                System.out.println("Hawkeye!");
                System.out.println("");
                hawkeyeVillain = new Villain(7,1,17);
                bat.calculateWinner(rintar, hawkeyeVillain);
            }else if(match == 5){
                System.out.println("Yusef!");
                System.out.println("");
                yusefVillain =  new Villain(13,2,10);
                bat.calculateWinner(rintar, yusefVillain);}
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(restart == 1){
                System.out.println("");
            }else if(restart == 2){
                System.out.println("Thank you for playing!");
                break;}
                }
                }
        if(hero == 3){System.out.println("You have chosen Prince Zersious!");
        for(hero = 3;;){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = 1+battle.nextInt(5);
            if(match == 1){
                System.out.println("Lord Valon!");
                System.out.println("");
                valonVillain =  new Villain(6,0,19);
                bat.calculateWinner(zersious, valonVillain);
            }else if(match == 2){
                System.out.println("Rintar!");
                System.out.println("");
                rintarVillain = new Villain(8,1,16);
                bat.calculateWinner(zersious, rintarVillain);
            }else if(match == 3){
                System.out.println("Balrock!");
                System.out.println("");
                balrockVillain = new Villain(10,0,15);
                bat.calculateWinner(zersious, balrockVillain);
            }else if(match == 4){
                System.out.println("Hawkeye!");
                System.out.println("");
                hawkeyeVillain = new Villain(7,1,17);
                bat.calculateWinner(zersious, hawkeyeVillain);
            }else if(match == 5){
                System.out.println("Yusef!");
                System.out.println("");
                yusefVillain =  new Villain(13,2,10);
                bat.calculateWinner(zersious, yusefVillain);}
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(restart == 1){
                System.out.println("");
            }else if(restart == 2){
                System.out.println("Thank you for playing!");
                break;}
                }
                }
        if(hero == 4){System.out.println("You have chosen Balrock!");
        for(hero = 4;;){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = 1+battle.nextInt(5);
            if(match == 1){
                System.out.println("Lord Valon!");
                System.out.println("");
                valonVillain =  new Villain(6,0,19);
                bat.calculateWinner(balrock, valonVillain);
            }else if(match == 2){
                System.out.println("Prince Zersious!");
                System.out.println("");
                zersiousVillain = new Villain(5,2,18);
                bat.calculateWinner(balrock, zersiousVillain);
            }else if(match == 3){
                System.out.println("Rintar!");
                System.out.println("");
                rintarVillain = new Villain(8,1,16);
                bat.calculateWinner(balrock, rintarVillain);
            }else if(match == 4){
                System.out.println("Hawkeye!");
                System.out.println("");
                hawkeyeVillain = new Villain(7,1,17);
                bat.calculateWinner(balrock, hawkeyeVillain);
            }else if(match == 5){
                System.out.println("Yusef!");
                System.out.println("");
                yusefVillain =  new Villain(13,2,10);
                bat.calculateWinner(balrock, yusefVillain);}
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(restart == 1){
                System.out.println("");
            }else if(restart == 2){
                System.out.println("Thank you for playing!");
                break;}
                }
                }
        if(hero == 5){System.out.println("You have chosen Hawkeye!");
        for(hero = 5;;){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = 1+battle.nextInt(5);
            if(match == 1){
                System.out.println("Lord Valon!");
                System.out.println("");
                valonVillain =  new Villain(6,0,19);
                bat.calculateWinner(hawkeye, valonVillain);
            }else if(match == 2){
                System.out.println("Prince Zersious!");
                System.out.println("");
                zersiousVillain = new Villain(5,2,18);
                bat.calculateWinner(hawkeye, zersiousVillain);
            }else if(match == 3){
                System.out.println("Balrock!");
                System.out.println("");
                balrockVillain = new Villain(10,0,15);
                bat.calculateWinner(hawkeye, balrockVillain);
            }else if(match == 4){
                System.out.println("Rintar!");
                System.out.println("");
                rintarVillain = new Villain(8,1,16);
                bat.calculateWinner(hawkeye, rintarVillain);
            }else if(match == 5){
                System.out.println("Yusef!");
                System.out.println("");
                yusefVillain =  new Villain(13,2,10);
                bat.calculateWinner(hawkeye, yusefVillain);}
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(restart == 1){
                System.out.println("");
            }else if(restart == 2){
                System.out.println("Thank you for playing!");
                break;}
                }
                }
        if(hero == 6){System.out.println("You have chosen Yusef!");
        for(hero = 6;;){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = 1+battle.nextInt(5);
            if(match == 1){
                System.out.println("Lord Valon!");
                System.out.println("");
                valonVillain =  new Villain(6,0,19);
                bat.calculateWinner(yusef, valonVillain);
            }else if(match == 2){
                System.out.println("Prince Zersious!");
                System.out.println("");
                zersiousVillain = new Villain(5,2,18);
                bat.calculateWinner(yusef, zersiousVillain);
            }else if(match == 3){
                System.out.println("Balrock!");
                System.out.println("");
                balrockVillain = new Villain(10,0,15);
                bat.calculateWinner(yusef, balrockVillain);
            }else if(match == 4){
                System.out.println("Rintar!");
                System.out.println("");
                rintarVillain = new Villain(8,1,16);
                bat.calculateWinner(yusef, rintarVillain);
            }else if(match == 5){
                System.out.println("Hawkeye!");
                System.out.println("");
                hawkeyeVillain = new Villain(7,1,17);
                bat.calculateWinner(yusef, hawkeyeVillain);}
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(restart == 1){
                System.out.println("");
            }else if(restart == 2){
                System.out.println("Thank you for playing!");
                break;}
                }
                }
                }
                }