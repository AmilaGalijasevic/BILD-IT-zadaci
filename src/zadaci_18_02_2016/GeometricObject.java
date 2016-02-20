package zadaci_18_02_2016;

	public class GeometricObject implements Comparable<GeometricObject> {
		// default data fields
		private String color = "white";
		private boolean filled;
		private java.util.Date dateCreated;
	
		// default geometric object
		public GeometricObject() {
			dateCreated = new java.util.Date();
		}
		public GeometricObject(double radius) {

		}
		public GeometricObject(String color, boolean filled) {
			dateCreated = new java.util.Date();
			this.color = color;
			this.filled = filled;
		}

		// Returns color
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		// returns boolean value
		public boolean isFilled() {
			return filled;
		}

		// sets if its filled
		public void setFilled(boolean filled) {
			this.filled = filled;
		}

		// date
		public java.util.Date getDateCreated() {
			return dateCreated;
		}

		public String toString() {
			return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;

		}
		//finds max geo object
		public static GeometricObject max(GeometricObject o, GeometricObject o2) {
			if (o.compareTo(o2) > 0)
				return o;
			else
				return o2;
		}
		@Override
		public int compareTo(GeometricObject o) {
			return 0;
		}
	}


