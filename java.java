
/*
 * 校验身份证号，必须包含18位字符，前17位为数字，最后一位为数字或字母X
 * 校验QQ号，必须是5~15位数字，0不能开头
 * 
 * 
 * 
 */

import java.util.Scanner;

public class checkQQ {
	private static Scanner scan;
	public static void main(String[] args) {
        String regex = "[0-9]{17}[0-9X]";// 验证身份证号
        String regex2 = "\\d{17}[0-9X]";// 单反斜杠\表示转义
        System.out.println("enter your ID number");
        String input = new Scanner(System.in).nextLine();
        if (input.matches(regex)) {
            System.out.println("valid number");
        } else {
            System.out.println("invalid number");
        }
		System.out.println("enter your qq number");// 验证QQ号
		withoutRegex();
		System.out.println("enter your qq number");
		withRegex();

	}
	
	private static void withoutRegex() {// 还有bug，不能识别出现非法字符的情况
		scan = new Scanner(System.in);
		String qq = scan.next();// next()遇到空格截止，nextLine()遇到换行符截止
		if (qq.startsWith("0") != true) {// str.startWith只能跟int和str类型，所以这里不能填'0'
			if (qq.length() >= 5 && qq.length() <= 15) {
				System.out.println("valid number");
			} else {
				System.out.println("invalid number");
			}
		} else {
			System.out.println("invalid number");
		}
		int len = qq.length();
		if (len >= 5 && len <= 15) {
			if (!qq.startsWith("0")) {
				try {
					long l = Long.parseLong(qq);
					System.out.println("qq:" + l);
				} catch (NumberFormatException e) {
					System.out.println("wrong char");
				}
			} else
				System.out.println("cannot start with 0");
		} else
			System.out.println("length error");

	}

	private static void withRegex() {
		scan = new Scanner(System.in);
		String qq = scan.next();
		String reg = "[1-9][0-9]{4,14}";// [1~9][0~9]{5~14}
		System.out.println(qq.matches(reg) ? "valid number" : "invalid number");

	}

}

/*
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子。
 * 假如兔子都不死，问每个月的兔子总数为多少？
 * 
 *
 * 
 */
 
import java.util.Scanner;

public class Rabbit {
	private static Scanner scan;

	public static void main(String[] args) {
		// 我是真没留意到后面的兔子总数都等于前面两个月的兔子总数之和这个规律，
		// 我想的可能还要更复杂些，即每对满3个月的兔子都陆续乘2，然后挨个相加
		// 1 	2 		3		 4 			5 			 6						7
		// 2 	2 		4 		 6 			10			 16						26
		// 2 	2	  2+2.1    4+2.1 	 6+2.1+2.2  10+2.1+2.2+2.3	  16+2.1+2.2+2.3+2.4+2.2.2
		for (;;) {
			scan = new Scanner(System.in);
			System.out.println("你要计算第几月的兔子总数？");
			int xx = new Scanner(System.in).nextInt(); //原来还有这种写法
			if (xx > 0) {
				System.out.println("第" + xx + "月的兔子总数为" + Multiply(xx) + "只");
			} else {
				System.out.println("运算结束…");
				break;
			}
		}

	}

	public static int Multiply(int month) {
		int res = 2;// 也可将res初始值设为1，成对计算
		if (month == 1 || month == 2) {
			return res;
		}
		res = Multiply(month - 1) + Multiply(month - 2);// 因为上面用了return，这部分代码可以不加else
		return res;
	}

}

