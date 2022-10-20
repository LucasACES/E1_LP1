package atividade.e1.home;

import atividade.e1.home.Vehicle;
import java.util.ArrayList;



public class DataModeler {
	ArrayList<String> vehicleList = new ArrayList();
	
	public void arrayVehicleBuild(String objectVehicle) {
		int sizeVehicle = vehicleList.size();
		int lastVehicle = vehicleList.lastIndexOf(vehicleList);
		if(lastVehicle == 0) {
			vehicleList.add(objectVehicle);
		}else {
			vehicleList.add(sizeVehicle++, objectVehicle);
		}
		System.out.println(vehicleList);
	}
	
}
