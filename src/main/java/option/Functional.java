package option;

import io.vavr.control.Option;

class Functional {

    // compiles and safe code since negative case was handled
    Integer getLengthGood(String s) {
        return Option.of(s).
            map(nonNullS -> nonNullS.length()).
            getOrElse(0); // assume 0 is our default value
    }

    // does not compile because negative case was not handled
//    Integer getLengthBad(String s) {
//        return Option.of(s).
//            map(nonNullS -> nonNullS.length());
//    }

    // does not compile because no default value is provided
//    Integer getLengthReallyBad(String s) {
//        return Option.of(s).
//            map(nonNullS -> nonNullS.length()).
//            getOrElse();
//    }

    String isLengthEvenOrOdd(String s) {
        return Option.of(s).
            filter(nonNullS -> nonNullS.length() > 0).
            map(nonNullS -> s.length()).
            map(strInt -> strInt % 2 == 0 ? "Even" : "Odd").
            getOrElse("Empty");
    }
}

