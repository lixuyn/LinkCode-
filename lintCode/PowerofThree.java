package lintCode;
//¡¡logx(y) = loge(x) / loge(y)£¬»»µ×¹«Ê½
public class PowerofThree {
	public static void main(String[] args) {
		double t =  Math.log(243)/Math.log(3);
		System.out.println(Math.round(t));
		System.out.println(Math.pow(3, t) == 243);
	}

}