/* 
 * 直角三角形
 * 乘法口诀表
 * 
 * 
 * 
 */
 
 public class TestForDemo2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {// 左直角三角形
			for (int j = 1; j <= i; j++) {
				System.out.print("*");// 打印*我老是忘记写双引号""
			}
			System.out.println();// 注意这一行要放在两个for循环之间
		}
		System.out.println();		
		for (int i = 1; i <= 10; i++) {// 右直角三角形
			for (int k = 9; k >= i; k--) {// 从左直角三角形到右直角三角形，要注意打印的空格和*是并列关系
				System.out.print(" ");// 注意这里不能打印line new
			}
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {// 左倒直角三角形
			for (int j = 10; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {// 右倒直角三角形
			for (int k = 1; k <= i; k++){
				System.out.print(" ");
			}
			for (int j = 10; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {// 乘法口诀表
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "x" + i + "=" + i * j + "\t");// 将" "改为"\t"可以让每列数据对其
			}
			System.out.println();
		}
		System.out.println();
	}

}

/**
 * Project 10career
 * module javaee
 * package yale.util
 * 
 * 
 */

package yale.util;
package yale.util;
package yale.util;
package yale.util;
package yale.util;
package yale.util;
package yale.util;
package yale.util;
package yale.util;
package yale.util;

import java.util.Scanner;

public class CaseShift {
    static String input;

    public static void main(String[] args) {
        System.out.println("enter your string");
        input = new Scanner(System.in).nextLine();
        while (true) {
            System.out.println(input.toLowerCase());
            System.out.println(input.toUpperCase());
            input = new Scanner(System.in).nextLine();
            if (input.equals("")) {
                break;
            }
        }
    }
}


/**
 * Project 10career
 * module javaee
 * package yale.quiz
 * 
 * 
 */

package yale.quiz;
package yale.quiz;
package yale.quiz;
package yale.quiz;
package yale.quiz;
package yale.quiz;
package yale.quiz;
package yale.quiz;


package yale.quiz;

class Solution {// 寻找比目标字母大的最小字母
    public char nextGreatestLetter744(char[] letters, char target) {
        char nextGreater = letters[0];// 如果栈溢出了，那指针就回到原点，原本最小的值就变成了比目标字母大的最小字母
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {// 如果栈没有溢出，那只管从数组中取到那个比目标字母大的最小字母
                nextGreater = letters[i];
                break;
            }
        }
        return nextGreater;
    }
}

package yale.quiz;

public class LongestCommonPrefix14 {// 最长公共前缀/最大公共前缀
    public static String longestCommonPrefix(String[] strs) {// 执行耗时:0 ms,击败了100.00% 的Java用户/内存消耗:36.4 MB,击败了78.20% 的Java用户
        String s = strs[0];// 先随便选一个
        for (String string : strs) {
            while (!string.startsWith(s)) {
                s = s.substring(0, s.length() - 1);// 公共前缀不匹配就让它变短
            }
        }
        return s;
    }
}

package yale.quiz;

import java.util.Scanner;

// 1.四个关键变量，空瓶数num和汽水瓶数sum，num分别对3求商和取模
// 2.空瓶数大于2就持续求商、取模
// 3.空瓶数等于2还能整一瓶
public class HJ22 {// 汽水瓶
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) return;
            int a = num / 3;
            int b = num % 3;
            num = a + b;
            int sum = a;
            while (num > 2) {
                a = num / 3;
                b = num % 3;
                num = a + b;
                sum += a;
            }
            if (num == 2) {
                sum++;
            }
            System.out.println(sum);
        }
    }
}

package yale.quiz;

import java.util.Scanner;

// 1.从2依次取模，结果为零说明当前因数为目标数的质因子
// 2.除以当前质因子
// 3.跳出for循环的条件i * i <= 目标数
public class HJ6 {// 质数因子// 输入一个正整数，按照从小到大的顺序输出它的所有质因子。
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long lon = sc.nextLong();
        for (int i = 2; i * i <= lon; i++) {
            while (lon % i == 0) {
                System.out.print(i + " ");
                lon /= i;
            }
        }
        if (lon != 1) System.out.println(lon);
    }
}

package yale.quiz;

import java.util.Scanner;

public class HJ40 {// 统计字符
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' & ch <= 'z' || ch >= 'A' & ch <= 'Z') a++;
                else if (ch == ' ') b++;
                else if (ch >= '0' & ch <= '9') c++;
                else d++;
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }
}

package yale.quiz;
import java.util.Scanner;

public class HJ4 {// 字符串分隔
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            StringBuilder sb = new StringBuilder(str);
            if (sb.length() > 8) {
                while (sb.length() > 8) {
                    System.out.println(new String(sb.substring(0, 8)));
                    sb = new StringBuilder(sb.substring(8, sb.length()));
                }
            }
            int b = sb.length() % 8;
            char[] ch = new char[(8 - b) % 8];
            for (int i = 0; i < ch.length; i++) {
                ch[i] = '0';
            }
            sb.append(new String(ch));
            System.out.println(new String(sb));
        }
    }
}

