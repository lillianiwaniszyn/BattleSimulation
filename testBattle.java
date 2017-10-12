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
	@Test
	public void testBattleAgain() {
		assertTrue(bat.battleAgain(1));
		assertFalse(bat.battleAgain(2));
		
	}
	@Test (expected = IllegalArgumentException.class)
	public void testWrongArgumentsBA() {
		bat.battleAgain(4);
		bat.battleAgain(0);
		bat.battleAgain(-20);
	}
	@Test
	public void testcontinueFight() {
		assertTrue(bat.continueFight(5, hero, vil) <20 ); 
		assertTrue(bat.continueFight(5, hero, vil) >-25 ); 
		assertTrue(bat.continueFight(2, hero1, vil1) <20 ); 
		assertTrue(bat.continueFight(2, hero1, vil1) >-25 ); 
		assertTrue(bat.continueFight(3, hero1, vil1) <20 ); 
		assertTrue(bat.continueFight(3, hero1, vil1) >-25 ); 
	}

	

}
