package cn.itcast05.file;

import java.io.File;

/*
 *   ָ��Ŀ¼
 *   D:\2017\308\day10\aaa
 *   
 *   ��ȡ���Ŀ¼��  ����.java�ļ�  ��������
 *       ��ӡ����·��
 */
public class FileTest2 {
     public static void main(String[] args) {
		 //�ȷ�װָ��Ŀ¼
    	 File dir = new File("D:\\2017\\308\\day10\\aaa");
    	 
    	 getJavaFileByDir(dir);
	 }
     /*
      * ����һ�� Ŀ¼  
      *    ��ӡ ��Ŀ¼�� ���е�.java�ļ�
      */
     public static void getJavaFileByDir(File dir){
    	 //ͨ��listFile���� ��ȡ����Ŀ¼�� �����ļ����ļ���
    	 File[] files = dir.listFiles();
    	 
    	 for (File file : files) {
			  
    		 //���ж��ǲ����ļ�
    		 if(file.isFile()){
    			 String name = file.getName();
    			 if(name.endsWith(".java")){//�ж��ǲ�����.java��β
    				 System.out.println(file.getAbsolutePath());
    			 }
    		 }
		  }
     }
}