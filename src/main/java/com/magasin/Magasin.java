package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            int oldSellIn = items[i].sellIn;
            int oldQuality = items[i].quality;
            if (!items[i].name.equals("Comté")
                    && !items[i].name.equals("Pass VIP Concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Kryptonite")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Pass VIP Concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Kryptonite")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Comté")) {
                    if (!items[i].name.equals("Pass VIP Concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Kryptonite")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
            result(items[i].name, oldSellIn, oldQuality, items[i].sellIn, items[i].quality);
        }
    }

    public int[] updateQualityComparaison() {
        for (int i = 0; i < items.length; i++) {
            int[] resultCompare = new int[2];
            if (!items[i].name.equals("Comté")
                    && !items[i].name.equals("Pass VIP Concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Kryptonite")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Pass VIP Concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Kryptonite")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Comté")) {
                    if (!items[i].name.equals("Pass VIP Concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Kryptonite")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
            resultCompare[0] = items[i].sellIn;
            resultCompare[1] = items[i].quality;
            return resultCompare;
        }
        return new int[0];
    }

    public void result(String nom, int oldSellIn, int oldQuality, int newSellIn, int newQuality) {
        System.out.println("Pour l'item " + nom + " avec un sellIn de " + oldSellIn + " et une quality de " + oldQuality + ", le nouveau sellIn est de " + newSellIn + " et la nouvelle quality est de " + newQuality + " \n");
    }

    public void newUpdateQuality() {
        // 30 lignes
        for (int i = 0; i < items.length; i++) {
            int oldSellIn = items[i].sellIn;
            int oldQuality = items[i].quality;
            if (!items[i].name.equals("Comté") && !items[i].name.equals("Pass VIP Concert") && !items[i].name.equals("Kryptonite") && items[i].quality > 0) {
                items[i].quality = items[i].quality - 1;
                if (items[i].name.equals("Pouvoirs magiques")) {
                    items[i].quality = items[i].quality - 2;
                }
            } else if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;
                if (items[i].name.equals("Pass VIP Concert") && items[i].sellIn < 11) {
                    items[i].quality = items[i].quality + 1;
                }
            }
            if (!items[i].name.equals("Kryptonite")) {
                items[i].sellIn = items[i].sellIn - 1;
            }
            if (items[i].sellIn < 0) {
                if (items[i].quality > 0 && !items[i].name.equals("Kryptonite")) {
                    items[i].quality = items[i].quality - 1;
                } else if (!items[i].name.equals("Pass VIP Concert")) {
                    items[i].quality = 0;
                } else if (!items[i].name.equals("Comté") && items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
            }
            result(items[i].name, oldSellIn, oldQuality, items[i].sellIn, items[i].quality);
        }
    }

    public int[] newUpdateQualityComparaison() {
        for (int i = 0; i < items.length; i++) {
            int[] resultCompare = new int[2];
            if (!items[i].name.equals("Comté") && !items[i].name.equals("Pass VIP Concert") && !items[i].name.equals("Kryptonite") && items[i].quality > 0) {
                items[i].quality = items[i].quality - 1;
                /*
                if (items[i].name.equals("Pouvoirs magiques")) {
                    items[i].quality = items[i].quality - 2;
                }
                 */
            } else if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;
                if (items[i].name.equals("Pass VIP Concert") && items[i].sellIn < 11) {
                    items[i].quality = items[i].quality + 1;
                }
            }
            if (!items[i].name.equals("Kryptonite")) {
                items[i].sellIn = items[i].sellIn - 1;
            }
            if (items[i].sellIn < 0 && !items[i].name.equals("Comté") && !items[i].name.equals("Kryptonite") && items[i].quality > 0) {
                if (items[i].name.equals("Pass VIP Concert")) {
                    items[i].quality = 0;
                } else {
                    items[i].quality = items[i].quality - 1;
                }
            } else if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;
            }
            resultCompare[0] = items[i].sellIn;
            resultCompare[1] = items[i].quality;
            return resultCompare;
        }
        return null;
    }

}