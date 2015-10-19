package ca.mcgill.mcb.pcingola.snpEffect.testCases;

import org.junit.Test;

import ca.mcgill.mcb.pcingola.fileIterator.VcfFileIterator;
import ca.mcgill.mcb.pcingola.util.Gpr;
import ca.mcgill.mcb.pcingola.vcf.VcfEffect;
import ca.mcgill.mcb.pcingola.vcf.VcfEntry;

/**
 * Test case
 *
 */
public class TestCasesZzz {

	public TestCasesZzz() {
		super();
	}

	/**
	 * Exon.frameCorrection: Exon too short (size: 1), cannot correct frame!
	 */
	@Test
	public void testCase_zzz() {
		Gpr.debug("Test");
		String vcfFile = "tests/tfbs_ablation.vcf";
		VcfFileIterator vcf = new VcfFileIterator(vcfFile);
		for (VcfEntry ve : vcf) {
			System.out.println(ve);
			for (VcfEffect veff : ve.getVcfEffects()) {
				System.out.println("\t" + veff);
			}
		}
	}

}
