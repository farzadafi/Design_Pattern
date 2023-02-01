class RealPrinter {
    //the delegate

    void print () {
        System.out.println("The Delegate");
    }
}

class Printer {
    //the delegator

    RealPrinter realPrinter = new RealPrinter();

    // create the delegate
    void print() {
        realPrinter.print(); //delegation
    }
}

class Main {
    //To the outside world it looks like printer actually prints
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}