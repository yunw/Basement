package gtest1;

public class TestReturn {

	
	/**
	* Created by IntelliJ IDEA.
	* User: leizhimin
	* Date: 2007-12-3
	* Time: 8:54:28
	* Java�е�return���ʹ���ܽ�
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
	     * �޷���ֵ���͵�return������
	     */
	    public void test1() {
	        System.out.println("---------�޷���ֵ���͵�return������--------");
	        for (int i = 1; ; i++) {
	            if (i == 4) 
	            	return;
	            System.out.println("i = " + i);
	        }
	    }

	    /**
	     * �з���ֵ���͵�return������
	     * @return String
	     */
	    public String test2(){
	        System.out.println("---------�з���ֵ���͵�return������--------");
	        return "����һ���ַ���";
	    }
	    
	    public void test3(String str){
	    	System.out.println("---------call�з���ֵ���͵�return���---------" + "\n");
	    }
	    
	    public void test4(String str){
	    	System.out.println("---------call�з���ֵ���͵�return���---------" + "\n" + test2());
	    }
	} 
	
