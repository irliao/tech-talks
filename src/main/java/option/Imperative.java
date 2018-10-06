package option;

class Imperative {

    // compiles and negative case handled
    Integer getLengthGood(String s) {
        if (s == null) {
            return 0; // assume 0 is our default value
        }
        return s.length();
    }

    // compiles and negative case unhandled
    Integer getLengthBad(String s) {
        return s.length(); // NPE
    }

    // compiles, null checked, but wrong
    Integer getLengthReallyBad(String s) {
        if (s == null) {
            // some operation(s) unrelated to s
        }
        return s.length();
    }

    String isLengthEvenOrOdd(String s) {
        if (s == null) {
            return "Empty";
        }

        int length = s.length();
        if (length > 0) {
            if (length % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }

        return "Empty";
    }
}
