public interface Conversion {
    public void intToDouble();

    public void stringToInt();

    public void charToString();
}

// The above interface has three methods. If we want to use only a method
// stringToInt(), we have no choice to implement the single method. To overcome
// the problem, the principle allows us to split the interface into three
// separate ones

interface ConvertIntToDouble {
    public void intToDouble();
}

interface ConvertIntToChar {
    public void stringToInt();
}

interface ConvertCharToString {
    public void charToString();
}

// Now we can use only the method that is required. Suppose, we want to convert
// the integer to double and character to string then, we will use only the
// methods intToDouble() and charToString().

class DataTypeConversion implements ConvertIntToDouble, ConvertCharToString {
    public void intToDouble() {
        // conversion logic
    }

    public void charToString() {
        // conversion logic
    }
}
