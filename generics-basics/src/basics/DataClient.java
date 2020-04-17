package basics;

public class DataClient {

	public static void main(String[] args) {

		DataV1 data1 = new DataV1("jai shree ram");
		String dataVal1 = data1.getData();
		System.out.println(dataVal1);
		
		DataV1 intData = new DataV1(23);
		int val2 = intData.getIntData();
		System.out.println(val2);
		
		System.out.println("object refence type");
		
		DataV2 dataV2 = new DataV2("jai pavan putra");
		//by mistake casts to wrong class type
		//Integer i = (Integer) dataV2.getData();
		
		String i = (String) dataV2.getData();
		System.out.println(i);
		
		System.out.println("generic type starts");
		//generic helps compiler to block entry
		//DataV3<String> stringData = new DataV3<String>(23);
	
		DataV3<String> stringData = new DataV3<String>("jai siya ram");
		System.out.println(stringData.getData());
		
		DataV3<Integer> integerData = new DataV3<>(23);
		System.out.println(integerData.getData());
		//raw type
		//collection and normal data behaves same way
		DataV3 kala = new DataV3(23);
		System.out.println(kala.getData());
		
		DataV3 kala1 = new DataV3("jai dharm ki");
		System.out.println(kala1.getData());
		
		IData<String> stringIdata = new DataV3<String>("jai shree ram from kanishk");
		String kanishkString = stringIdata.getData();
		System.out.println(kanishkString);
		
		IData<Integer> integerIdata = new DataV3<>(108);
		int kanishkInt = integerIdata.getData();
		System.out.println(kanishkInt);
	}

}
