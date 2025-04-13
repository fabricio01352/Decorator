package com.mitocode.decorador;

import com.mitocode.interf.ICuentaBancaria;
import com.mitocode.model.Cuenta;


// Simular un decorador que representa un blindaje adicional a la cuenta del cliente

public class BlindajeDecorador extends CuentaDecorador {

	public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
	}
//
	@Override
	public void abrirCuenta(Cuenta c) {
		cuentaDecorada.abrirCuenta(c);
		agregarBlindaje(c);
	}

	public void agregarBlindaje(Cuenta c) {		
		System.out.println("Se agreg� blindaje a la cuenta del cliente " + c.getCliente());
	}

}
