package com.mitocode.decorador;

import com.mitocode.interf.ICuentaBancaria;
import com.mitocode.model.Cuenta;

public abstract class CuentaDecorador implements ICuentaBancaria{

	protected ICuentaBancaria cuentaDecorada;
	
	public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
		this.cuentaDecorada = cuentaDecorada;
	}


	// este metodo de abrir cuenta va ser de cuenta ahorro o cuenta corriente,
//	ya que ambos son implementaciones de ICuentaBancaria
	@Override
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
	}	
	
}
