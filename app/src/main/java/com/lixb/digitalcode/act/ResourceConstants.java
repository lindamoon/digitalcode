package com.lixb.digitalcode.act;

import com.lixb.digitalcode.R;

/**
 * Created by Administrator on 2018/2/22.
 */

public final class ResourceConstants {
    public static final int[] digit_imgs = {


    };

    private static String[] digits = {};
    private static String[] descs = {};
    private static final  String digitstr = "00,01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,1,2,3,4,5,6,7,8,9,0";

    private  static final String descstr = "望远镜,人妖,铃儿,灵山,零食,灵狐,导游(领路),林青霞,篱笆,菱角,棒球,筷子,椅儿,医生,钥匙,鹦鹉,石榴,仪器,成人,药酒,香烟,鳄鱼,双胞胎,和尚,耳屎,二胡,二流子,耳机,恶霸,恶狗,三菱汽车,山药,扇儿,蝴蝶(扇扇翅膀),炒三丝,珊瑚,孙武(三十六计),田七,妇女,感冒灵,司令,司仪,柿儿,石山,石狮,师傅,饲料,司机,丝帕,水饺,奥运五环,武大郎,武松,乌纱帽,巫师,火车,蜗牛,武器,王八,五角星,六小龄童,儿童,驴儿,流沙,牛屎,路虎,溜溜球,绿漆,喇叭,太极,麒麟,奇异果,企鹅,花旗参,骑士,舞女(起舞),汽油,牛郎织女,奇葩,气球,白领,白蚁,靶儿,芭蕉扇,巴士,白虎,八路,项羽(霸气),马云(阿里巴巴),芭蕉,精灵,球衣,球儿,旧伞,教师,皇帝,酒楼,酒席,酒吧,坦克,铅笔,鸭子,耳朵,红旗,秤钩,哨子,镰刀,葫芦,球拍,鸡蛋";

    public synchronized static String[] getDigits() {
        if (digits.length < 1) {
            digits = digitstr.split(",");
        }
        return digits;
    }

    public synchronized static String[] getDescs() {
        if (descs.length < 1) {
            descs = descstr.split(",");
        }
        return descs;
    }

    public  static int[] imgs = {
            R.mipmap.d00,
            R.mipmap.d01,
            R.mipmap.d02,
            R.mipmap.d03,
            R.mipmap.d04,
            R.mipmap.d05,
            R.mipmap.d06,
            R.mipmap.d07,
            R.mipmap.d08,
            R.mipmap.d09,
            R.mipmap.d10,
            R.mipmap.d11,
            R.mipmap.d12,
            R.mipmap.d13,
            R.mipmap.d14,
            R.mipmap.d15,
            R.mipmap.d16,
            R.mipmap.d17,
            R.mipmap.d18,
            R.mipmap.d19,
            R.mipmap.d20,
            R.mipmap.d21,
            R.mipmap.d22,
            R.mipmap.d23,
            R.mipmap.d24,
            R.mipmap.d25,
            R.mipmap.d26,
            R.mipmap.d27,
            R.mipmap.d28,
            R.mipmap.d29,
            R.mipmap.d30,
            R.mipmap.d31,
            R.mipmap.d32,
            R.mipmap.d33,
            R.mipmap.d34,
            R.mipmap.d35,
            R.mipmap.d36,
            R.mipmap.d37,
            R.mipmap.d38,
            R.mipmap.d39,
            R.mipmap.d40,
            R.mipmap.d41,
            R.mipmap.d42,
            R.mipmap.d43,
            R.mipmap.d44,
            R.mipmap.d45,
            R.mipmap.d46,
            R.mipmap.d47,
            R.mipmap.d48,
            R.mipmap.d49,
            R.mipmap.d50,
            R.mipmap.d51,
            R.mipmap.d52,
            R.mipmap.d53,
            R.mipmap.d54,
            R.mipmap.d55,
            R.mipmap.d56,
            R.mipmap.d57,
            R.mipmap.d58,
            R.mipmap.d59,
            R.mipmap.d60,
            R.mipmap.d61,
            R.mipmap.d62,
            R.mipmap.d63,
            R.mipmap.d64,
            R.mipmap.d65,
            R.mipmap.d66,
            R.mipmap.d67,
            R.mipmap.d68,
            R.mipmap.d69,
            R.mipmap.d70,
            R.mipmap.d71,
            R.mipmap.d72,
            R.mipmap.d73,
            R.mipmap.d74,
            R.mipmap.d75,
            R.mipmap.d76,
            R.mipmap.d77,
            R.mipmap.d78,
            R.mipmap.d79,
            R.mipmap.d80,
            R.mipmap.d81,
            R.mipmap.d82,
            R.mipmap.d83,
            R.mipmap.d84,
            R.mipmap.d85,
            R.mipmap.d86,
            R.mipmap.d87,
            R.mipmap.d88,
            R.mipmap.d89,
            R.mipmap.d90,
            R.mipmap.d91,
            R.mipmap.d92,
            R.mipmap.d93,
            R.mipmap.d94,
            R.mipmap.d95,
            R.mipmap.d96,
            R.mipmap.d97,
            R.mipmap.d98,
            R.mipmap.d99,
            R.mipmap.d1,
            R.mipmap.d2,
            R.mipmap.d3,
            R.mipmap.d4,
            R.mipmap.d5,
            R.mipmap.d6,
            R.mipmap.d7,
            R.mipmap.d8,
            R.mipmap.d9,
            R.mipmap.d0
    };



//    public static void main(String[] args) {
//
//        String str = "00,01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,1,2,3,4,5,6,7,8,9,0";
//        String[] result = getFormatArray(str);
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i]+",");
//        }
//
//    }
//
//    public static String[] getFormatArray(String str) {
//        String[] results = {};
//        String[] strs = str.split(",");
//        for (int i = 0; i < strs.length; i++) {
//            results[i] = "\"".concat(strs[i]).concat("\"");
//        }
//
//        return results;
//    }
}
