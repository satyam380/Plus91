import java.util.*;

public class MaxWeightDiff
{
	public static void main (String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] w = new int[N];

		int split1 = 0;
		int split2 = 0;
		for(int i = 0; i < N; i++)
		{
			w[i] = sc.nextInt();
		}
		Arrays.sort(w);

		for(int i = 0; i <= K; i++)
		{
			split1 += w[i];
		}      
		for(int i = K; i <= N; i++)
		{
			split2 += w[i];
		}
		long h = split2-split1;
		System.out.println(h);
		sc.close();
	}
}
