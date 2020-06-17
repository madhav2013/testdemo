package com.capgemini.mthdref;

public interface EmployeeFactory {
	 
    public abstract Employee getEmployee(String name, String account, Integer salary);
}