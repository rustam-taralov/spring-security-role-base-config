package net.javaguides.springboot.util;


public class SqlQueries {

	public static final String SelectStudentJoin="Select s.isnomresi,s.ad,s.soyad,s.ata_adi,s.telefon,s.ev_telefonu,s.ixtisas,s.qebul_ili,s.dogum_tarixi,s.qeydiyyat_tarixi,s.qebul_bali,s.fin_kod,\r\n" + 
			"m.muellim_adi,mu.muellim_adi,ml.muellim_adi,s.ball_tesdiqi,u.uni_adi,\r\n" + 
			"v.mentiq_kitabi,v.informatika_kitabi,v.xarici_dili_kitabi,b.bolme_name,s.telebe_qeyd,s.student_status\r\n" + 
			"from course.student s left join course.muellim m on s.fenn_1=m.id \r\n" + 
			"left join course.muellim mu on s.fenn_2=mu.id \r\n" + 
			"left join course.muellim ml on s.fenn_3=ml.id\r\n" + 
			"left join course.universitet u on s.universitet_id=u.id \r\n" + 
			"left join course.verilmis_kitablar v on s.universitet_id=v.id\r\n" + 
			"left join course.bolme b on s.bolme_id = b.id";
	
	
}
