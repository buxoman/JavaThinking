import java.util.Arrays;
import java.util.Random;

// ��֤�ܷ����趨��γ�����鳤�ȣ����趨��ά�����鳤��

public class RaggedArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		
		int[][][] a = new int[][][3]; // �����ԣ��﷨����
		
		a[0][3] = {1,2,3};
		
		a[0][0][3] = {{1,2,3}};
		
		System.out.println(Arrays.deepToString(a));
	}

}

