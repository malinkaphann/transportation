package transportation;

/**
 * This is transportation class
 * 
 */
class Transportation {

    /**
     * to transport
     * 
     * @param truck
     * @param cargoWeight
     * @return status
     */
    public int transport (Truck truck, int cargoWeight) {
        if (truck == null) {
            throw new IllegalArgumentException("input truck is invalid");
        }

        if (cargoWeight < 0) {
            throw new IllegalArgumentException("cargo weight must be positive");
        }

        if (cargoWeight > truck.getMaxWeightSupport()) {
            System.out.println(
                    String.format("a truck can only load cargo of %d weight", truck.getMaxWeightSupport())
            );
            return -1;
        }

        System.out.println(
            String.format("cargo of %d weight is now loaded into a truck", cargoWeight)
        );

        return 0;
    }
}