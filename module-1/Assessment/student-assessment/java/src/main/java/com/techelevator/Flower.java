package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Flower implements Comparable<Flower>{
    private static final Comparator<String> NULL_SAFE_STRING_COMPARATOR
            = Comparator.nullsFirst(String::compareToIgnoreCase);

    private final String code;
    private final String name;
    private final List<Bundle> bundles;

    private Flower() {
        this.code = null;
        this.name = null;
        this.bundles = null;
    }

    public Flower(final String code, final String name, final List<Bundle> bundles) {
        this.code = code;
        this.name = name;
        this.bundles = bundles;
    }

    public String code() {
        return code;
    }

    public String name() {
        return name;
    }

    public void addBundle(final Bundle bundle) {
        bundles.add(bundle);
    }

    public boolean removeBundle(final Bundle bundle) {
        return bundles.remove(bundle);
    }

    public List<Bundle> bundles() {
        final List<Bundle> bundlesCopy = new ArrayList<>(bundles);
        Collections.sort(bundlesCopy);
        return bundlesCopy;
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", name=" + name + ", bundles=" + bundles + '}';
    }

    @Override
    public int compareTo(final Flower other) {
        return NULL_SAFE_STRING_COMPARATOR.compare(this.code, other.code);
    }
}

