package com.denis.lessions;

import java.io.IOException;

public class Calculator{
	
	/**
	*результат вычислений
	*/
	private double result;
	
	/**
	*промежуточный результат
	*/
	private double timeResult;
	
	/**
	*выполнение суммирования
	*@param entery входящие аргументы
	*@throws Exception выдает выпадает в случае если нет аргументов
	*/
	public void summ (int ... entery)throws Exception{
		if(entery.length > 1){	
			this.timeResult = 0;
			for(Integer param : entery){
				this.timeResult += param;
			}
			this.result = this.timeResult;
		} else {
			throw new Exception("\nError, minimum count of parametrs is 2 \n");
		}				
	}
	
	/**
	*выполнение вычитания
	*@param entery входящие аргументы
	*@throws Exception выдает выпадает в случае если нет аргументов
	*/
	public void substruct (int ... entery)throws Exception{
		if(entery.length > 1){		
			this.timeResult = entery[0] * 2;
			for(Integer param : entery){
				this.timeResult -= param;
			}
			this.result = this.timeResult;
		} else {
			throw new Exception("\nError, minimum count of parametrs is 2 \n");
		}						
	}
	
	/**
	*выполнение умножения
	*@param entery входящие аргументы
	*@throws Exception выдает выпадает в случае если нет аргументов
	*/	
	public void muliply (int ... entery)throws Exception{
		if(entery.length > 1){
			this.timeResult = 1;
			for(Integer param : entery){
				this.timeResult *= param;
			}
			this.result = this.timeResult;
		} else {
			throw new Exception("\nError, minimum count of parametrs is 2 \n");
		}			
	}
	
	/**
	*выполнение деления
	*@param entery входящие аргументы
	*@throws Exception выдает выпадает в случае если нет аргументов
	*/	
	public void division (int ... entery)throws Exception{
		if(entery.length > 1){
			this.timeResult = (double)entery[0] * 2;
			for(Integer param : entery){
				this.timeResult /= (double)param;
			}
			this.result = this.timeResult;
		} else {
			throw new Exception("\nError, minimum count of parametrs is 2 \n");
		}
	}
	
	/**
	*возвращает результат вычислений
	*/
	public double getResult(){
		return (this.result);
	}
	
	/**
	*отчищает результат вычислений, приравнивая его нулю
	*/	
	public void cleanResult(){
		this.result = 0;
	}
}