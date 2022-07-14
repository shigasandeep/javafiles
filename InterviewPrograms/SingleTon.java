/*Q2 : Write code to make a class to singleton*/

class SingleTon {
	private static Singleton singleTon;

	private SingleTon(){

	}
	public static SingleTon getInstance() {
	 if (singleTon instaceOf SingleTon) {
	   return singleTon;
	 } else {
	  return new SingleTon();
	 }
	}
}