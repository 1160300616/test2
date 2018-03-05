import java.util.ArrayList;
import java.util.Scanner;
public class OOBMI{
public class Student{
	public String id;
	public String name;
	public float bmi,height,weight;
}
static Student inputStudent()
{
	Student students = new Student();
	Scanner in =new Scanner(System.in);
	int i=1;

	System.out.printf("请输入第%d个学生的学号:",i);
	students.id=in.nextLine();
	System.out.printf("请输入第%d个学生的姓名:",i);
	students.name=in.nextLine();
	System.out.printf("请输入第%d个学生的体重(kg)：",i);
	students.weight=in.nextFloat();
	System.out.printf("请输入第%d个学生的身高(m)：",i);
	students.height=in.nextFloat();
	in.nextLine();
	return students;
}
}
