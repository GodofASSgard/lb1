package mypackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class Cat {
String name;	
String owner;
double weight;
int age;

public Cat (String name,String owner,double weight,int age) {
	this.name=name;
	this.owner=owner;
	this.weight=weight;
	this.age=age;
}
void print() {
	System.out.printf("%20s %20s %2f %3d\n",name, owner, weight, age);
}

public static void main(String[] args) {
	Cat cats[]=new Cat[12];
	cats[0]=new Cat ("Барсик", "Елена",5.000,3);
	cats[1]=new Cat("Персик", "Анастасия",4.760,9);
	cats[2]=new Cat ("Вася", "Дарья",5.010,5);
	cats[3]=new Cat ("Шлагбаум", "Жанна",3.900,3);
	cats[4]=new Cat ("Помогите", "Альбина",4.170,7);
	cats[5]=new Cat ("Мурчало", "Яна",4.480,4);
	cats[6]=new Cat ("Кот", "Лиза",3.990,5);
	cats[7]=new Cat ("Котяра", "Екатерина Великая",5.660,6);
	cats[8]=new Cat ("Наполен", "Обама",4.900,8);
	cats[9]=new Cat ("Карбонара", "Феодосия",4.780,10);
	cats[10]=new Cat ("Ежик", "Ангелина",3.150,12);
	cats[11]=new Cat ("Кыс кыс", "Бритниспирс",4.005,11);
	System.out.printf("сортировка по весу\n");
	// сортировка по весу
	for (int i = 0; i < cats.length; i++) {
		int j_max = i;
		for (int j = i+ 1; j < cats.length; j++) {
		if (cats[j_max].weight <cats[j].weight) {
		j_max = j;
		}
		}

		Cat temp = cats[i];
		cats[i] = cats[j_max];
		cats[j_max] = temp;
		}
	for (Cat cat : cats) {
		cat.print();
	}
	System.out.printf("сортировка по количеству лет\n");
	// сортировка по количеству лет
	for (int i = 0; i < cats.length; i++) {
		int j_max = i;
		for (int j = i+ 1; j < cats.length; j++) {
		if (cats[j_max].age < cats[j].age) {
		j_max = j;
		}
		}

		Cat temp = cats[i];
		cats[i] = cats[j_max];
		cats[j_max] = temp;
		}
	for (Cat cat : cats) {
		cat.print();}
	// сортировка по длине имени владельца
	System.out.printf("сортировка по имени кошки\n");
	// сортировка по весу
	for (int i = 0; i < cats.length; i++) {
		int j_max = i;
		for (int j = i+ 1; j < cats.length; j++) {
		if (cats[j_max].name.length() <cats[j].name.length()) {
		j_max = j;
		}
		}

		Cat temp = cats[i];
		cats[i] = cats[j_max];
		cats[j_max] = temp;
		}
	for (Cat cat : cats) {
		cat.print();
	}
	System.out.printf("сортировка по имени владельца\n");
	for (int i = 0; i < cats.length; i++) {
		int j_max = i;
		for (int j = i+ 1; j < cats.length; j++) {
		if (cats[j_max].owner.length() <cats[j].owner.length()) {
		j_max = j;
		}
		}

		Cat temp = cats[i];
		cats[i] = cats[j_max];
		cats[j_max] = temp;
		}
	for (Cat cat : cats) {
		cat.print();
	}

	try {
		PrintStream out = new PrintStream(new File("D:/cats.txt"));

		for (Cat cat : cats) {
		cat. printToFile(out);

		}
		} catch (FileNotFoundException e) {

		System. err.println(e.getMessage());}
		}
	void printToFile(PrintStream stream) {
		stream.printf("%20s %20s %4.2f %2d\n",
		name, owner, weight, age);
		
		
}


}