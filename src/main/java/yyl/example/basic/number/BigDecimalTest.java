package yyl.example.basic.number;

import java.math.BigDecimal;

/**
 * 使用BigDecimal需要注意注，BigDecimal的计算的方法不会改变原始BigDecimal对象，而是返回一个新的BigDecimal对象<br>
 */
public class BigDecimalTest {

	public static void main(String[] args) {
		BigDecimal original = new BigDecimal("12345.61890");

		//转换数值为指定位数
		BigDecimal value1 = original.setScale(2, BigDecimal.ROUND_HALF_UP);
		BigDecimal value2 = original.setScale(3, BigDecimal.ROUND_HALF_UP);

		System.out.println(value1);
		System.out.println(value2);
	}
}
