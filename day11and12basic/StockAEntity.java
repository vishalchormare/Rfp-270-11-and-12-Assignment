package day11and12basic;

public class StockAEntity {
	private String stockNames;
	private Double numOfShare;
	private Double sharePrice;

	public StockAEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StockAEntity(String stockNames, Double numOfShare, Double sharePrice) {
		super();
		this.stockNames = stockNames;
		this.numOfShare = numOfShare;
		this.sharePrice = sharePrice;
	}

	public String getStockNames() {
		return stockNames;
	}

	public void setStockNames(String stockNames) {
		this.stockNames = stockNames;
	}

	public Double getNumOfShare() {
		return numOfShare;
	}

	public void setNumOfShare(Double numOfShare) {
		this.numOfShare = numOfShare;
	}

	public Double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(Double sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "StockAEntity [stockNames=" + stockNames + ", numOfShare=" + numOfShare + ", sharePrice=" + sharePrice
				+ "]";
	}
}
