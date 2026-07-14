package com.gildedrose;

import org.jspecify.annotations.NonNull;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.gildedrose.GildedRose.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    private static @NonNull Item updateQuality(String name, int sellIn, int quality) {
        return updateQuality(name, sellIn, quality, 1);
    }

    private static @NonNull Item updateQuality(String name, int sellIn, int quality, int numberOfDays) {
        Item item = new Item(name, sellIn, quality);
        Item[] items = new Item[] {item};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < numberOfDays; i++) {
            app.updateQuality();
        }
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
        Item item = updateQuality(AGED_BRIE, 2, 0);
        assertThat(item.sellIn, equalTo(1));
        assertThat(item.quality, equalTo(1));
    }


    @Test
    void maximumQualityOfAgedBrieIs50() {
        Item item = updateQuality(AGED_BRIE, 2, 50);
        assertThat(item.sellIn, equalTo(1));
        assertThat(item.quality, equalTo(50));
    }

    @Disabled("Conjured Items not supported yet")
    @Test
    void qualityOfConjuredItemDecreasesBy2() {
        Item item = updateQuality("Conjured Item", 3, 6);
        assertThat(item.sellIn, equalTo(2));
        assertThat(item.quality, equalTo(4));
    }

    @Test
    void qualityOfBackstagePassesIs0AfterSellInDate() {
        Item item = updateQuality(BACKSTAGE_PASS, 0, 57);
        assertThat(item.sellIn, equalTo(-1));
        assertThat(item.quality, equalTo(0));
    }

    @Test
    void qualityOfRegularItemDecreasesBy2AfterSellInDate() {
        Item item = updateQuality("Regular Item", 0, 20);
        assertThat(item.sellIn, equalTo(-1));
        assertThat(item.quality, equalTo(18));
    }


    @Test
    void qualityOfBackstagePassIncreasesBy1MoreThan10DaysBeforeSellInDate() {
        Item item = updateQuality(BACKSTAGE_PASS, 17, 20, 7);
        assertThat(item.sellIn, equalTo(10));
        assertThat(item.quality, equalTo(27));
    }

    @Test
    void qualityOfBackstagePassIncreasesBy2Between10And5DaysBeforeSellInDate() {
        Item item = updateQuality(BACKSTAGE_PASS, 10, 20, 5);
        assertThat(item.sellIn, equalTo(5));
        assertThat(item.quality, equalTo(30));
    }

    @Test
    void qualityOfBackstagePassIncreasesBy3DuringThe5DaysBeforeSellInDate() {
        Item item = updateQuality(BACKSTAGE_PASS, 5, 20, 5);
        assertThat(item.sellIn, equalTo(0));
        assertThat(item.quality, equalTo(35));
    }

    @Test
    void qualityOfBackstagePassStays0AfterSellInDate() {
        Item item = updateQuality(BACKSTAGE_PASS, -1, 0);
        assertThat(item.sellIn, equalTo(-2));
        assertThat(item.quality, equalTo(0));
    }

    @Test
    void qualityOfSulfurasNeverChanges() {
        Item item = updateQuality(SULFURAS, 0, 80);
        assertThat(item.sellIn, equalTo(0));
        assertThat(item.quality, equalTo(80));
    }
}
