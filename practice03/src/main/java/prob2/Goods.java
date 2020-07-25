package prob2;

public class Goods {
	private String goods;	
	private int goddsPrice;	
	private int goodsMount;
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public int getGoddsPrice() {
		return goddsPrice;
	}
	public void setGoddsPrice(int goddsPrice) {
		this.goddsPrice = goddsPrice;
	}
	public int getGoodsMount() {
		return goodsMount;
	}
	public void setGoodsMount(int goodsMount) {
		this.goodsMount = goodsMount;
	}
	public Goods(String goods, int goddsPrice, int goodsMount) {
		super();
		this.goods = goods;
		this.goddsPrice = goddsPrice;
		this.goodsMount = goodsMount;
	}
	
	
	
}
