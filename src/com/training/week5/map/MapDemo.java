package com.training.week5.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapDemo implements Map {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    //Object put(Object key, Object value): add one entry to the map, if key is already is present, new value will replace the old value and it returns the old value
    //void putAll(Map m): To add a group of Key value pairs(map)
    //boolean containsKey(Object key): Checks whether the key is present in the map, returns true if present, else returns false
    //boolean containsValue(Object value): Checks whether the value is present in the map, returns true if present, else returns false
    //Object get(Object key): get the value for the corresponding key
    //Set keySet(): Gives all the keys as Set
    //Collection values(): Gives all the values as Collection
    //Set<Entry> entrySet(): Gives a set of Entries(Entry --> Key + Value)
    //Object remove(Object key): Removes the entry from Map for the given key
    //void clear(): Removes all the entries from Map
    //boolean isEmpty(): checks whether the map is empty, returns true if empty, returns false if not empty
    //int size(): Returns size of the map, integer value

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
