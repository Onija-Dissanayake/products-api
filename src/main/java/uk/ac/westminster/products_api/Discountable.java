package uk.ac.westminster.products_api;

// Both DigitalProduct and PhysicalProduct compile with different applyDiscount code,
// because an interface only fixes the method signature, not the body.

public interface Discountable {
    void applyDiscount(double rate);
    double getDiscountedPrice();
}
