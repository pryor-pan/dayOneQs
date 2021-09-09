import java.util.HashMap;
import java.util.Map;

/**
 * @Name: test
 * @Description:
 * @Author: panlai
 * @Date: 2021/8/16 18:08
 */

public class test {
    //思路，要求出现次数最多的单词，提到次数，首先想到HushMap，遍历整个字符串，
    // 将字符串裁剪成一个个的单词，存入HushMap中，对应的key值就是单词，value值就是出现的次数
    //遍历map，找出出现次数最多的单词
    public void frequentWord(String text){
        //在计算前进行判断，如果传进来文本为空或者长度为0，则直接返回
        if (text == null || text.length() == 0){
            return;
        }
        Map<String,Integer> map = new HashMap<>();
        StringBuffer word = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)){
                word.append(ch);
            }
            else {
                //将截取到的单词赋值为真正的单词，存入map
                String realWord = word.toString();
                if (!realWord.equals("")){
                    System.out.println(realWord);
                    map.put(realWord,map.getOrDefault(realWord,0)+1);
                }
                word = new StringBuffer();
            }
        }
        String freqWord = null;
        int ans = 0;
        //遍历map获取到key和出现次数最多的单词
        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            if (entry.getValue()>ans){
                ans = entry.getValue();
                freqWord = entry.getKey();
            }
        }
        System.out.println("出现次数最多的单词是：" + freqWord + ",共出现了：" + ans +"次！" );
    }


    public static void main1(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        String str = sb.toString();
        System.out.println(sb.equals("hello"));
    }

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = str1;

        StringBuffer sb = new StringBuffer("hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(sb));
        System.out.println(sb.equals(str1));

    }
}
