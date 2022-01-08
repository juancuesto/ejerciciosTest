package org.itacademy.javatesting.assertj;

public class LetraDNI {
	
	char letra;
	
	public char getChar() {
		return letra;
	}
	
	public char getLetra(int numero){
		
		int a=numero%23;
		
		switch(a) {
		case 0:{
			letra='T';
			return letra;
		}
		case 1:{
			letra='R';
			return letra;
		}
		case 2:{
			letra='W';
			return letra;
		}
		case 3:{
			letra='A';
			return letra;
		}
		case 4:{
			letra='G';
			return letra;
		}
		case 5:{
			letra='M';
			return letra;
		}
		case 6:{
			letra='Y';
			return letra;
		}
		case 7:{
			letra='F';
			return letra;
		}
		case 8:{
			letra='P';
			return letra;
		}
		case 9:{
			letra='D';
			return letra;
		}
		case 10:{
			letra='X';
			return letra;
		}
		case 11:{
			letra='B';
			return letra;
		}
		case 12:{
			letra='N';
			return letra;
		}
		case 13:{
			letra='J';
			return letra;
		}
		case 14:{
			letra='Z';
			return letra;
		}
		case 15:{
			letra='S';
			return letra;
		}
		case 16:{
			letra='Q';
			return letra;
		}
		case 17:{
			letra='V';
			return letra;
		}
		case 18:{
			letra='H';
			return letra;
		}
		case 19:{
			letra='L';
			return letra;
		}
		case 20:{
			letra='C';
			return letra;
		}
		case 21:{
			letra='K';
			return letra;
		}
		case 22:{
			letra='E';
			return letra;
		}
		}
		return '0';
	}
	
	}
	

	
