package exercises.oop;

public class Main {

	public static void main(String[] args) {
		
		Rectangle jonasRectangle = new Rectangle(12.0f, 4.0f);
		
		jonasRectangle.setLength(30.5f);
		System.out.println(jonasRectangle.getLength());

		System.out.println(jonasRectangle.getWidth());
		
		
		System.out.println(jonasRectangle.getArea());

	}

}
