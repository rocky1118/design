package com.cmy.design.prototype;

import com.sun.istack.internal.NotNull;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import sun.rmi.runtime.Log;

@Data
@AllArgsConstructor
@Slf4j
@RequiredArgsConstructor
@Builder
public class Student implements Cloneable {
    private int age;
    @Qualifier("name")
    @NotNull
    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(20, "张三");
        Student student2 = (Student) student1.clone();
        student2.setAge(22);// 注意修改student2的age值 但是没有影响 student1的值


        System.out.println(student2);
        System.out.println("student1：" + student1.getName() + "-->" + student1.getAge());
        System.out.println("student2：" + student2.getName() + "-->" + student2.getAge());


        System.out.println("-------------------------------------------------------------");

        Student stu = Student.builder().age(100)
                .name("you are dog  ")
                .build();

        System.out.println(stu);


    }
}