/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa2;

/**
 *
 * @author sarbu_192
 */
import java.util.ArrayList;
import java.util.Date;

public class Service {
	private String name;
	private Boolean limited;
	private Double price;
	private ArrayList<Integer> durations = new ArrayList();
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param checkIn
	 * @param ceckOut
	 */
	public Service(String name, Double price, Boolean limited, ArrayList<Integer> durations) {
		this.name = name;
		this.limited = limited;
		this.price = price;
		this.durations = durations;
	}
        
        
        @Override
	public String toString() {
		return "Service [name=" + name + ", limited=" + limited
				+ ", price=" + price + ", durations=" + durations +  "]";
	}
}