public interface BidCollectionInterface {

    void addBid(BidInterface bid);

    BidInterface getBestYearlyCostBid();

    BidInterface getBestInitialCostBid();

    void clear();

    int getSize();

    boolean isEmpty();
}