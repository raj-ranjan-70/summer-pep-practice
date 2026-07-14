Interface ShippingCalculator {
    void calculateShipping() {}
}

class USShippingCalculator implements ShippingCalaulator {

    @Override
    void calculateShipping() {
        // Code to calculate US shipping...
    }
}

class UKShippingCalculator implements ShippingCalaulator {

    @Override
    void calculateShipping() {
        // Code to calculate UK shipping...
    }
}

class INShippingCalculator implements ShippingCalaulator {

    @Override
    void calculateShipping() {
        // Code to calculate IN shipping...
    }
}

// void show(String str) {
//     sout("String");
// }

// void show(Integer Int) {
//     sout("Interger");
// }

// show(null);