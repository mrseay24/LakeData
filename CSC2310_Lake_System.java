public class CSC2310_Lake_System {

	LakeData[] CSC2310Lakes;
	// array with the names of 50 lakes
	private String[] namesOfLakes = { "Lake Alatoona", "Blue Ridge Lake",
			"Carter's Lake", "Chatuge Lake", "Goat Rock Lake",
			"Lake Allatoona", "Lake Arrowhead", "Lake Blackshear",
			"Lake Burton", "Lake Harding", "Lake Hartwell", "Lake Jackson",
			"Lake Lanier", "Lake Nottely", "Lake Oconee", "Lake Oliver",
			"Lake Piedmont", "Lake Rabun", "Lake Seminole", "Lake Sinclair",
			"Lake Spivey", "Lake Spivey", "Lake Strom Thurmond", "Lake Tugalo",
			"Tallulah Falls Lake", "Walter F. George Lake",
			"Walter F. George Lake", "Lake Alice", "Lake Apopka",
			"Lake Apopka", "Lake Crescent", "Lake George", "Lake Harney",
			"Lake Harris", "Lake Istokpoga", "Lake Kissimmee", "Lake Lelia",
			"Lake Okeechobee", "Lake Poinsett", "Lake Rousseau",
			"Lake Seminole", "Lake Tarpon", "Lake Tohopekaliga",
			"Lake Washington", "Lake Winder", "Sawgrass Lake", "Lake Hayward",
			"Lake Lillinonah", "Mashapaug Lake", "Pinewood Lake" };

	// array with the volumes of 50 lakes
	private double[] volumesOfLakes = { 150.0, 100.0, 250.0, 98.0, 500.0,
			100.0, 150.0, 130.0, 230.0, 112.0, 220.0, 110.0, 650.0, 120.0,
			450.0, 333.0, 350.0, 440.0, 150.0, 60.0, 70.0, 99.0, 29.0, 82.0,
			91.0, 82.0, 51.0, 93.0, 28.0, 100.0, 50.0, 88.0, 224.0, 225.0,
			223.0, 154.0, 150.0, 118.0, 113.0, 115.0, 244.0, 231.0, 85.0, 24.0,
			82.0, 75.0, 123.0, 321.0, 84.0, 100.0 };

	// array with the depth of 50 lakes
	private int[] depthOfLakes = { 150, 101, 50, 100, 50, 100, 50, 100, 50,
			100, 50, 100, 50, 100, 250, 100, 50, 100, 50, 100, 50, 100, 50,
			100, 50, 100, 50, 100, 50, 100, 50, 100, 50, 100, 50, 100, 50, 100,
			50, 100, 50, 100, 50, 100, 50, 100, 50, 100, 50, 100 };

	// constructor that reads the array data and creates LakeData array
	public CSC2310_Lake_System() {
		CSC2310Lakes = new LakeData[50];
		for (int i = 0; i < 50; i++) {
			CSC2310Lakes[i] = new LakeData(namesOfLakes[i], volumesOfLakes[i],
					depthOfLakes[i]);
		}
	}

	public void printLakes_depthGreaterThan(int depth) {
		for (int i = 0; i < 50; i++) {
			if (CSC2310Lakes[i].depth > depth) {
				System.out.println(CSC2310Lakes[i].name);
			}
		}
	}

	public void printVolumeForAllLakes() {
		double totalVolume = 0;
		
		for (int i = 0; i < 50; i++) {
		totalVolume = totalVolume + volumesOfLakes[i];
			}
	
			System.out.println("Printing volumes for all lakes: " +totalVolume);

			}
			
		
	

	public void printVolumeAndDepthforLake(String lakeName) {
		for (int i = 0; i < 50; i++) {
			if (lakeName.equals(CSC2310Lakes[i].name)) {
				System.out.println("Lake Lanier volume and depth: "
						+ CSC2310Lakes[i].volume+ "," + CSC2310Lakes[i].depth);

			}
			
		}
		
	}

	

	public void printLakewithLargestVolume() {
		double largestvolume = volumesOfLakes[0];
		int index = 0;
		for (int i = 1; i < 50; i++) {
				if (largestvolume < volumesOfLakes[i]) {
					largestvolume = volumesOfLakes[i];
					index = i;
			}
			 System.out.println(volumesOfLakes[index]);
	            }
	        }
	}
	

