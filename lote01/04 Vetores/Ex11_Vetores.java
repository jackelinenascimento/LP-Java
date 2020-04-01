package Vetores;

public class Ex11_Vetores {

	public static void main(String[] args) {

		int matriz[][] = new int [8][8];
			
		for(int i= 0; i < 8; i++){
			for(int j= 0; j < 8; j++){

				if(x = 0 | x = 7 | y = 1 | y = 7){
					matriz[x][y] = 1;
				} else {
					if(x = 1 | x = 6 | y = 1 | y = 6){
						matriz[x][y] = 2;
					} else {
						if(x = 2 | x = 5 | y = 2 | y = 5){
							matriz[x][y] = 3;
						} else {
							matriz[x][y] = 4;
						}
					}
				}
			}
		}
	}
}

