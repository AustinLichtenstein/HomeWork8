import java.util.Arrays;

public class sortOnChapterCount {
	
public static void main(String[] args) {
}
{
int[] ChapterCount = {50,27,40,36};
System.out.println(Arrays.toString(ChapterCount));
bubbleSort(ChapterCount);
System.out.println(Arrays.toString(ChapterCount));
}

	static void bubbleSort(int[] ChapterCount)
{
int numSwaps, temp;
do
{
	numSwaps = 0;
	for(int i = 0; 1 < ChapterCount.length-1; i ++)
	{
		if(ChapterCount [i] > ChapterCount[i+1])
{
	temp = ChapterCount [i];
	ChapterCount[i] = ChapterCount[i+1];
	ChapterCount[i+1] = temp;
	numSwaps++;
}
	}
}
	while(numSwaps > 0);		
}
	}