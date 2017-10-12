package a1;

import java.security.InvalidParameterException;
import java.util.Random;
import java.util.Scanner;

public class Battle {

Random battle = new Random();
Scanner input = new Scanner(System.in);
int restart;

int heroHealth, villainHealth;
int outcome, outcome1, outcome2, outcome3;

public String calculateWinner(Hero hero, Villain vil){
    do{ outcome = hero.attack - vil.defense;
        villainHealth = vil.health - outcome;
        System.out.println("Your attack does " + outcome + " damage!");
        System.out.println("");
        System.out.println("Enemy Health");
        System.out.println(villainHealth);
        System.out.println("");
        outcome2 = vil.attack - hero.defense;
        heroHealth = hero.health - outcome2;
        System.out.println("Enemies attack does " + outcome2 + " damage!");
        System.out.println("");
        System.out.println("Your Health");
        System.out.println(heroHealth);
        if(villainHealth > 0 && heroHealth > 0){
            outcome = hero.attack - vil.defense;
            outcome1 = 2 * outcome;
            villainHealth = vil.health - outcome1;
            System.out.println("Your attack does " + outcome + " damage!");
            System.out.println("");
            System.out.println("Enemy Health");
            System.out.println(villainHealth);
            outcome = vil.attack - hero.defense;
            outcome1 = 2 * outcome;
            heroHealth = hero.health - outcome1;
            System.out.println("");
            System.out.println("Enemies attack does " + outcome2 + " damage!");
            System.out.println("");
            System.out.println("Your Health");
            System.out.println(heroHealth);
            if(villainHealth > 0 && heroHealth > 0){
                outcome = hero.attack - vil.defense;
                outcome1 = 3 * outcome;
                villainHealth = vil.health - outcome1;
                System.out.println("Your attack does " + outcome + " damage!");
                System.out.println("");
                System.out.println("Enemy Health");
                System.out.println(villainHealth);
                outcome = vil.attack - hero.defense;
                outcome1 = 3 * outcome;
                heroHealth = hero.health - outcome1;
                System.out.println("");
                System.out.println("Enemies attack does " + outcome2 + " damage!");
                System.out.println("");
                System.out.println("Your Health");
                System.out.println(heroHealth);
                if(villainHealth > 0 && heroHealth > 0){
                    outcome = hero.attack - vil.defense;
                    outcome1 = 4 * outcome;
                    villainHealth = vil.health - outcome1;
                    System.out.println("Your attack does " + outcome + " damage!");
                    System.out.println("");
                    System.out.println("Enemy Health");
                    System.out.println(villainHealth);
                    outcome = vil.attack - hero.defense;
                    outcome1 = 4 * outcome;
                    heroHealth = hero.health - outcome1;
                    System.out.println("");
                    System.out.println("Enemies attack does " + outcome2 + " damage!");
                    System.out.println("");
                    System.out.println("Your Health");
                    System.out.println(heroHealth);
                        if(villainHealth > 0 && heroHealth > 0){
                        outcome = hero.attack - vil.defense;
                        outcome1 = 5 * outcome;
                        villainHealth = vil.health - outcome1;
                        System.out.println("Your attack does " + outcome + " damage!");
                        System.out.println("");
                        System.out.println("Enemy Health");
                        System.out.println(villainHealth);
                        outcome = vil.attack - hero.defense;
                        outcome1 = 5 * outcome;
                        heroHealth = hero.health - outcome1;
                        System.out.println("");
                        System.out.println("Enemies attack does " + outcome2 + " damage!");
                        System.out.println("");
                        System.out.println("Your Health");
                        System.out.println(heroHealth);}
                        }
                        }
                        }
            }while(villainHealth > 0 && heroHealth > 0);
            if(villainHealth <= 0 && heroHealth > 0){
                System.out.println("You win!");
                return "win";}
            if(heroHealth <= 0 && villainHealth > 0){
                System.out.println("You lose!");
                return "lose";}
            if(heroHealth <=0 && villainHealth <= 0){
                System.out.println("Draw!");
                return "draw";}
			return null;
                }
public boolean battleAgain() throws InvalidParameterException{
    System.out.println("");
    System.out.println("Fight again?");
    System.out.println("1 for Yes");
    System.out.println("2 for No");
    restart = input.nextInt();
    if(restart == 1){
        System.out.println("");
        return true;
    }else if(restart == 2){
        System.out.println("Thank you for playing!");
        return false;
       }
    else throw new InvalidParameterException("invalid choice") ;
        
        
        
}

                }