package org.snpeff;

import org.snpeff.fileIterator.VcfFileIterator;
import org.snpeff.util.Gpr;
import org.snpeff.vcf.VcfEntry;

public class Zzz {

	public static void main(String[] args) {
		VcfFileIterator vcf = new VcfFileIterator(Gpr.HOME + "/snpEff/z.vcf");
		for (VcfEntry ve : vcf) {
			System.out.println(ve);
		}
	}
}
