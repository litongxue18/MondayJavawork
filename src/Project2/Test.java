package Project2;

import Project.CPU;
import Project.HardDisk;


public class Test {
	public static void main(String[] args) {
		CPU cpu = new CPU(2200);
		HardDisk HD = new HardDisk(200);
		PC pc = new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
	}
	
}
