package Project2;

import Project.CPU;
import Project.HardDisk;


public class PC {
	private CPU cpu;
	private HardDisk HD;
	public double money;
	public PC(){
		
	}
	public PC(CPU cpu,HardDisk HD){
		this.cpu=cpu;
		this.HD=HD;
	}
	public void setCPU(CPU cpu){
		this.cpu=cpu;
	}
	public void setHardDisk(HardDisk HD){
		this.HD=HD;
	}
	public void show(){
		System.out.println("HDaomunt"+HD.getAmount());
		System.out.println("CPUspeed"+cpu.getSpeed());
	}
}
