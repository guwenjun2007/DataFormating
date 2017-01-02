import java.io.File;

import weka.core.Attribute;
import weka.core.converters.CSVLoader;
import weka.core.converters.ArffSaver;
import weka.core.Instances;

/**
 * Generates a little ARFF file with different attribute types.
 *
 * @author FracPete
 */
public class trys {

	public static void main(String[] args) throws Exception {
	    //load the CSV files
	    CSVLoader loader = new CSVLoader();
	    loader.setNoHeaderRowPresent(true);
	    // get the resource of the data in .csv file
	    loader.setSource(new File("D:/book/train.csv"));
	    Instances data = loader.getDataSet();
	    
	    ArffSaver saver = new ArffSaver();
	    saver.setInstances(data);
	    // set the location of the data in .arff file
	    saver.setFile(new File("D:/book/train.arff"));
	    saver.writeBatch();
  }
}