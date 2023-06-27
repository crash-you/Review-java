package StudentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RegistereDemo {
        public static void main(String[] args) {
            ArrayList<Regeist> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("欢迎来到学生管理系统");
                System.out.println("请选择操作\n1登录\n2注册\n3忘记密码\n4退出");
                int n = sc.nextInt();
                switch (n)
                {
                    case 1  -> login(list);
                    case 2  -> RegesitD(list);
                    case 3  -> ForgetPassword(list);
                    case 4 -> {
                        System.out.println("退出");
                        System.exit(0);
                    }
                    default -> System.out.println("没有这个选项");
                }
            }

        }

    private static void ForgetPassword(ArrayList<Regeist> list) {
        System.out.println("请输入您的用户名：");
        Scanner sc =new Scanner(System.in);
        String userName = sc.next();
        boolean flag = checkName(list, userName);
        if(!flag){
            System.out.println("您输入的用户名有误，请修改!");
            return;
        }
        if(flag)
        {
            System.out.println("请分别输入您的身份证号码和手机号码");
            String personalNum = sc.next();
            String Num = sc.next();
            int indexName = getIndexName(list, userName);
            if(indexName >= 0 )
            {
                Regeist regeist = list.get(indexName);
                String personNum = regeist.getPersonNum();
                String num = regeist.getNum();
                if((personNum.equals(personNum)) && (num.equals(Num)))
                {
                    System.out.println("查询成功，请修改您的密码");
                    revisePassword(list,indexName);
                    return;
                }
                else {
                    System.out.println("您输入的身份证号码或手机号码有误，请重新修改");
                    return;
                }
            }
        }
    }

    private static void revisePassword(ArrayList<Regeist> list, int indexName) {
        System.out.println("请输入您的新密码：");
        Scanner sc = new Scanner(System.in);
        String newPassword = sc.next();
        list.get(indexName).setPassord(newPassword);
        System.out.println("修改成功!");
    }

    private static int getIndexName(ArrayList<Regeist> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            Regeist regeist = list.get(i);
            String user = regeist.getUser();
            if (userName.equals(user))
            {
                return i;
            }
        }
        return -1;
    }
    //键盘录入用户名
            //
            //2，键盘录入密码
            //
            //3，键盘录入验证码
            //
            //要求：
            //
            //	用户名如果未注册，直接结束方法，并提示：用户名未注册，请先注册
            //
            //	判断验证码是否正确，如不正确，重新输入
            //
            //	再判断用户名和密码是否正确，有3次机会

    private static void login(ArrayList<Regeist> list) {
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        System.out.println("请输入密码:");
        String passWord = sc.next();
        while (true) {
            System.out.println("请输入验证码：");
            String testNub = getTestNub();
            System.out.println(testNub);
            String test = sc.next();
            if(!test.equals(testNub)){
                System.out.println("验证码输入错误，请重新输入:");
            }
            else break;
        }

        boolean flag = checkName(list, username);
        if(!flag){
            System.out.println("当前用户名未注册");
            return;
        }

        int i = 0;
        while (true) {
            boolean flag2 = checkPassword(list, passWord);
            if(flag2)
            {
                System.out.println("恭喜你，登陆成功!");
                startStudentSystem st = new startStudentSystem();
                st.startStudentSystem();
                break;
            }
            else {
                i++;
                System.out.println("您输入的密码有误，请重新输入：");
                System.out.println("您当前还剩"+(3-i)+"次机会");
            }
        }




    }

    private static boolean checkPassword(ArrayList<Regeist> list, String passWord) {
        for (int i = 0; i < list.size(); i++) {
            Regeist regeist = list.get(i);
            String passord = regeist.getPassord();
            if (passWord.equals(passord))
            {
                return true;
            }
        }
        return false;

    }

    public static boolean checkName (ArrayList<Regeist> list,String username)
    {
        for (int i = 0; i < list.size(); i++) {
            Regeist regeist = list.get(i);
            String user = regeist.getUser();
            if (username.equals(user)){
                return true;
            }
        }
        return false;
    }
        private static String getTestNub () {
            ArrayList<Character> list1 = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                list1.add((char) ('a' + i));
                list1.add((char) ('A' + i));
            }
            Random r = new Random();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                int index = r.nextInt(list1.size());
                char c = list1.get(index);
                sb.append(c);
            }
            int i = r.nextInt(10);
            sb.append(i);
            char[] chars = sb.toString().toCharArray();
            int i1 = r.nextInt(chars.length);
            char temp = chars[i1];
            chars[i1] = chars[chars.length-1];
            chars[chars.length - 1] = temp ;
            return new  String(chars);
        }
    //用户名需要满足以下要求：
                //		验证要求：
                //			用户名唯一
                //			用户名长度必须在3~15位之间
                //			只能是字母加数字的组合，但是不能是纯数字
                //	2，密码键盘输入两次，两次一致才可以进行注册。
                //	3，身份证号码需要验证。
                //		验证要求：
                //			长度为18位
                //			不能以0为开头
                //			前17位，必须都是数字
                //			最为一位可以是数字，也可以是大写X或小写x
                //	4，手机号验证。
                //		验证要求：
                //			长度为11位//
                //			不能以0为开头
                //			必须都是数字
        public static void RegesitD(ArrayList<Regeist> list) {
            Regeist s = new Regeist();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.print("请输入用户名：");
                String user = sc.next();
                boolean flag = RegistereFind(list, user);
                if (flag) {
                    s.setUser(user);
                    break;
                }
            }

            while (true) {
                System.out.println("请输入密码");
                String password1 = sc.next();
                String password2 = sc.next();
                if (!password1.equals(password2)) {
                    System.out.println("请输入两次相同的密码");
                } else {
                    s.setPassord(password1);
                    break;
                }
            }

            while (true) {
                System.out.println("请输入身份证号码");
                String personalPassWord = sc.next();
                boolean flag1 = checkPersonalWord(personalPassWord);
                if (flag1) {
                    s.setPersonNum(personalPassWord);
                    break;
                }
                System.out.println("您输入的身份证信息有误，请重新输入");
            }

            while (true) {
                System.out.println("请输入手机号:");
                String num = sc.next();
                boolean flag2 = checkNum(num);
                if (flag2) {
                    s.setNum(num);
                    break;
                } else System.out.println("您输入的手机号信息有误，请重新输入!");
            }
            System.out.println("注册完成!");

            list.add(s);
            for (int i = 0; i < list.size(); i++) {
                Regeist regeist = list.get(i);
                System.out.println(regeist.getUser() +" " + regeist.getPassord() + " " + regeist.getNum() + " " +regeist.getPersonNum());
            }
        }
    private static boolean checkNum(String num) {
            if(num.length()!= 11) return false;
            int p =0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if(c >= '0' &&c <='9')
                p++;
            if (i == 0)
            {
                if (c == '0') return false;
            }

        }
        if (p == 11) return true;
        else {
            return false;
        }
    }
    private static boolean checkPersonalWord(String personalPassWord) {

        if(personalPassWord.length() != 18) return false;
        char c = personalPassWord.charAt(0);
        if (c == '0') return false;
        for (int i = 0; i < personalPassWord.length(); i++) {
            char c1 = personalPassWord.charAt(i);
            if (i < 17)
            {
                if (c1 >= '0' && c1 <='9')
                    continue;
                else {
                    return false;
                }
            }
            else
            {
                if (c1 == 'x' || c1 == 'X' || (c1 >= '0' && c1 <='9')) continue;
            }
        }
        return true;
    }

    public static boolean RegistereFind(ArrayList<Regeist> list,String user)
        {
            if (user.length() > 3 && user.length() < 15)
            {
                for (int i = 0; i < list.size(); i++) {
                    Regeist regeist = list.get(i);
                    String s = regeist.getUser();
                    if (s.equals(user) )
                    {
                        System.out.println("该用户名已经被注册，请重新输入");
                        return false;
                    }
                }
                boolean flag = charAtRegistere(user);
                if (!flag){
                    System.out.println("请重新输入用户名");
                    return false;
                }

            }
            else {
                System.out.println("用户名不符合长度需求，请重新输入");
                return false;
            }

            return true;
        }

        public static boolean charAtRegistere(String s)
        {
            int q = 0;
            for (int i = 0; i < s.length(); i++) {
                char charAt = s.charAt(i);
                if(charAt > '0' && charAt <'9')
                {
                    q++;
                }
                else if ((charAt < 'a' || charAt >'z') && (charAt < 'A' || charAt >'Z'))
                {
                    System.out.println("不能包含除字母数字外其他特政符");
                    return false;
                }
                }
            if (q == s.length())
            {
                System.out.println("请输入包含但不全是数字的用户名");
                return false;
            }
            return true;
        }

}


