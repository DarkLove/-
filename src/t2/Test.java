package t2;

public class Test {
	public static void main(String[] args) {
		Lunch lunch = new Lunch.Builder()
				.chicken("我爱吃鸡肉")
				.fish("听说吃鱼会变聪明")
				.rice("从小吃菜要拌米饭")
				.spinage("妈妈说吃青菜对身体好")
				.seaweedSoup("饭后一碗汤，啧啧")
				.bulid(); 
		System.out.println(lunch.toString());
	}
}
