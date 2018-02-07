package t2;

/** 
 * 建造者模式
 * 以午餐为例吧
 * 刚吃完，还有点撑，哈哈
 * 场景：自助餐【公司就是吃这个】
 *
 */
public class Lunch {
	private final String chicken ;//鸡肉
	private final String fish ;//鱼肉
	private final String pork ;//猪肉
	private final String doufu ;//豆腐
	private final String spinage ;//菠菜
	private final String potato ;//土豆
	private final String seaweedSoup ;//紫菜汤
	private final String rice ;//米饭
	
	public Lunch(Builder builder) {
		chicken = builder.chicken ;
		fish = builder.fish ;
		pork = builder.pork ;
		doufu = builder.doufu ;
		spinage = builder.spinage ;
		potato = builder.potato ;
		seaweedSoup = builder.seaweedSoup ;
		rice = builder.rice ;
	} 
	 
	@Override
	public String toString() {
		return "Lunch [chicken=" + chicken + ", fish=" + fish + ", pork=" + pork + ", doufu=" + doufu + ", spinage="
				+ spinage + ", potato=" + potato + ", seaweedSoup=" + seaweedSoup + ", rice=" + rice + "]";
	} 

	public static class Builder{
		private String chicken ;//鸡肉
		private String fish ;//鱼肉
		private String pork ;//猪肉
		private String doufu ;//豆腐
		private String spinage ;//菠菜
		private String potato ;//土豆
		private String seaweedSoup ;//紫菜汤
		private String rice ;//米饭
		
		public Builder chicken(String value){
			chicken = value ;
			return this ;
		}
		
		public Builder fish(String value){
			fish = value ;
			return this ;
		}
		
		public Builder pork(String value){
			pork = value ;
			return this ;
		}
		
		public Builder doufu(String value){
			doufu = value ;
			return this ;
		}
		
		public Builder spinage(String value){
			spinage = value ;
			return this ;
		}
		
		public Builder potato(String value){
			potato = value ;
			return this ;
		}
		
		public Builder seaweedSoup(String value){
			seaweedSoup = value ;
			return this ;
		}
		
		public Builder rice(String value){
			rice = value ;
			return this ;
		}
		
		public Lunch bulid() {
			return new Lunch(this);
		}
		
	}
	
}
