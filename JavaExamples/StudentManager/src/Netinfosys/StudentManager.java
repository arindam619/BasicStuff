package Netinfosys;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;

public class StudentManager {

	public static final String FILE = "smdata";
	public File f = new File(FILE);
	
	public static String capitalized(String str) {
		
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
		
	} 
	
	public boolean serialization(Student student) {
		boolean result = false;
		
		try (
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			) {
			
			oos.writeObject(student);
			
			result = true;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	
	public Student unserialization() {
		Student student = null;
		
		if ( f.exists() ) {
			
			try (
					FileInputStream fs = new FileInputStream(f);
					ObjectInputStream ois = new ObjectInputStream(fs);
				) {
				
				
				student = (Student) ois.readObject();				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		
		return student;		
	}
	
	
	public String[] loadInfo(String studentName) {
		String[] info = null;
		Student student = unserialization();

		if (student != null) {
			info = new String[1];
			info = student.getData(studentName);
		}
		else {
			//TODO Error checking			
		}
			
		
		return info;
	}
	
	
	public boolean setInfo(String index, String[] info) {
		boolean result = false;
		Student student;
				
		if ( !f.exists() )
			student = new Student();
		else
			student = unserialization();
		
		if ( student.setData(index.toLowerCase(), info) )				
			result = serialization(student);
		
		return result;
	}
	
	
	public void displayRecord() {
		
		Student student = unserialization();
		
		if ( student == null ) {
			System.out.println("No data available.");
			return;
		}
		
		HashMap<String, String[]> studentData = student.getAllData();
		
		Iterator<String> iterator = studentData.keySet().iterator();
		while ( iterator.hasNext() ) {
			String studentName = iterator.next();
			String[] studentInfo = studentData.get(studentName);
			
			System.out.println(capitalized(studentName) +", "+ studentInfo[0] +", "+ studentInfo[1]);
			
		}
		
	}

}
