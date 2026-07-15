interface Discount {
    void applyDiscount();
}

class SeasonalDiscount implements Discount {

    @Override
    public void applyDiscount() {
        // Code to apply seasonal discount...
    }
}

class LoyaltyDiscount implements Discount {

    @Override
    public void applyDiscount() {
        // Code to apply loyalty discount...
    }
}

class CouponDiscount implements Discount {

    @Override
    public void applyDiscount() {
        // Code to apply coupon discount...
    }
}

class ReferralDiscount implements Discount {

    @Override
    public void applyDiscount() {
        // Code to apply referral discount...
    }
}