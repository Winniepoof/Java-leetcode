package kaoshi;

class Teacher{
    static int count;

    private String name; // 表示教师的名字
    private int	age;     // 表示教师的年龄
    private boolean sex; // 表示教师的性别, true表示男性, false表示女性.

    public Teacher(String name, int age,
                   boolean sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
        count++;
    }

    public Teacher(String name, int age){
        this(name, age, true);
    }

    public Teacher(String name, boolean sex){
        this(name, 20, sex);
    }

    public Teacher(String name){
        this(name, 20, true);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setSex(boolean sex){
        this.sex=sex;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public boolean getSex(){
        return this.sex;
    }

    public String toString(){
        return "该教师的名字为: "
                +this.name
                +", 年龄为"
                +this.age+
                ", 性别为"
                +(sex? "男":"女");
    }

    public static void main(String[] args){
        Teacher tch=new Teacher("new", 20);
        System.out.println(tch);
        System.out.printf("%s,%s,%s\n", tch.name,
                tch.age, tch.sex);
        System.out.printf("count: %d\n", tch.count);
        Teacher tch1=new Teacher("new2", 20);
        System.out.println(tch1);
        System.out.printf("count: %d\n", tch.count);
    }
}
