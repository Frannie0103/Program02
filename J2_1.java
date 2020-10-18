
public class J2_1 {

	public static void main(String[] args) {
		int num[]={2,5,3,8,9,7,6,1,4,10};    
        int sum = 0;
        System.out.println("全要素の値の合計は：");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
            if (i==9) {
                System.out.print("=");            }
            else if (i<9){
                System.out.print("+");
            }
            sum=sum+num[i];
        }
        System.out.print(sum);
    }
}