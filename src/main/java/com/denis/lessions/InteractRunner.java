package com.denis.lessions;

import java.util.Scanner;

//класс предназначен для проведения простых 
//арифметических операций над числами
public class InteractRunner{
	
	//главная точка входа в программу
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		
		try{
			Calculator calc = new Calculator();
			String exit = "no";

			//до тех пор, пока пользователь не пожелал выйти
			while(!exit.equals("yes")){
				String operationExist = "yes";
				
				//просим ввести значения для обработки
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				
				//цикл для возможности повторно ввести название
				//операции в случае ошибки при желании пользователя
				while(operationExist.equals("yes")){
					operationExist = "no";
					
				System.out.println("\nWhat operation would you like to do? \n");
				System.out.println("Write \"summ\" if operation you want is + ");
				System.out.println("Write \"minus\" if operation you want is - ");
				System.out.println("Write \"multiply\" if operation you want is * ");
				System.out.println("Write \"division\" if operation you want is / \n");
				
				String operation = reader.next();
					
					//обработчик, в случае успешного ввода названия
					//операции произведет вычисления и запишет результат
					//в случае неправильного ввода предложит сделать это повторно
					switch(operation){
						case "summ": 
							calc.summ(Integer.valueOf(first), Integer.valueOf(second));
							break;
						case "minus": 
							calc.substruct(Integer.valueOf(first), Integer.valueOf(second));
							break;
						case "multiply": 
							calc.muliply(Integer.valueOf(first), Integer.valueOf(second));
							break;
						case "division": 
							calc.division(Integer.valueOf(first), Integer.valueOf(second));
							break;
						default: 
							System.out.println("There is no such command try again yes/no ?");
							operationExist = reader.next();
					}
				}
				
				//вывод полученных данных
				System.out.println("\nResult = " + calc.getResult());
				calc.cleanResult();							
				
				//предложение выйти или продолжить работу с нуля
				System.out.println("\nExit yes/no ? \n");
				exit = reader.next();
			}
			
		} catch (Exception e){
			System.out.println(e);
		} finally {
			reader.close();
		}
		
	}
	
}