## 一 设计模式的目的

设计模式是对软件设计中普遍或反复存在的各种问题，所提出的解决方案。

其目的是为了让程序具有更好的：

* 可重用性
* 可读性
* 可扩展性
* 可靠性
* 高内聚、低耦合



## 二 设计模式七大原则

### 1 单一职责原则

**注：本节实例参看工程中com.lovestory.dm.principle.single_responsibility包**

#### 1.1 简述

对类来说，一个类应该只负责一项职责。

对方法来说，一个方法只负责一项职责。



#### 1.2 注意事项和细节

a. 降低类的复杂度，即一个类只负责一项职责。

b. 提高类的可读性和可维护性。

c. 降低变更引起的风险。

d. 通常情况下应该遵守单一职责原则。

* 如果逻辑简单，可以在代码级违反单一职责原则。

* 如果类中方法足够少，可以在方法级别保持单一职责原则。



#### 1.3 示例

##### 1.3.1 未遵循单一原则

Vehicle类的run方法希望表现出每种交通工具的运动方式。
随着交通工具种类增加或者修改，有可能需要新增或修改其运动方式，直接在Vehicle类中修改会带来一些风险。
该情况增加了类的复杂度，可读性不高，目的性不明显，违反了单一原则。

```java
SR1_SingleResponsibility.java

package com.lovestory.dm.principle.single_responsibility;

public class SR1_SingleResponsibility {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("汽车");
		vehicle.run("轮船");
		vehicle.run("飞机");
	}

}

class Vehicle {
	public void run(String vehicle) {
		if ("汽车".equals(vehicle)) {
			System.out.println(vehicle + " 在公路行驶...");
		} else if ("轮船".equals(vehicle)) {
			System.out.println(vehicle + " 在水上航行...");
		} else if ("飞机".equals(vehicle)) {
			System.out.println(vehicle + " 在天上飞行...");
		} else {
			System.out.println("nothing...");
		}
		
	}
}

```



##### 1.3.2 方法分解 -- 改进方案一

该方式没有对原有类做大的修改，只是增加了方法。
虽然没有在类的级别上遵守单一职责原则，但是在方法级别上，遵守了单一职责原则。

```java
SR3_SingleResponsibility.java
    
package com.lovestory.dm.principle.single_responsibility;

public class SR3_SingleResponsibility {

	public static void main(String[] args) {
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.runRoad("汽车");
		vehicle2.runWater("轮船");
		vehicle2.runAir("飞机");
	}

}

class Vehicle2 {
	public void runRoad(String vehicle) {
		System.out.println(vehicle + " 在公路行驶...");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle + " 在水上航行...");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle + " 在天上飞行...");
	}
}

```



##### 1.3.3 类分解 -- 改进方案二

该方式遵循了单一职责原则，将类进行了分解。

但同时也需要修改客户端（main方法），改动很大

```java
SR2_SingleResponsibility.java
    
package com.lovestory.dm.principle.single_responsibility;

public class SR2_SingleResponsibility {

	public static void main(String[] args) {
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("汽车");
		AirVehicle airVehicle = new AirVehicle();
		airVehicle.run("飞机");
		WaterVehicle waterVehicle = new WaterVehicle();
		waterVehicle.run("轮船");
	}

}

class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在路上运行...");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在天上运行...");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在水上运行...");
	}
}
```



### 2 接口隔离原则

**注：本节实例参看工程中com.lovestory.dm.principle.segregation包**



#### 2.1 简述

客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小接口上。



#### 2.2 示例

##### 2.2.1 未遵循接口隔离原则

Class3_S1通过接口InterfaceS1依赖使用Class1_S1类，但是只会用到1,2,3方法。

Class4_S1通过接口InterfaceS1依赖使用Class2_S1类，但是只会用到1,4,5方法。

而Class1_S1和Class2_S1未使用到的方法也要实现。

```java
S1_Segregation.java

package com.lovestory.dm.principle.segregation;

public class S1_Segregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface InterfaceS1 {
	void operation1();

	void operation2();

	void operation3();

	void operation4();

	void operation5();
}

class Class1_S1 implements InterfaceS1 {

	@Override
	public void operation1() {
		System.out.println("Class1_S1 实现了operation1");

	}

	@Override
	public void operation2() {
		System.out.println("Class1_S1 实现了operation2");

	}

	@Override
	public void operation3() {
		System.out.println("Class1_S1 实现了operation3");

	}

	@Override
	public void operation4() {
		System.out.println("Class1_S1 实现了operation4");

	}

	@Override
	public void operation5() {
		System.out.println("Class1_S1 实现了operation5");

	}

}

class Class2_S1 implements InterfaceS1 {

	@Override
	public void operation1() {
		System.out.println("Class2_S1 实现了operation1");

	}

	@Override
	public void operation2() {
		System.out.println("Class2_S1 实现了operation2");

	}

	@Override
	public void operation3() {
		System.out.println("Class2_S1 实现了operation3");

	}

	@Override
	public void operation4() {
		System.out.println("Class2_S1 实现了operation4");

	}

	@Override
	public void operation5() {
		System.out.println("Class2_S1 实现了operation5");

	}
}

class Class3_S1 {
	public void depend1(InterfaceS1 i) {
		i.operation1();
	}
	public void depend2(InterfaceS1 i) {
		i.operation2();
	}
	public void depend3(InterfaceS1 i) {
		i.operation3();
	}
}


class Class4_S1 {
	public void depend1(InterfaceS1 i) {
		i.operation1();
	}
	public void depend4(InterfaceS1 i) {
		i.operation4();
	}
	public void depend5(InterfaceS1 i) {
		i.operation5();
	}
}
```



