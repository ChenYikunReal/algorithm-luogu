package com.luogu.algorithm.os_file.expr.expr4;

import java.util.LinkedList;

/**
 * 主文件目录
 * @author 陈奕坤
 */
class MFD {

    String user_name;

    LinkedList<UFD> link;

    MFD(){
		user_name = null;
		link = null;
	}

	MFD(String user_name){
		this.user_name = user_name;
		this.link = null;
	}

}
