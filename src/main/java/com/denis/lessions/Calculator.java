package com.denis.lessions;

public class Calculator{
	
	/**
	* result of calculations
	*/
	private double result;
	
	/**
	* intermediate result
	*/
	private double timeResult;

	/**
	 * Summary of entrance parameters
	 * @param entery parameters to summ
	 * @throws Exception throws in case of less than 2 args
	 */
	public void summ (int ... entery)throws CalcException{
		if(entery.length > 1){	
			this.timeResult = 0;
			for(Integer param : entery){
				this.timeResult += param;
			}
			this.result = this.timeResult;
		} else {
			throw new CalcException();
		}				
	}

	/**
	 * Subtraction of entrance parameters
	 * @param entery parameters to subtract
	 * @throws Exception throws in case of less than 2 args
	 */
	public void substruct (int ... entery)throws CalcException{
		if(entery.length > 1){		
			this.timeResult = entery[0] * 2;
			for(Integer param : entery){
				this.timeResult -= param;
			}
			this.result = this.timeResult;
		} else {
			throw new CalcException();
		}						
	}

	/**
	 * Multiplication of entrance parameters
	 * @param entery parameters to multiply
	 * @throws Exception throws in case of less than 2 args
	 */
	public void multiply (int ... entery)throws CalcException{
		if(entery.length > 1){
			this.timeResult = 1;
			for(Integer param : entery){
				this.timeResult *= param;
			}
			this.result = this.timeResult;
		} else {
			throw new CalcException();
		}			
	}

	/**
	 * Division of entrance parameters
	 * @param entery parameters to divide
	 * @throws Exception throws in case of less than 2 args
	 */
	public void division (int ... entery)throws CalcException{
		if(entery.length > 1){
			this.timeResult = (double)entery[0] * 2;
			for(Integer param : entery){
				this.timeResult /= (double)param;
			}
			this.result = this.timeResult;
		} else {
			throw new CalcException();
		}
	}
	
	/**
	* Returns result of calculations
	*/
	public double getResult(){
		return (this.result);
	}
	
	/**
	* Sets result to zero
	*/	
	public void cleanResult(){
		this.result = 0;
	}
}