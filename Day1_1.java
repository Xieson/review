package Day_1;

import java.util.Arrays;

public class Day1_1{
	public static void main(String[] args) {
//		System.out.println("1+++"+"+holle"+7+8);
//		System.out.println("2+++"+8+"+holle"+7);
//		System.out.println(7+8+"+holle");
//		String srt=7+"nihao";
//		System.out.println(srt);
//		byte number=1;
//		short number2=number;
//		long number3=number2;
//		int number4=(int) number3;
//		System.out.println(number4);
//		boolean flag = false;
//		System.out.println(flag);
//		double num=12+3.14+99L+9F;
//		System.out.println(num);
//		System.out.println('a'+1);
//		System.out.println(12%5);//ȡ��
		//��Ԫ�����
//		double nu=3.14;
//		int nu2=(int)(nu-1);
//		System.out.println(nu2);
//		int nu3=nu2>=.5?nu2+1:nu2;
//		System.out.println(nu3);
		//����int���͵����ݽ���
//		int a=1;
//		int b=2;
//		int c;
//		c=a;
//		a=b;
//		b=c;
//		System.out.println(a);
//		System.out.println(b);
		//switch
//		String srt="��ɺ";
//		switch(srt) {
//			case "����":System.out.println("����");break;
//			case "��ɺ":System.out.println("��ɺ");break;
//			default:System.out.println("û������˵�����");
//
//			
//		}
		//whileѭ��
//		int num=1;
//		do {
//			System.out.println("num"+num);
//			num++;
//		}while(num<=20);
//		
		//forѭ��
//		
//		int j=9;
//		int nub=0;
//		for(int i=1;i<=j;i++) {
//			for(int o=1;o<=i;o++) {
//				nub=i*o;
//				System.out.print(i+"*"+o+"="+nub+"\t");
//			}
//			System.out.println();
//		}
		int[] arr= {1,2,90,6};
//		for(int array:arr) {
//			System.out.println(array);
//		}
//		System.out.println(arr[1]);
//		int max=Day1.MAXarr(arr);
//		System.out.println("������������ֵΪ"+max);
		
//		int a=5;
//		while(a<90){
//			if(a==7) {
//				System.out.println(a);
//				break;
//			}
//			System.out.println(a);
//			a++;
//		}
	}
	static int MAXarr(int[] arr) {
		int max=arr[0];
		int i=0;
		while(i<=arr.length-1) {
			if(max<=arr[i]) {
				max=arr[i];
			}
			i++;
		}
		return max;
	}

}
