//import java.util.Stack;
import java.util.ArrayList;// add() or get()
class QuestionPaper
{
	ArrayList qp =new arrayList();
	string qes[]=new String[3];
	void addQuestion(String q)
      {
		qp.add(q);
      }
	synchronized void printQuestions()
{
//synchronized (this){
for(int i=0;i,i<=qp.size();i++)//
void printQuestions()
{
for(int i=0;i<qp.size();i++){
system.out.println(qp.get(i));
try{
}
}
}
//student Has-a question paper
class Student implements Runnable       
{
	String name;
	QuestionPaper q; 
	Student(String name,QuestionPaper q)
	{
	   this.name=name;
	   this.q=q;
}
public void run(){
	synchronized(this)
	q.printQuestions()
}


}
class TestQP
{
	public static void main(String args[]){
	QuestionPaper python = new QuestionPaper();
	python.addQuestion("Is python scripting language");
	python.addQuestion("What are generators in python");
	python.addQuestion("Is global keyword found in python");
	python.addQuestion("Is global keyword
	Student s1= new Student("Ramu",python);
	Student s2= new Student("Rahul",python);
	Thread t1=new thread (s1);
	Thread t2=new thread (s2);

