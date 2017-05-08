class Testa{
	static boolean foo(char ch){
		System.out.println(ch);
		return true;
	}
	public static void main(String[] args){
		int i=0;
		for(foo('A'); foo('B')&& (i<2);foo('C') ) {
			i++;
			foo('D');
		}
		
	}
}