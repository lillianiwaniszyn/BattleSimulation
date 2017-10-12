package a1;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;



public class testBattle {
	private Battle bat;
	private Hero hero;
	private Hero hero1;
	private Villain vil;
	private Villain vil1;
	private Scanner input;
	@Before 
	public void setUp() {
		bat = new Battle();
		hero = new Hero (6,0,19);
		vil = new Villain (8,1,16);
		hero1 = new Hero (5,2,18);
		vil1 = new Villain (10,0,15);

	}

	@Test
	public void testCalculateWinner() {
		assertTrue(bat.calculateWinner(hero, vil).equals("draw") ||
				bat.calculateWinner(hero, vil).equals("win") || bat.calculateWinner(hero, vil).equals("lose"));
		assertTrue(bat.calculateWinner(hero1, vil1).equals("draw") );
	}


	

}
