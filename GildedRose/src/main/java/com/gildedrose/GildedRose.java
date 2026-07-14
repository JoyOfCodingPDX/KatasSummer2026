package com.gildedrose;

class GildedRose {
    static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    static final String AGED_BRIE = "Aged Brie";
    MutableItem[] items;

    public GildedRose(MutableItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
      for (MutableItem item : items) {
        if (item.name.equals(AGED_BRIE) || item.name.equals(BACKSTAGE_PASS)) {
          if (item.quality < 50) {
            item.increaseQuality();

            if (item.name.equals(BACKSTAGE_PASS)) {
              if (item.sellIn < 11) {
                  item.increaseQuality();
              }

              if (item.sellIn < 6) {
                  item.increaseQuality();
              }
            }
          }
        } else {
          if (item.quality > 0) {
            if (!item.name.equals(Sulfuras.SULFURAS)) {
              item.degradeQuality();
            }
          }
        }

        if (!item.name.equals(Sulfuras.SULFURAS)) {
          item.sellIn = item.sellIn - 1;
        }

        if (item.sellIn < 0) {
          if (!item.name.equals(AGED_BRIE)) {
            if (!item.name.equals(BACKSTAGE_PASS)) {
              if (item.quality > 0) {
                if (!item.name.equals(Sulfuras.SULFURAS)) {
                  item.degradeQuality();
                }
              }
            } else {
              item.quality = 0;
            }
          } else {
              item.increaseQuality();
          }
        }
      }
    }
}
