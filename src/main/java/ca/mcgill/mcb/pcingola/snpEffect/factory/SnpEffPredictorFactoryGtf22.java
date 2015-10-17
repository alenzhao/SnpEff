package ca.mcgill.mcb.pcingola.snpEffect.factory;

import ca.mcgill.mcb.pcingola.interval.Gtf2Marker;
import ca.mcgill.mcb.pcingola.snpEffect.Config;

/**
 * This class creates a SnpEffectPredictor from a GTF 2.2 file
 *
 * References: http://mblab.wustl.edu/GTF22.html
 *
 * @author pcingola
 */
public class SnpEffPredictorFactoryGtf22 extends SnpEffPredictorFactoryGff {

	public SnpEffPredictorFactoryGtf22(Config config) {
		super(config);
		version = "GTF22";
		fileName = config.getBaseFileNameGenes() + ".gtf";
	}

	@Override
	protected boolean parse(String line) {
		Gtf2Marker gffMarker = new Gtf2Marker(genome, line);
		return addInterval(gffMarker);
	}
}
