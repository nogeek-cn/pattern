package com.darian.pattern.proxy.custom;
import com.darian.pattern.staticed.Person;
import java.lang.reflect.Method;
public class $Proxy0 implements com.darian.pattern.staticed.Person{
DarianInvocationHandler h;
public $Proxy0(DarianInvocationHandler h){
this.h = h;}
public void zuFangZi(){
try{
Method m = com.darian.pattern.staticed.Person.class.getMethod("zuFangZi",new Class[]{});
this.h.invoke(this, m, null);
}catch(Throwable e){
e.printStackTrace();
}
}public void buy(){
try{
Method m = com.darian.pattern.staticed.Person.class.getMethod("buy",new Class[]{});
this.h.invoke(this, m, null);
}catch(Throwable e){
e.printStackTrace();
}
}public void findJob(){
try{
Method m = com.darian.pattern.staticed.Person.class.getMethod("findJob",new Class[]{});
this.h.invoke(this, m, null);
}catch(Throwable e){
e.printStackTrace();
}
}public void findLove(){
try{
Method m = com.darian.pattern.staticed.Person.class.getMethod("findLove",new Class[]{});
this.h.invoke(this, m, null);
}catch(Throwable e){
e.printStackTrace();
}
}}
