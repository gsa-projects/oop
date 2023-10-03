package ch4.p1;

class Anything extends Something {
    @Override
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
//        try { System.out.print(privatical); } catch (Exception ignored) {}
    }
}
