package classes;

/*
 * One thing you need to remember here is that you cannot
 * use the final keyword because it is an interface,
 * but you can use the non-sealed keyword it
 * */
non-sealed public interface StoreableProduct extends Product {
    void store();
}
