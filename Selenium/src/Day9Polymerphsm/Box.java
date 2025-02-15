package Day9Polymerphsm;

public class Box {

	double hight;
	double width;
	double depth;

	Box() {

		hight = width = depth = 0;
	}

	Box(double x, double y, double z) {

		width = x;
		hight = y;
		depth = z;

	}

	Box(double len) {
		width = hight = depth = len;
	}

	double volume() {
		return (width * hight * depth);
	}

}
