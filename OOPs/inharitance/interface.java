package OOPs.inharitance;

import java.io.*;
import java.lang.*;
import java.util.*;

interface one {
	public void print_name();
}

interface two {
	public void print_midlename();
}

interface three extends one, two {
	public void print_lastname();
}



class Main {
	public static void main(String[] args)
	{
		three c = new three();
		c.print_name();
		c.print_midlename();
		c.print_lastname();
	}
}
// class SolarSystem {
// }
// class Earth extends SolarSystem {
// }
// class Mars extends SolarSystem {
// }
// class Moon extends Earth {
// 	public static void main(String args[])
// 	{
// 		SolarSystem s = new SolarSystem();
// 		Earth e = new Earth();
// 		Mars m = new Mars();

// 		System.out.println(s instanceof SolarSystem);
// 		System.out.println(e instanceof Earth);
// 		System.out.println(m instanceof SolarSystem);
// 	}
// }

