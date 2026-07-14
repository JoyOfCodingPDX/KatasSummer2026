package com.gildedrose;

import org.jspecify.annotations.NonNull;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Disabled // This needs to be fixed
    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    private static @NonNull Item updateQuality(String name, int sellIn, int quality) {
        Item item = new Item(name, sellIn, quality);
        Item[] items = new Item[] {item};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return item;
    }

    @Test
    void regularItemDecreasesQualityAndSellInByOne() {
        Item item = updateQuality("Regular Item", 10, 20);
        assertThat(item.sellIn, equalTo(9));
        assertThat(item.quality, equalTo(19));
    }

    @Test
    void agedBrieQualityIncreasesAtEndOfDay() {
        Item item = updateQuality("Aged Brie", 2, 0);
        assertThat(item.sellIn, equalTo(1));
        assertThat(item.quality, equalTo(1));
    }
}
