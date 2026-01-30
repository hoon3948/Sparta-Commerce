public enum Rank {
    BRONZE("Bronze", 0, 500000),
    SILVER("Silver", 500000, 1000000),
    GOLD("Gold", 1000000, 2000000),
    PLATINUM("Platinum", 2000000, Integer.MAX_VALUE);

    private final String name;
    private final int minAmount;
    private final int maxAmount;

    Rank(String name, int minAmount, int maxAmount) {
        this.name = name;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }

    public String getName(){
        return name;
    }

    public static Rank fromAmount(int amount){
        for(Rank rank : values()){
            if(rank.minAmount <= amount && rank.maxAmount > amount){
                return rank;
            }
        }
    }
}
