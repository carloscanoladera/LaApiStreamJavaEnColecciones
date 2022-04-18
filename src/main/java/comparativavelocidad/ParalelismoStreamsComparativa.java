package comparativavelocidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ParalelismoStreamsComparativa {
	
	
	private static List<Integer> buildIntRange() {
	    List<Integer> numbers = new ArrayList<>(5);
	    for (int i = 0; i < 6000 ;i++)
	      numbers.add(i);
	    return Collections.unmodifiableList(numbers);
	  }
	
	public static void main(String[] args) {
	    List<Integer> source = buildIntRange();

	     
	    long start = System.currentTimeMillis();
	    for (int i = 0; i < source.size(); i++) {
	      try {
	        TimeUnit.MILLISECONDS.sleep(1);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }
	    System.out.println("Modo tradicional: " + (System.currentTimeMillis() - start) + "ms");

	       
	    start = System.currentTimeMillis();
	    source.stream().forEach(r -> {
	      try {
	        TimeUnit.MILLISECONDS.sleep(1);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	    });
	    System.out.println("stream Con procesado secuencial: " + (System.currentTimeMillis() - start) + "ms");

	       
	    start = System.currentTimeMillis();
	    source.parallelStream().forEach(r -> {
	      try {
	        TimeUnit.MILLISECONDS.sleep(1);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	    });
	    System.out.println("parallelStream :, Con procesado paralelo " + (System.currentTimeMillis() - start) + "ms");

	  }

}
