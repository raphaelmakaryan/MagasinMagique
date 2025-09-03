package com.magasin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MagasinTest {

    @Test
    void foo() {
        Item[] items = new Item[]{new Item("Pouvoirs magiques", 0, 54), new Item("Comté", 10, 0), new Item("Pass VIP Concert", 1, 1), new Item("Kryptonite", 10, 80)};
        Magasin app = new Magasin(items);
        //app.newUpdateQualityCommented();
        Assertions.assertEquals("Pouvoirs magiques", app.items[0].name);
    }

    @Test
    void oldVersion() {
        //Item[] items = new Item[]{new Item("Pouvoirs magiques", 0, 25), new Item("Comté", 10, 0), new Item("Pass VIP Concert", 1, 1), new Item("Kryptonite", 10, 80)};
        Item[] items = new Item[]{new Item("Pouvoirs magiques", 0, 25)};
        Magasin app = new Magasin(items);
        app.updateQuality();
        Assertions.assertEquals("Pouvoirs magiques", app.items[0].name);
    }

    @Test
    void newVersion() {
        //Item[] items = new Item[]{new Item("Pouvoirs magiques", 0, 25), new Item("Comté", 10, 0), new Item("Pass VIP Concert", 1, 1), new Item("Kryptonite", 10, 80)};
        Item[] items = new Item[]{new Item("Pouvoirs magiques", 0, 25)};
        Magasin app = new Magasin(items);
        app.newUpdateQualityNotCommented();
        Assertions.assertEquals("Pouvoirs magiques", app.items[0].name);
    }

    @Test
    void comparaison() {
        // Old :
        Item[] itemsOld = new Item[]{new Item("Pouvoirs magiques", 0, 25), new Item("Comté", 10, 2), new Item("Pass VIP Concert", 8, 1), new Item("Kryptonite", 0, 80)};
        // New :
        Item[] itemsNews = new Item[]{new Item("Pouvoirs magiques", 0, 25), new Item("Comté", 10, 2), new Item("Pass VIP Concert", 8, 1), new Item("Kryptonite", 0, 80)};

        Magasin appOld = new Magasin(itemsOld);
        int[] old = appOld.updateQualityComparaison();

        Magasin appNew = new Magasin(itemsNews);
        int[] New = appNew.newUpdateQualityComparaison();

        Assertions.assertArrayEquals(old, New);
    }


}
