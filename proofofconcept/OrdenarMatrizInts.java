
import java.util.Arrays;
import java.util.stream.Stream;

public class OrdenarMatrizInts {

	int matrix[][] = new int[][]{{0,5,0,0} , {0,0,5,5} , {5,5,5,0}, {5,0,0,0}};

	public static void main(String args[]) {
		OrdenarMatrizInts orden = new OrdenarMatrizInts();
		orden.compactar();
	}
	
	public void compactar() {
		
		for(int[] row: matrix) {
			int lastPos = row.length-1;
			for(int j=0; j< row.length-1;j++) {
				// como demonios es ordenamiento de la burbuja
                if (matrix[i][j] !=0 && matrix[i][lastPos] == 0) {
                    matrix[i][j+1]= matrix[i][j];
                    matrix[i][j]=0;
                }
            }
		}

		/*Arrays.stream(matrix).filter((fila) -> { 
			int[] ceros = Stream.of(Arrays.stream(fila).filter(n->n==0).toArray());       
			int[] numeros = Stream.of(Arrays.stream(fila).filter(n->n>0).toArray());
			int[] resultado = Stream.concat(Strem.of(ceros), Stream.of(numeros)).toArray();
			System.out.println("funciona");
			return true;
		});*/

    }

    public void print(){
    	for(int[] row: matrix) {
    		for(int i: row)
    			System.out.print(i + ",");
    		System.out.println();
    	}
    }
}
