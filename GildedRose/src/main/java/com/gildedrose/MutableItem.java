package com.gildedrose;

public class MutableItem extends Item {
  public MutableItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  public void degradeQuality() {
    this.quality = this.quality - 1;
  }

  public void increaseQuality() {
    if (this.quality < 50) {
      this.quality = this.quality + 1;
    }
  }
}
