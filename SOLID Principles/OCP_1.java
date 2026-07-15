interface ShippingCalculator {
    void calculateShipping();
}

class USShippingCalculator implements ShippingCalculator {

    @Override
    public void calculateShipping() {
        // Code to calculate US shipping...
    }
}

class UKShippingCalculator implements ShippingCalculator {

    @Override
    public void calculateShipping() {
        // Code to calculate UK shipping...
    }
}

class INShippingCalculator implements ShippingCalculator {

    @Override
    public void calculateShipping() {
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