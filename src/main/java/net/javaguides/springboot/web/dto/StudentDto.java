package net.javaguides.springboot.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentDto {
	
	private int isnomresi;
	private String name;
	private String surname;
	private String  ata_adi;
	private String telefon;
	private String evtelefonu;
	private String ixtisas;
	private String qebulili;
	private String dogumtarixi;
	private String qeydiyyat_tarixi;
	private int qebul_bali;
	private int finkod;
	private int fenn1;
	private int fenn2;
	private int fenn3;
	private int balltesdiqi;
	private int universitet_id;
	private int verilmiskitablar_id;
	private int bolme_id;
	private String telebeqeyd;
	
	
}