##### 2.2.2 遵循接口隔离原则

将InterfaceS1拆分为三个独立接口Interface1_S2、Interface2_S2、Interface3_S2。

类Class3_S2和Class4_S2分别与他们需要的接口建立依赖关系。

```java
S2_Segregation.java

package com.lovestory.dm.principle.segregation;

public class S2_Segregation {

	public static void main(String[] args) {
		Class3_S2 class3_s2 = new Class3_S2();
		// Class3_S2 通过接口依赖Class1_S2
		class3_s2.depend1(new Class1_S2());
		class3_s2.depend2(new Class1_S2());
		class3_s2.depend3(new Class1_S2());

		Class4_S2 class4_s2 = new Class4_S2();
		// Class4_S2 通过接口依赖Class2_S2
		class4_s2.depend1(new Class2_S2());
		class4_s2.depend4(new Class2_S2());
		class4_s2.depend5(new Class2_S2());
	}

}

interface Interface1_S2 {
	void operation1();
}

interface Interface2_S2 {
	void operation2();

	void operation3();
}

interface Interface3_S2 {
	void operation4();

	void operation5();
}

class Class1_S2 implements Interface1_S2, Interface2_S2 {

	@Override
	public void operation1() {
		System.out.println("Class1_S2 实现了operation1");

	}

	@Override
	public void operation2() {
		System.out.println("Class1_S2 实现了operation2");

	}

	@Override
	public void operation3() {
		System.out.println("Class1_S2 实现了operation3");

	}
}

class Class2_S2 implements Interface1_S2, Interface3_S2 {

	@Override
	public void operation1() {
		System.out.println("Class2_S2实现了operation1");

	}

	@Override
	public void operation4() {
		System.out.println("Class2_S2实现了operation4");

	}

	@Override
	public void operation5() {
		System.out.println("Class2_S2 实现了operation5");

	}
}

//Class3_S2通过接口Interface1_S2, Interface2_S2依赖使用Class1_S2类，但是只会用到1,2,3方法
class Class3_S2 {
	public void depend1(Interface1_S2 i) {
		i.operation1();
	}

	public void depend2(Interface2_S2 i) {
		i.operation2();
	}

	public void depend3(Interface2_S2 i) {
		i.operation3();
	}
}

// Class4_S2通过接口Interface1_S2, Interface3_S2依赖使用Class2_S2类，但是只会用到1,4,5方法
class Class4_S2 {
	public void depend1(Interface1_S2 i) {
		i.operation1();
	}

	public void depend4(Interface3_S2 i) {
		i.operation4();
	}

	public void depend5(Interface3_S2 i) {
		i.operation5();
	}
}

```



### 3 依赖倒置原则

**注：本节实例参看工程中com.lovestory.dm.principle.inversion包**



#### 3.1 简述

依赖倒置原则：

（1）高层模块不应该依赖低层模块，二者都应该依赖其抽象。

（2）抽象不应该依赖细节，细节应该依赖抽象。

（3）依赖倒置的中心思想：面向接口编程。

（4）依赖倒置设计理念：

相对于细节的多变性，抽象的东西要稳定的多。

以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。

在java中，抽象指的是接口或者抽象类，细节就是具体的实现类。

（5）使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成。



#### 3.2 依赖倒置原则注意事项和细节

（1）低层模块尽量都要有抽象类或接口，或者两者都有，程序的稳定性会更好。

（2）变量的声明类型尽量使抽象类或者接口，这样我们的变脸引用和实际对象直接就存在了一个缓冲层，利于程序的扩展和优化。

（3）继承时遵循里式替换原则。



#### 3.3 示例

##### 3.3.1 未遵循依赖倒置

该方式实现简单。
如果获取的对象是QQ、微信等方式，Person类需要增加相应的接收方法。

```java
I1_DependencyInversion.java

package com.lovestory.dm.principle.inversion;

public class I1_DependencyInversion {
	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email_I1());
	}
}

class Email_I1 {
	public String getInfo() {
		return "email: hello world.";
	}
}

class Person {
	public void receive(Email_I1 email) {
		System.out.println(email.getInfo());
	}
}
```



##### 3.3.2 遵循依赖倒置

由对具体对象的依赖转换为对接口的依赖。

定义一个接口，使具体的类实现该接口。

由对具体类的对象的依赖转换成对接口的依赖。

```java
I2_DependencyInversion.java

package com.lovestory.dm.principle.inversion;

public class I2_DependencyInversion {
	public static void main(String[] args) {
		Person_I2 person = new Person_I2();
		person.receive(new Email_I2());
		person.receive(new WeChat_I2());
	}
}

// 引入一个接口，使Person_I2类与接口I2_Receiver发生依赖关系。
// Email_I2,WeChat_I2各自实现I2_Receiver接口
interface I2_Receiver {
	String getInfo();
}

class Email_I2 implements I2_Receiver {
	public String getInfo() {
		return "email: hello world.";
	}
}

class WeChat_I2 implements I2_Receiver {
	public String getInfo() {
		return "wechat: hello world.";
	}
}

class Person_I2 {
	
	// 由对具体对象的依赖转换为对接口的依赖
	public void receive(I2_Receiver receiver) {
		System.out.println(receiver.getInfo());
	}
}
```



#### 3.4 依赖关系的三种传递方式

（1）接口传递

（2）构造器传递

（3）setter方法传递



### 4 里式替换原则

**注：本节实例参看工程中com.lovestory.dm.principle.liskov_substitution包**



#### 4.1 简述





#### 4.2 示例

##### 4.2.1 未遵循里式替换原则



