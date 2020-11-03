package com.val;

public class Guitar extends Instruments {

    public Guitar(String name, String category) {

        setName(name);
        setCategory(category);

    }

    @Override
    public String toString() {
        return String.format("Instrument name is %s| Category: %s", getName(), getCategory());
    }
}
