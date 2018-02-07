package t3_01;
@Description(age = 111)
public class Test {
	 
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("t3_01.Test");
			boolean isExist = c.isAnnotationPresent(Description.class);//判断类的注解【方法的注解要Method.isAnnotationPresent】

			System.out.println(isExist);
			if(isExist) {
				Description d = (Description) c.getAnnotation(Description.class);
				System.out.println(d.age()+"   "+d.author()+"    "+d.desc());
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
