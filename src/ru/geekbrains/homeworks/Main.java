package ru.geekbrains.homeworks;


import java.util.List;

public class Main {

    public static void main(String[] args) {
		task1();
		task2();
		task3();
    }
    public static void task1 (){
		Array<String>test1 = new Array<>(new String[]{"cat", "dog", "fox", "wolf"});
		System.out.println(test1);
		test1.changeElements(1,3);
		System.out.println(test1);
	}
	public static void task2 (){
		Array<String>test2_1 = new Array<>(new String[]{"a", "b", "c", "d"});
		test2_1.makeList();
		System.out.println(test2_1);

		Array<Integer>test2_2 = new Array<>(new Integer[]{1, 2, 3, 4});
		test2_2.makeList();
		System.out.println(test2_2);

	}
	public static void task3 (){
    	AppleBox appleBox = new AppleBox();
    	appleBox.put(new Apple());
		AppleBox appleBox1 = new AppleBox();
		appleBox1.put(new Apple());
		appleBox1.put(new Apple());
		appleBox1.put(new Apple());

    	OrangeBox orangeBox = new OrangeBox();
    	orangeBox.put(new Orange());
    	orangeBox.put(new Orange());

    	System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
		System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());
		System.out.println();

		System.out.println("Равен ли вес первой и второй коробки яблок?");
		System.out.println(appleBox.compare(appleBox));

		System.out.println("Равен ли вес коробки яблок и коробки апельсинов?");
		System.out.println(orangeBox.compare(appleBox));

		System.out.println();
		System.out.println("Вес первой коробки яблок до: " + appleBox.getWeight());
		System.out.println("Вес второй коробки яблок до: " + appleBox1.getWeight());

		appleBox.changePlaces(appleBox1);

		System.out.println();
		System.out.println("Вес первой коробки яблок после: " + appleBox.getWeight());
		System.out.println("Вес второй коробки яблок после: " + appleBox1.getWeight());
	}

}
