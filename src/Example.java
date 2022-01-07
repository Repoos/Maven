class A{  
void a(){System.out.println("A");}  
}  
class A1 extends A{  
void b(){System.out.println("A1");}  
}  
class A2 extends A{  
void c(){System.out.println("A2");}  
} 
class A12 extends A1{  
void n(){System.out.println("A3");}  
}
class D1 extends A12{  
void e(){System.out.println("A2");}  
}
class A21 extends A2{  
void f(){System.out.println("A2");}  
} 
class B{  
void h(){System.out.println("B");}  
} 
class B1 extends B{  
void i(){System.out.println("B1");}  
}
class B12 extends B1{  
void j(){System.out.println("B12");}  
}
//class D1 extends A21{  
//void c(){System.out.println("A2");}  
//}
class Example{  
public static void main(String args[]){  
A12 d=new A12();
A21 r=new A21();
B12 k=new B12();
d.b();  
d.a();  
r.c();
d.n();
k.h();
k.i();
k.j();
}}  

