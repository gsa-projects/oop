package ch4.p1;

public class Something {
    public int publical = 0;
    protected int protectical = 0;
    int defaultical = 0;
    private int privatical = 0;

    void check() {
        System.out.print("\npublic: ");
        try {
            System.out.print(publical);
        } catch (Exception ignored) {
        }

        System.out.print("\nprotectical: ");
        try {
            System.out.print(protectical);
        } catch (Exception ignored) {
        }

        System.out.print("\ndefaultical: ");
        try {
            System.out.print(defaultical);
        } catch (Exception ignored) {
        }

        System.out.print("\nprivatical: ");
        try {
            System.out.print(privatical);
        } catch (Exception ignored) {
        }
    }
}
