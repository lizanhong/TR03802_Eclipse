package com.zztr.item.tr03802;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
* @Description: 
* @author: 铭
* @date 2024年3月27日 上午10:38:59
*/

public class afsds_pengyi {
	public static void main(String[] args) {
		System.out.println(1);
		File file = new File("E:/zktr/a.txt");
		Scanner in = new Scanner(System.in);
		if(file.exists()) {
			FileOutputStream out=null;
			try {
				System.out.println("请输入内容");
				String value = in.next();
				out = new FileOutputStream(file,true);
				out.write(value.getBytes());
				out.write('\n');
				System.out.println("写入成功！");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(out!=null) {
					try {
						out.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}else {
			System.out.println("文件夹不存在，已创建好！");
			File f2 = new File(file.getParent());
			if(!f2.isDirectory()) {
				f2.mkdirs();
			}
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
