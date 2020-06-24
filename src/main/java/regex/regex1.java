package regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author heting
 * @version  1.0
 */
public class regex1 {

    public static void main(String[] args) {

        String string = "银行充值日报(20181116):本地充值成功笔数：3948 本地充值成功总金额:98115 银行充值成功笔数：3957 银行充值成功总金额：98118.81”  按顺序提取其中的数值（包括整数和小数）";
        String regex = "[0-9]{1,}\\.[0-9]{1,}|[0-9]{1,}";
        String s = findnum(string,regex);
        String[] arr = s.split(" ");
        Double[] arr2 = strArrayToIntArray(arr);
        Arrays.sort(arr2);
        for (Double i : arr2){
            System.out.println(i);
        }

    }


    public static String   findnum(String string,String regex){

        Pattern pattern =Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        String string1 = "";

        while (matcher.find()){

            String string2=matcher.group();
            //string1 =string1.concat(string1,"|")
            string1 += string2+" ";


            //System.out.println(string1);

        }
        return string1;
        //

    }
    public static Double[] strArrayToIntArray(String[] a){
        Double[] b = new Double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Double.parseDouble(a[i]);
        }

        return b;
    }

}
