package gtest1;

public class TestReturn {

	
	/**
	* Created by IntelliJ IDEA.
	* User: leizhimin
	* Date: 2007-12-3
	* Time: 8:54:28
	* Java中的return语句使用总结
	*/

	    public static void main(String args[]) {
	       TestReturn t = new TestReturn();
	        t.test1();
	        t.test2();
//	        String s = t.test2();
//	        System.out.print(s + "\n");
//	        t.test3(s);
	    }

	    /**
	     * 无返回值类型的return语句测试
	     */
	    public void test1() {
	        System.out.println("---------无返回值类型的return语句测试--------");
	        for (int i = 1; ; i++) {
	            if (i == 4) 
	            	return;
	            System.out.println("i = " + i);
	        }
	    }

	    /**
	     * 有返回值类型的return语句测试
	     * @return String
	     */
	    public String test2(){
	        System.out.println("---------有返回值类型的return语句测试--------");
	        return "返回一个字符串";
	    }
	    
	    public void test3(String str){
	    	System.out.println("---------call有返回值类型的return语句---------" + "\n");
	    }
	    
	    public void test4(String str){
	    	System.out.println("---------call有返回值类型的return语句---------" + "\n" + test2());
	    }
	} 
	
