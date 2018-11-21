public class Cfunction {
	static {
		System.loadLibrary("cfunction");
		}
	
	public native void clsFunction();
	public native void gotoxy(int x, int y);
}