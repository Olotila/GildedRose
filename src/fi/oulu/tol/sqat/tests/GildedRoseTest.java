/* 
In assignment there are 2 bugs, if the purpose is to learn testing (and not reading and not being confused and not waste time):
1. Nowhere is explicitly said "quality/value degrades by one per day".
2. The text 

""Backstage passes", ***like*** aged brie, increases in Quality as it's SellIn value
approaches; Quality increases by 2 when there are 10 days or less and by 3 when
there are 5 days or less but Quality drops to 0 after the concert."

strictly implies aged brie and backstage passes are equivalent. Per example test, they are not. 

 */

package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {

// Example scenarios for testing


	

	@Test
	public void testUpdateEndOfDay_AgedBrie_Quality_10_11() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Aged Brie", 2, 10) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemBrie = items.get(0);
		assertEquals(11, itemBrie.getQuality());
	}
    
//  Item("+5 Dexterity Vest", 10, 20));
	@Test
	public void testUpdateEndOfDay_Vest2021() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("+5 Dexterity Vest", 10, 20) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemBrie = items.get(0);
		assertEquals(19, itemBrie.getQuality());
	}
	
//  Item("Aged Brie", 2, 0));
	@Test
	public void testUpdateEndOfDay_AgedBrie_Quality_00() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Aged Brie", 2, 10) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemBrie = items.get(0);
		assertEquals(0, itemBrie.getQuality());
	}
	
//  Item("Elixir of the Mongoose", 5, 7));

	
	@Test
	public void testUpdateEndOfDay_elixir7() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Elixir of the Mongoose", 5, 7) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemBrie = items.get(0);
		assertEquals(6, itemBrie.getQuality());
	}
//  Item("Sulfuras, Hand of Ragnaros", 0, 80));
	
	@Test
	public void testUpdateEndOfDay_sulfu80() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemBrie = items.get(0);
		assertEquals(80, itemBrie.getQuality());
	}

//  Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
	
	@Test
	public void testUpdateEndOfDay_pass1520() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemBrie = items.get(0);
		assertEquals(21, itemBrie.getQuality());
	}

//  Item("Conjured Mana Cake", 3, 6));
	
	@Test
	public void testUpdateEndOfDay_cake36() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Conjured Mana Cake", 3, 6) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemBrie = items.get(0);
		assertEquals(5, itemBrie.getQuality());
	}
	    
}
