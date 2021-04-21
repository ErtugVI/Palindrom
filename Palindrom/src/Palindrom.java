
public class Palindrom {

	static boolean isPalindrom(int girilensayi) {
		// TODO Auto-generated method stub
    int tmp, tersSayi = 0, kalan;
    tmp = girilensayi;
    
    while (tmp  != 0) {
    	kalan = tmp %10;
    	tersSayi = tersSayi* 10 + kalan;
    	tmp /= 10;
    	}
    if (girilensayi == tersSayi)
    	return true;
    else
    	return false;
	}
   public static void main(String[] args) {
	   

   System.out.println(isPalindrom(121));
   }  
}