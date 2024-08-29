package test.pre1;

public class test2 {

	public static void main(String[] args) {
		int [][]intArray=new int[4][4];
		for(int i =0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++){
				int rand=(int)(Math.random()*10+1);//랜덤 값 1~10(괄호 안치면 1로만 뜸)
				intArray[i][j]=rand;
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
