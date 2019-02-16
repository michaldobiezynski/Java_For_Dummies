import java.util.Arrays;

class CopyDemo
{
	public static void main(String args[])
	{
		// int arrayOriginal[] = {42,55,21};
		// int arrayNew[] = Arrays.copyOf(arrayOriginal, 3);


int arrayOriginal[] = {42, 55, 21, 16, 100, 88};
int arrayNew[] = Arrays.copyOfRange(arrayOriginal, 2, 5);
Arrays.sort(arrayNew);

		printIntArray(arrayNew);
	}

	static void printIntArray(int arrayNew[])
	{
		for (int i : arrayNew)
		{
			System.out.print(i);
			System.out.print(' ');
		}
		System.out.println();
	}
}