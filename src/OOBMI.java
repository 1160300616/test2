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

	System.out.printf("�������%d��ѧ����ѧ��:",i);
	students.id=in.nextLine();
	System.out.printf("�������%d��ѧ��������:",i);
	students.name=in.nextLine();
	System.out.printf("�������%d��ѧ��������(kg)��",i);
	students.weight=in.nextFloat();
	System.out.printf("�������%d��ѧ�������(m)��",i);
	students.height=in.nextFloat();
	in.nextLine();
	return students;
}
}
