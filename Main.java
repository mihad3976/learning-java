import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"What do you wish to calculate?\n1 - Area of a triangle\n2 - Area of a circle\n3 - Volume of a pyramid\n4 - Speed of object");
		int selection = input.nextInt();

		switch (selection) {
			case 1: { // Triangle
				double baseValue, heightValue;
				System.out.println("Selected \033[0;36mArea of a triangle\033[0m\nPlease enter the \033[0;34mbase \033[0mvalue");
				baseValue = input.nextDouble();
				System.out.println("Please enter the \033[0;34mheight \033[0mvalue");
				heightValue = input.nextDouble();
				double area = ((baseValue * heightValue) / 2);
				System.out.println("Using a height of \033[0;34m" + heightValue + "\033[0m and base of \033[0;34m" + baseValue + "\033[0m the calculated area equals: \033[0;32m" + area);
				break;
			}
			case 2: { // Circle
				double diameterValue;
				System.out.println("Selected \033[0;36mArea of a circle\033[0m\nPlease enter the \033[0;34mdiameter \033[0mvalue");
				diameterValue = input.nextDouble();
				double area = (Math.PI * (diameterValue * diameterValue));
				System.out.println("Using a diameter of \033[0;34m" + diameterValue + "\033[0m the calculated area equals: \033[0;32m" + area);
				break;
			}
			case 3: { // Pyramid
				double baseLengthValue, baseWidthValue, heightValue;
				System.out.println("Selected \033[0;36mVolume of a pyramid\033[0m\nPlease enter the \033[0;34mbase length \033[0mvalue");
				baseLengthValue = input.nextDouble();
				System.out.println("Please enter the \033[0;34mbase width \033[0mvalue");
				baseWidthValue = input.nextDouble();
				System.out.println("Please enter the \033[0;34mheight \033[0mvalue");
				heightValue = input.nextDouble();
				double volume = ((baseLengthValue * baseWidthValue) * heightValue) / 3;
				System.out.println("Using a base length of \033[0;34m" + baseLengthValue + "\033[0m, base width of \033[0;34m" + baseWidthValue + "\033[0m and height of \033[0;34m" + heightValue + "\033[0m the calculated volume equals: \033[0;32m" + volume);
				break;
			}
			case 4: { // Speed
				double distanceValue, timeValue;
				System.out.println("Selected \033[0;36mSpeed of object\033[0m\nPlease enter the \033[0;34mdistance (units) \033[0mvalue");
				distanceValue = input.nextDouble();
				System.out.println("Please enter the \033[0;34mtime \033[0mvalue");
				timeValue = input.nextDouble();
				double speed = (distanceValue / timeValue);
				System.out.println("Using a distace of \033[0;34m" + distanceValue + "\033[0m  and a time of \033[0;34m" + timeValue + "\033[0m the calculated speed equals: \033[0;32m" + speed + " units per second");
				break;
			}
			default: {
				System.out.println("\033[0;31mInvalid Option :(");
				break;
			}
		}
	}
}