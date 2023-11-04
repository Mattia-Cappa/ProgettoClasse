import java.io.*;

public class ClasseTask{
	//attributi 
	private String nomeTask; 
	private String dipendenteAssegnato;
	private int priorita;
	
	ClasseTask(){
		this.nomeTask = "";
		this.dipendenteAssegnato = "";
		this.priorita = 0;
	}
	
	ClasseTask(String n, String d){
		this.nomeTask = n;
		this.dipendenteAssegnato = d;
		this.priorita = 0;
	}
	
	ClasseTask(String n, String d, int p){
		this.nomeTask = n;
		this.dipendenteAssegnato = d;
		this.priorita = p;
	}
	
}