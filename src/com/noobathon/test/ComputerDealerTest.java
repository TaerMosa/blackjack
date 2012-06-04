package com.noobathon.test;


import com.noobathon.blackjack.*;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ComputerDealerTest
{
	private ComputerDealer hit = new ComputerDealer("hit");
	private ComputerDealer stay;

	@Before
	public void setUp() throws Exception
	{
		hit = new ComputerDealer("hit");
		hit.dealCard(new Card(7));
		hit.dealCard(new Card(9));
		stay = new ComputerDealer("stay");
		stay.dealCard(new Card(10));
		stay.dealCard(new Card(11));
	}

	@Test
	public void testTakeAction()
	{
		assertTrue(hit.getName().equals("hit"));
		assertTrue(hit.getHandValue()== 16);

		assertTrue(hit.takeAction() == Action.Hit);
		assertTrue(stay.takeAction() == Action.Stay);
	}

}
