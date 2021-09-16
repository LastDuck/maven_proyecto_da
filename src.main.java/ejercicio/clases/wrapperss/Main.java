package ejercicio.clases.wrapperss;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte datoByte=2;         //primitivo
		Byte datoByteWrapper=3;  //wrapper
		System.out.println("primitivo: "+datoByte);
		System.out.println("wrapper: "+datoByteWrapper);
		//conversion
		byte datoByte1=12;   
		Byte datoCon=datoByte1;
		System.out.println("Byte convertido:"+datoByte1);
		
		//conversion 2
		Byte datoC=12;
		byte datop=datoC.byteValue();
		System.out.println("de Byte a byte:"+datop);
		
		short datoShort=1;
		Short datoShortWrapper=1;
		System.out.println("primitivo: "+datoShort);
		System.out.println("wrapper: "+datoShortWrapper);
		
		//convertido
		short datoShort1=15;
		Short c=datoShort1;
		System.out.println("Short convertido:"+ c);
		
		//convertido2
		Short datoC1=25;
		short datop1=datoC1.shortValue();
		System.out.println("de Short a short:"+datop1);
		
		int edad=45;
		Integer edadWrapper=48;
		System.out.println("primitivo: "+edadWrapper);
		System.out.println("wrapper: "+edadWrapper);
		
		//convertido
		int edad1=454;
		Integer cI=edad1;
		System.out.println("Integer convertido:"+cI);
		
		//convertido2
		Integer datoC2=25;
		int datop2=datoC1.intValue();
		System.out.println("de Integer a int:"+datop2);
				
		//convertido
		long valorGrande=125445;
		Long  valorGrandeWrapper=156468L;
		System.out.println("primitivo: "+valorGrande);
		System.out.println("wrapper: "+valorGrandeWrapper);
		//convertido2
		
		Long valorGrande1=125445L;
		long  valorGrandeWrapper2=valorGrande1.longValue();
		System.out.println("de Long a long: "+valorGrandeWrapper2);
		
		//convertido
		boolean H=true;
		Boolean HWrapper=true;
		System.out.println("primitivo: "+H);
		System.out.println("wrapper: "+HWrapper);
		
		//convertido2
		Boolean datoC3=true;
		boolean datop3=datoC3.booleanValue();
		System.out.println("de Boolean a boolean:"+datop3);
				
		//convertido
		char genero='M';
		Character generoWrapper='M';
		System.out.println("primitivo: "+genero);
		System.out.println("wrapper: "+generoWrapper);
		
		//convertido2
		Character genero1='M';
		char generoWrapper1=genero1.charValue();
		System.out.println("de Character a char: "+generoWrapper1);
		
		
		//convertido
		float decimal=45.5f;
		Float decimalWrapper=455.54F;
		System.out.println("primitivo: "+decimal);
		System.out.println("wrapper: "+decimalWrapper);
		
		//convertido2
		Float	 decimal1=45.5F;
		float	 decimalWrapper1=decimal1.floatValue();
		System.out.println("de Float a floart: "+decimalWrapper1);
		
		//convertido
		double sueldo=45455;
		Double sueldoWrapper=(double) 56545;
		System.out.println("primitivo: "+sueldo);
		System.out.println("wrapper: "+sueldoWrapper);
		
		//convertido2
		Double	 sueldo1=(double) 45455;
		double	 sueldoWrapper1=sueldo1.doubleValue();
		System.out.println("de Double a double: "+sueldoWrapper1);
		
		
		
		
		
		
	}

}
