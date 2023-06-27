package StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class startStudentSystem {
    public static void startStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("----------------------欢迎来到学生管理系统------------------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose)
            {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> reStudent(list);
                case "4" -> findStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }


    public static void addStudent(ArrayList<Student> list )
    {
        Student s =new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生ID：");
            String id = sc.next();
            boolean flag = getEqual(list,id);
            if (flag){
                System.out.println("您输入的ID有重复，请重新输入！");
            }
            else {
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生家庭地址");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);

        System.out.println("添加学生成功");
    }


    public static void deleteStudent(ArrayList<Student> list )
    {
        System.out.println("删除学生");
        System.out.println("请输入您要删除的学生学号:");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list, id);
        if(index>=0)
        {
            list.remove(index);
            System.out.println("删除成功！");
        }
        else {
            System.out.println("当前无此学生信息，请添加后再进行操作!");
        }
    }

    public static void reStudent(ArrayList<Student> list )
    {
        System.out.println("修改学生");
        System.out.println("请输入要修改学生信息的学号:");
        Scanner sc =new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list, id);
        if (index>=0){
            Student stu = list.get(index);
            System.out.println("该学号真实存在：");

            while (true) {
                System.out.println("请输入新修改的学生学号:");
                String newId = sc.next();
                if(getIndex(list,newId)>=0){
                    stu.setId(newId);
                    break;
                }
                else {
                    System.out.println("新的学号有重复，请重新输入!");
                }
            }


            System.out.println("请输入新修改的学生姓名");
            String name = sc.next();
            stu.setName(name);

            System.out.println("请输入新修改的学生年龄");
            int age = sc.nextInt();
            stu.setAge(age);

            System.out.println("请输入新修改的学生家庭住址");
            String address = sc.next();
            stu.setAddress(address);
            System.out.println("修改学号为" + index +"信息完成！");
        }
        else {
            System.out.println("当前无此学生信息，请先进性添加！");
        }

    }

    public static void findStudent(ArrayList<Student> list )
    {
        if (list.size() == 0)
        {
            System.out.println("当前无学生信息，请添加后再度查询!");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" +stu.getAge() + "\t" + stu.getAddress());
        }
    }

    public static boolean getEqual( ArrayList<Student> list, String id)
    {
//        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);
//            String sid = stu.getId();
//            if (sid.equals(id)){
//                return true;
//            }
//        }
//        return false;

        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String id)
    {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String stuId = stu.getId();
            if(stuId.equals(id))
            {
                return i;
            }
        }
        return -1;
    }

}
