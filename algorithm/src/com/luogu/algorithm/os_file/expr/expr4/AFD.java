package com.luogu.algorithm.os_file.expr.expr4;

/**
 * 打开文件目录
 * @author 陈奕坤
 */
class AFD {

    String open_filename;

	private int[] open_protect = new int[3];

	boolean read;

	boolean write;

	AFD(){
		open_filename = null;
		open_protect[0] = 1;
		open_protect[1] = 1;
		open_protect[2] = 1;
		read = false;
		write = false;
	}

	AFD(String open_filename){
		this.open_filename = open_filename;
		open_protect[0] = 1;
		open_protect[1] = 1;
		open_protect[2] = 1;
		read = false;
		write = false;
	}
}
