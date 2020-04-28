package com.kh.variable.run;

import com.kh.variable.controller.A_Variable;
import com.kh.variable.controller.B_Constant;
import com.kh.variable.controller.C_Casting;
import com.kh.variable.controller.E_Printf;
import com.kh.variable.controller.F_Scanner;

// 자동으로 import 추가하기 (이클립스 기능)
// ctrl + shift + o

public class VariableRun {
	public static void main(String[] args) {
		
		
		A_Variable var = new A_Variable();
		
		
		//변수 사용 X
		//var.noVariable(); 
		
		//변수 사용 O
		//var.usingVariable();
		
		//변수 선언
		//var.declareVariable();
		
		// 변수 선언과 동시에 초기화
		//var.initVariable();
	
		B_Constant cont = new B_Constant();
		
		//cont.finalVariable();

		C_Casting cast = new C_Casting();
		
		//자동 형변환 
		cast.autoCasting();
		
		E_Printf pf = new E_Printf();
		//pf.printfMethod();
		
		F_Scanner scan = new F_Scanner();
		//scan.scannerEx1();
		scan.scannerEx2();
		
	}
	
	
	
}
