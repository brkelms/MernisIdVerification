import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("901412333111" ), "MAHMUT", "DAROL", 1988);
		
		System.out.println("Do�rulama : " + (result ? "ba�ar�l�" : "ba�ar�s�z"));
	}

}
