package baekjoon.step05;

// ���� �ѹ�
// �Լ� d�� �����Ͽ� ������ �ذ��� ���ô�.


public class Function_4673 {
	public static void main(String[] args) {
		
		a: for(long i=1;i<=10000;i++) {
			for(long j=1;j<=10000;j++) {
				if(i==d(j)) {
					continue a;
				}
			}
			System.out.println(i);
		}
		
	}
	
	static long d(long n) {
		
		String str = Long.toString(n);
		char[] ch = str.toCharArray();
		long dn=n;
		
		for(int i=0;i<ch.length;i++) {
			dn+=Character.getNumericValue(ch[i]);
		}
		
		return dn;
	}
}
