import java.util.ArrayList;
import java.util.List;


public class borrar {

	public static void main(String[] args) {
		
		//Nuevas APIs para la plataorma JAVA6		
		/*
		String [] datos ={"5 5 5 5 4 5 4 5 5 5 5", 
					"5 3 3 3 3 5 4 4 5 5 3",
					"5 4 5 2 5 3 5 5 5 5 5",
					"3 4 5 3 4 5 4 5 5 4 4",
					"5 5 5 5 4 5 5 5 5 5 5",
					"5 5 4 5 5 5 5 5 5 5 5",
					"5 4 3 5 2 5 5 5 5 5 4",
					"5 5 3 4 3 5 5 4 5 4 4",
					"5 3 3 3 3 5 5 5 5 3 3",
					"5 5 5 5 5 5 5 5 5 4 4",
					"5 4 4 4 4 5 4 5 5 3 3",
					"5 5 5 5 5 5 5 5 5 4 5",
					"5 5 5 5 5 5 5 5 5 5 5",
					"5 5 4 5 5 5 5 5 5 5 5",
					"5 5 3 4 4 5 5 4 5 5 5",
					"5 5 5 5 4 5 5 5 5 4 4",
					"5 5 5 5 5 5 5 5 5 5 4",
					"4 4 5 5 5 5 5 5 5 5 4",
					"5 3 4 5 5 5 5 5 5 5 5",
					"5 5 5 5 5 5 5 5 5 4 5"};		
		*/
		
		String datos [] = {
				"4 5 4 4 4 5 4 5 5 3 5",
				"2 4 4 2 4 3 2 4 3 2 2",
				"3 5 4 4 4 5 4 4 4 4 3",
				"4 5 4 4 4 5 4 4 5 4 4",
				"4 5 4 4 4 5 4 5 5 4 3",
				"3 5 4 3 5 5 3 5 4 4 2",
				"4 5 4 4 4 4 3 4 4 3 4",
				"3 4 4 3 5 3 3 4 4 2 3",
				"2 5 4 3 4 4 3 4 4 2 3",
				"3 5 4 4 4 4 4 4 4 3 4",
				"3 5 4 4 4 5 3 4 4 3 2",
				"3 5 4 4 4 5 4 4 4 4 4",
				"5 5 5 4 4 5 4 5 5 5 5",
				"5 5 4 3 4 5 3 5 5 5 4",
				"4 5 4 2 5 5 3 4 4 3 4",
				"3 5 4 4 4 5 4 5 5 4 3",
				"3 5 4 3 4 4 4 4 5 4 3",
				"4 5 4 4 4 5 4 5 4 4 4",
				"4 5 4 4 4 2 2 5 4 4 4",
				"3 5 4 4 4 4 3 5 5 3 5"
			};
		
		List<Double> medias = new ArrayList<Double>();
		for(String dato: datos){
			double suma = 0;
			String [] puntuaciones = dato.split(" ");
			for(String puntuacionStr: puntuaciones){
				int puntuacion = Integer.parseInt(puntuacionStr);
				suma = suma + puntuacion;
			}
			medias.add(suma / puntuaciones.length);
		}
		
		double mediaTotal = 0;
		for(double media: medias){
			System.out.println(media);
			mediaTotal = mediaTotal + media;
		}
		System.out.println("================================================");
		System.out.println(mediaTotal/20);
		
		
		
	}
	
}




















