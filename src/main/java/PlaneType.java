public enum PlaneType {
    BOEING747(3, 300),
    AIRBUSA300(1, 100);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getPlaneCapacity(){
        return capacity;
    }

    public int getPlaneTotalWeight(){
        return totalWeight;
    }

}
