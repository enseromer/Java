package method;

public class Methwarm {
	public static void main(String[] args) {
		
		int [] num = new int [] {1, 2, 34, 5, 6};
		int sum = getSum(num);
		System.out.println("Total: " + sum);
		
		String [] peers = new String [] {"Ensar", "Mavlida", "Tahir", "Nurila", "Manzira", "Panisara"};
		
		
		//direct input & output w/o storage
		//System.out.println(getSum(new int [] {1, 3, 4, 5, 1, 1, }));
		
		
		int max = getMax(num);
		System.out.println("Max: "+max);
		
		String lineUp = addAll(peers);
		System.out.println("Concatenation: "+lineUp);
		
		
		String sentence = "Komron Khudoyorov";
		System.out.println(mutate(sentence));
		
	}
	
	public static int getSum(int [] num ) {
		//total
		
		int sum =0;
        for(int i=0; i<num.length; i++) {
            
            sum= sum + num[i];
            
        }
        return sum;
		
		
	}
		
public static int getMax(int [] num ) {
		//biggest
	
	int max=num[0];
    for(int i=1; i<num.length; i++) {
    
        if(max<num[i]) {
            max= num[i];
        }
        
    }
    return max;
}
public static String addAll(String[] peers ) {
	//concat
	 String con = " ";
     for(int i=0; i<peers.length; i++) {
         
         con= con + peers[i]+ ", ";
         
     }
     return con;
	
}

public static String mutate(String sentence ) {
	String fchar = sentence.substring(0,1);
	String [] allWords = sentence.split(" ");
	String lword = allWords[allWords.length-1];
	String targetC = fchar+lword.substring(1);
	
	return targetC;
	
}
}
