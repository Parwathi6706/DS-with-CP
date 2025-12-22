class Studentinfo {
    String name;
    int age;

    void getName() {
        System.out.println(name);
    }

    void getAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        Studentinfo a = new Studentinfo();
        a.name = "Paru";
        a.age = 19;

        System.out.println(a.name);
        System.out.println(a.age);
        a.getName();
        a.getAge();
    }
}
