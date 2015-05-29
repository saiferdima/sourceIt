package com.sourceit.java.basic.Popazovdk.HT11;


public class Main {

	public static void main(String[] args) throws Exception {
		
	MyTextStatistic mts = new MyTextStatistic(FileEditor.read(Info.FILE_NAME));
	StringBuffer sb = new StringBuffer();
	BuildStatistic bs = new BuildStatistic();
	sb.append(bs.buildStatistic(mts,'l'));
	sb.append(FileEditor.read(Info.FILE_NAME));
	String result = sb.toString();
	FileEditor.write(Info.FILE_NAME, result);
	

	
	}

}
