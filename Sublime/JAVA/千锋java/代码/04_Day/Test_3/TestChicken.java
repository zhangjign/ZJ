public class TestChicken{
	public static void main(String[] args){
		
		//定义变量i代表公鸡的数量
		for(int i = 0 ; i <= 33 ; i++){ // i = 0
			/*
			0只公鸡 与 若干母鸡 + 小鸡 匹配
			1只公鸡 与 若干母鸡 + 小鸡 匹配
			2只公鸡 与 若干母鸡 + 小鸡 匹配
			.......
			
			33只公鸡 与 若干母鸡 + 小鸡 匹配
			*/
			
			
			for(int j = 0 ; j <= 50 ; j++){ // j = 0
				/*
				0只母鸡 + 99只小鸡
				1只母鸡 + 98只小鸡
				2只母鸡 + 97只小鸡
				......
				
				40只母鸡 + 60只小鸡  符合 百钱买百鸡的要求  打印这个结果
				41只母鸡 + 59只小鸡
				42只母鸡 + 58只小鸡
				
				.....
				50只母鸡 + 50只小鸡  
				*/
				
				int k = 100 - i - j;
				
				if(k % 3 != 0){
					continue;
				}
				
				if(i * 3 + j * 2 + k / 3 * 1 == 100){//钱
					System.out.println("公鸡：" + i + "，母鸡：" + j +"，小鸡：" + k);
				}
				
				
			}
			
		}
		
		
		
	}
}