package yale.quiz;

class Solution {// 删除有序数组中的重复项
    public int removeDuplicates26(int[] nums) {// 执行耗时:0 ms,击败了100.00% 的Java用户/内存消耗:42.8 MB,击败了5.31% 的Java用户
        int x = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[x] != nums[i]) {
                nums[++x] = nums[i];
            }
        }
        return nums.length == 0 ? 0 : x + 1;
    }

    public int removeDuplicates1(int[] nums) {// 执行耗时:3 ms,击败了7.13% 的Java用户/内存消耗:39.7 MB,击败了73.32% 的Java用户
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(Integer.valueOf(num));
        }
        int i = 0;
        int[] res = new int[set.size()];
        for (Integer it : set) {
            res[i] = it;
            i++;
        }
        Arrays.sort(res);
//        nums = Arrays.copyOf(res,set.size());// 形参nums只是对原数组的一个引用/在方法里操作nums(原数组)对于调用者是可见的
        for (int j = 0; j < set.size(); j++) {
            nums[j] = res[j];// 所以说直接操作原数组的成员跟上面那一行代码简直就是天差地别/这也说明了为什么题干要强调应‘原地’修改原数组
        }
        return set.size();
    }
}

package yale.quiz;

class Solution {
    public boolean isPalindrome9(int x) {// 回文数/这道题用双指针并不简单
        if (x < 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder(Integer.toString(x));
//        if (sb.equals(sb.reverse())) {// StringBuilder没有重写equals
        if (sb.toString().equals(sb.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }
}

package yale.quiz;

class Solution {
    public int[] twoSum1(int[] nums, int target) {// 两数之和
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
//                    return [i, j];// 数组是引用数据类型！
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}

package yale.quiz;

import java.util.Scanner;

public class SortChar {// 计算字符串中含有的汉字、字母、数字的个数
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        String input = new Scanner(System.in).next();
        count(input);
    }

    public static void count(String str) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && ch > 255) {
                a++;
            } else if ((ch > 'a' && ch < 'z') || (ch > 'A' && ch < 'Z')) {
                b++;
            } else if (ch > '0' && ch < '9') {
                c++;
            }
        }
        System.out.println("汉字个数为" + a);
        System.out.println("字母个数为" + b);
        System.out.println("数字个数为" + c);
    }
}

package yale.quiz;

public class ReverseString344 {// 反转字符串
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {// 执行耗时:0 ms,击败了100.00% 的Java用户/内存消耗:45.1 MB,击败了32.96% 的Java用户
        int j = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            while (true) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                j--;
                break;
            }
        }
    }
}

package yale.quiz;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {// 执行耗时:359 ms,击败了5.03% 的Java用户/内存消耗:39.6 MB,击败了55.16% 的Java用户
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    nums[i] = nums[i] ^ nums[j];
                    nums[j] = nums[i] ^ nums[j];
                    nums[i] = nums[i] ^ nums[j];
                }
            }
        }
    }
}

package yale.quiz;

import java.util.Arrays;

public class Construct2DArray2022 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] get = construct2DArray(original, m, n);
        System.out.println(Arrays.toString(get));// [[I@38af3868, [I@77459877]/没想到吧...
        System.out.println(Arrays.deepToString(get));// [[1, 2], [3, 4]]/见识到了!!!
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {// 执行耗时:3 ms,击败了99.92% 的Java用户/内存消耗:48.6 MB,击败了36.67% 的Java用户
        if (m * n != original.length) {
//            return [];// 报错
//            return new int[][];// 报错
            return new int[0][0];
        }
        int[][] res = new int[m][n];
        int x = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                res[m][n] = original[x];// 错都报道这儿了都还没意识到错在哪儿了...
                res[i][j] = original[x];
                x++;
            }
        }
        return res;
    }
}

/*
 * 
 * 
 * 
 * 
 * 
 */ 
 
/*
 * 
 * 
 * 
 * 
 * 
 */ 
 
/*
 * 
 * 
 * 
 * 
 * 
 */ 
 
 
 
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
