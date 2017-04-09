import java.util.Arrays;
import java.util.Random;

// 验证能否先设定低纬度数组长度，再设定高维度数组长度

public class RaggedArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		
		int[][][] a = new int[][][3]; // 不可以！语法错误！
		
		a[0][3] = {1,2,3};
		
		a[0][0][3] = {{1,2,3}};
		
		System.out.println(Arrays.deepToString(a));
	}

}

