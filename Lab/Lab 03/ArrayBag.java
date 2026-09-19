public class ArrayBag<T> implements BagInterface<T> {

    private T[] bag;
    private final int DEFAULT_CAPACITY;
    private int numberOfEntries;

    // public ArrayBag(int numberOfEntries) {
    //     this.DEFAULT_CAPACITY = 25;
    //     this.bag = (T[]) new Object[DEFAULT_CAPACITY];
    //     this.numberOfEntries = numberOfEntries;
    // }

    public ArrayBag() {
        this.DEFAULT_CAPACITY = 25;
        this.bag = (T[]) new Object[DEFAULT_CAPACITY];
        this.numberOfEntries = numberOfEntries;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == DEFAULT_CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (numberOfEntries < DEFAULT_CAPACITY) {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }

        return false;
    }

    @Override
    public T remove() {
        if (numberOfEntries > 0) {
            T result = bag[numberOfEntries - 1];

            bag[numberOfEntries - 1] = null;
            numberOfEntries--;

            return result;
        }

        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        for (int index = 0; index < numberOfEntries; index++) {

            if (bag[index].equals(anEntry)) {

                // Move the last element into the removed element's position
                bag[index] = bag[numberOfEntries - 1];

                // Remove the duplicate reference at the end
                bag[numberOfEntries - 1] = null;

                numberOfEntries--;

                return true;
            }
        }

        return false;
    }

    @Override
    public void clear() {
        while (numberOfEntries > 0) {
            bag[numberOfEntries - 1] = null;
            numberOfEntries--;
        }
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;

        for (int index = 0; index < numberOfEntries; index++) {
            if (bag[index].equals(anEntry)) {
                frequency++;
            }
        }

        return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        return getFrequencyOf(anEntry) > 0;
    }

    // @Override
    // public BagInterface<T> union(BagInterface<T> anotherBag) {
    //
    //     ArrayBag<T> result = new ArrayBag<>(0);
    //
    //     for (int index = 0; index < numberOfEntries; index++) {
    //         result.add(bag[index]);
    //     }
    //
    //     // Add all entries from anotherBag
    //     T[] anotherBagArray = anotherBag.toArray();
    //
    //     for (int index = 0; index < anotherBagArray.length; index++) {
    //         result.add(anotherBagArray[index]);
    //     }
    //
    //     return result;
    // }

    @Override
    public BagInterface<T> union(BagInterface<T> anotherBag) {

        ArrayBag<T> result = new ArrayBag<>();

        for (int index = 0; index < numberOfEntries; index++) {
            result.add(bag[index]);
        }

        // Add all entries from anotherBag
        T[] anotherBagArray = anotherBag.toArray();

        for (int index = 0; index < anotherBagArray.length; index++) {
            result.add(anotherBagArray[index]);
        }

        return result;
    }

    // @Override
    // public BagInterface<T> intersection(BagInterface<T> anotherBag) {
    //
    //     ArrayBag<T> result = new ArrayBag<>(0);
    //
    //     // Make a copy of anotherBag
    //     ArrayBag<T> tempBag = new ArrayBag<>(0);
    //
    //     Object[] anotherBagArray = anotherBag.toArray();
    //
    //     for (Object entry : anotherBagArray) {
    //         tempBag.add((T) entry);
    //     }
    //
    //     for (int index = 0; index < numberOfEntries; index++) {
    //
    //         T currentEntry = bag[index];
    //
    //         // If the entry exists in tempBag
    //         if (tempBag.contains(currentEntry)) {
    //
    //             // Add it to the intersection
    //             result.add(currentEntry);
    //
    //             // Remove one occurrence so duplicates
    //             // are handled correctly
    //             tempBag.remove(currentEntry);
    //         }
    //     }
    //
    //     return result;
    // }

    @Override
    public BagInterface<T> intersection(BagInterface<T> anotherBag) {

        ArrayBag<T> result = new ArrayBag<>();

        // Make a copy of anotherBag
        ArrayBag<T> tempBag = new ArrayBag<>();

        Object[] anotherBagArray = anotherBag.toArray();

        for (Object entry : anotherBagArray) {
            tempBag.add((T) entry);
        }

        for (int index = 0; index < numberOfEntries; index++) {

            T currentEntry = bag[index];

            // If the entry exists in tempBag
            if (tempBag.contains(currentEntry)) {

                // Add it to the intersection
                result.add(currentEntry);

                // Remove one occurrence so duplicates
                // are handled correctly
                tempBag.remove(currentEntry);
            }
        }

        return result;
    }

    // @Override
    // public BagInterface<T> difference(BagInterface<T> anotherBag) {
    //
    //     ArrayBag<T> result = new ArrayBag<>(0);
    //
    //     ArrayBag<T> tempBag = new ArrayBag<>(0);
    //
    //     Object[] anotherBagArray = anotherBag.toArray();
    //
    //     for (Object entry : anotherBagArray) {
    //         tempBag.add((T) entry);
    //     }
    //
    //     for (int index = 0; index < numberOfEntries; index++) {
    //
    //         T currentEntry = bag[index];
    //
    //         // If current entry exists in anotherBag,
    //         // remove one occurrence from the temporary bag.
    //         if (tempBag.contains(currentEntry)) {
    //             tempBag.remove(currentEntry);
    //         }
    //         else {
    //             // Otherwise, keep the entry in the result
    //             result.add(currentEntry);
    //         }
    //     }
    //
    //     return result;
    // }

    @Override
    public BagInterface<T> difference(BagInterface<T> anotherBag) {

        ArrayBag<T> result = new ArrayBag<>();

        ArrayBag<T> tempBag = new ArrayBag<>();

        Object[] anotherBagArray = anotherBag.toArray();

        for (Object entry : anotherBagArray) {
            tempBag.add((T) entry);
        }

        for (int index = 0; index < numberOfEntries; index++) {

            T currentEntry = bag[index];

            // If current entry exists in anotherBag,
            // remove one occurrence from the temporary bag.
            if (tempBag.contains(currentEntry)) {
                tempBag.remove(currentEntry);
            } else {
                // Otherwise, keep the entry in the result
                result.add(currentEntry);
            }
        }

        return result;
    }

    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[numberOfEntries];

        for (int index = 0; index < numberOfEntries; index++) {
            result[index] = bag[index];
        }
        return result;
    }
}