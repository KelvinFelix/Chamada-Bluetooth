/****************************************************************************************************
 * 
 ****************************************************************************************************/
package br.edu.fatec.chamada;

import android.bluetooth.BluetoothDevice;

/****************************************************************************************************
 * todo TESTE conflito
 * Alteração de Leandro Grande
 *
 * @author Teste Fabio
 ****************************************************************************************************/
public class Aluno {
	
	private String bluetoothMacAddress;
	private String nome;
	private int id;
	
	/****************************************************************************************************
	 * @return the bluetoothMacAddress
	 ****************************************************************************************************/
	public String getBluetoothMacAddress() {
		return bluetoothMacAddress;
	}
	
	/****************************************************************************************************
	 * @param bluetoothMacAddress the bluetoothMacAddress to set
	 ****************************************************************************************************/
	public void setBluetoothMacAddress(String bluetoothMacAddress) {
		this.bluetoothMacAddress = bluetoothMacAddress;
	}
	
	/****************************************************************************************************
	 * @return retorna string 'nome'
	 ****************************************************************************************************/
	public String getNome() {
		return nome;
	}
	
	/****************************************************************************************************
	 * @param nome the nome to set
	 ****************************************************************************************************/
	public void setNome(String nome) {
		this.nome = nome;
	}
	/****************************************************************************************************
	 * @return the id
	 ****************************************************************************************************/
	public int getId() {
		return id;
	}
	
	
	
	
}
