package co.edu.uniquindio.aerollinea.controllers;

import co.edu.uniquindio.aerollinea.exceptions.PasajeroException;
import co.edu.uniquindio.aerollinea.model.Aerolinea;
import co.edu.uniquindio.aerollinea.model.Pasajero;
import co.edu.uniquindio.aerollinea.model.services.IModelFactoryServices;

public class ModelFactoryController implements IModelFactoryServices{
	Aerolinea aerolinea;


	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aqu� al ser protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	// M�todo para obtener la instancia de nuestra clase
	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	public ModelFactoryController() {
		System.out.println("Invocando singleton");
		inicializarDatos();
	}


	public void inicializarDatos( ){

		aerolinea = new Aerolinea();
	}

	public Aerolinea getAerolinea() {
		
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}

	@Override
	public String crearPasajero(String nombre, String apellido, String cedula, String ciudad, String telefono,
			String fechaNacimiento) { 
		// TODO Auto-generated method stub
		String mensaje="";
		
			try {
				getAerolinea().crearPasajeroPasajero(nombre, apellido, cedula, ciudad, telefono, fechaNacimiento);
				mensaje= "Se ha creado correctamente";
			} catch (PasajeroException e) {
				// TODO Auto-generated catch block
				mensaje= e.getMessage();
			}
			
		return mensaje;
		
		
	}

	@Override
	public boolean eliminarPasajero(String nombre, String apellido, String cedula, String ciudad, String telefono,
			String fechaNacimiento) {
		// TODO Auto-generated method stub
		boolean aux=false;
		return aux;
	}
	
	
	


}
