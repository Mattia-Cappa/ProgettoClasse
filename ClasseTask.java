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
	
	public String getNome(){
		return this.nomeTask;
	} 
	
	public String getDipendente(){
		return this.nomeTask;
	}
	
	public String getpriorita(){
		return this.nomeTask;
	}
	
	public void setNome(String nome){
		this.nomeTask = nome;
	}
	
	public void setDipendente(String dipendente){
		this.nomeTask = dipendente;
	}
	
	public void setpriorita(String priorita){
		this.nomeTask = priorita;
	}
	
}