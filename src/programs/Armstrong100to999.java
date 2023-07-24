package programs;

public class Armstrong100to999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<1000;i++) {
		int q=i;
		int r=0;
		while(q>0)
		{
			int t=q%10;
			r=r+t*t*t;
			q=q/10;
		}
		if(r==i) {
			System.out.println(i);
		}
		}
	}
	}

