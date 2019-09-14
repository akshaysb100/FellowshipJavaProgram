package com.bridgelabz.datastructureprograms;


	class Gen<T> {

	    T tarray[];

	    Gen(T arr[]) {
	        tarray = arr;
	    }

	    T getSpecifiedItem(int i) {
	        return tarray[i];
	    }
	}

	public class Hash {

	    public static void main(String[] args) {

	        Gen<Integer> gen1 = new Gen<Integer>(new Integer[]{10, 20, 30, 40, 50});
	        System.out.println("Integer : " + gen1.getSpecifiedItem(3));

	        Gen<String> gen2 = new Gen<String>(new String[]{"AB", "CD", "EF", "GH"});
	        System.out.println("String  : " + gen2.getSpecifiedItem(3));

	        Gen<?> gen3[] = new Gen<?>[5];

	        gen3[0] = new Gen<Integer>(new Integer[]{10, 20, 30, 40, 50});

	        gen3[1] = new Gen<Float>(new Float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f});
	    }
	

}
