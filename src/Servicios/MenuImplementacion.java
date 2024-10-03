package Servicios;

import java.util.Scanner;
/*
 * Implementacion de los menus de la aplicacion
 * 03/10/2024
 * @author irodhan
 */
public class MenuImplementacion implements MenuInterfaz{
	Scanner sc = new Scanner(System.in);
	@Override
	public int mostrarMenuYSeleccion() {
		int opcion=0;
		System.out.println("|----------------------|");
		System.out.println("|         Menú         |");
		System.out.println("|----------------------|");
		System.out.println("| 0. Cerrar App        |");
		System.out.println("| 1. Dar alta usuario  |");
		System.out.println("| 2. Dar alta club     |");
		System.out.println("|----------------------|");
		opcion=sc.nextInt();
		sc.close();
		return opcion;
	}

}
