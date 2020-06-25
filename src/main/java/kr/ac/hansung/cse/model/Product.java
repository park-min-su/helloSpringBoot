package kr.ac.hansung.cse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor		
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4577239542252345341L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "category")
	private String category;

	@Column(name = "price")
	private int price;

	@Column(name = "manufacture")
	private String manufacture;

	@Column(name = "unitinstock")
	private int unitInStock;

	@Column(name = "description")
	private String description;

	public Product( String name, String category, int price, String manufacture, int unitInStock, String description) {
		
		this.name = name;
		this.category = category;
		this.price = price;
		this.manufacture = manufacture;
		this.unitInStock = unitInStock;
		this.description = description;
		
	}
}