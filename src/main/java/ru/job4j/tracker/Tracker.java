package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = this.items[i];
            if (item.getName().equals(key)) {
                rsl[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    public Item[] findAll() {
        Item[] itemsIsNotNULL = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length - 1; i++) {
            Item id = items[i];
            if (id != null) {
                itemsIsNotNULL[size] = id;
                size++;
            }
        }
        return Arrays.copyOf(itemsIsNotNULL, size);
    }
}