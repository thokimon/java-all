package OOPs.inharitance;
import java.io.*;
import java.lang.*;
import java.util.*;

class one {
	public void print_ad()
	{
		System.out.println("ad ");
	}
}

class two extends one {
	public void print_for() { System.out.println("ad"); }
}

class three extends two {
	public void print_ad()
	{
		System.out.println("ad");
	}
}


class ad {
	public static void main(String[] args)
	{
		three g = new three();
		g.print_ad();
		g.print_for();
		g.print_ad();
	}
}
