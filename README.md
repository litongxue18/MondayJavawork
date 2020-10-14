 ＃MondayJavawork
## 1.实验要求
1. 基本要求：完成教材p110 第四题关于PC、内存等模拟的程序。  

2. 附加要求：  

a) 类中定义不少于两个构造方法；  

b) 每个类定义不少于2个属性，且属性的类型应该多样化；  

c) 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；  

d) 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。  

3. 实验报告提交  

a) 实验报告应该包“实验内容”、“实验方法”或、“实验设计”、“核心方法/伪代码”、“实验结果”、“实验感想”等步骤；  

b) 除了“实验结果”外，其他小节杜绝截屏给出图；  

c) 本次实验通过github平台提交，包括：  

i. 程序的代码及相关资源文件；  

ii. Readme.md文件写作（即实验报告部分）。  

iii. 每名同学通过云班课的作业提交github实验的URL链接。  
## 2.实验设计  
1.设置了一个硬盘类，给硬盘设置了容量amount和品牌brand.
```
     public class HardDisk {
	      private int amount;
	      private String brand;  
 ```
2.设置了一个CPU类，给CPU设置了速度speed.品牌brand和money.  
```
    public class CPU {  
     private int speed;  
     private String brand;  
     public double money;
```
     
## 3.核心方法  
1. set方法 
```
public void setCPU(CPU cpu){
		this.cpu=cpu;
	}
	public void setHardDisk(HardDisk HD){
		this.HD=HD;
	}    
```
2.get方法
```
  public CPU(int speed){
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
```
## 4.实验结果  
```
HDaomunt200
CPUspeed2200

```
## 5.实验感想  
1.通过此次实验，掌握了构造方法。  
2.通过练习掌握了基本数据类型int String等的使用。  
3.简单了解了如何上传和编写实验报告。

