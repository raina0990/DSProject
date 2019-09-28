package bloomfilter;
import java.io.*;

import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class LineChart extends ApplicationFrame {

	public LineChart(String applicationTitle, String chartTitle) {
		super(applicationTitle);
		// TODO Auto-generated constructor stub
		JFreeChart lineChart = ChartFactory.createLineChart(
				chartTitle, 
				"Number of Words","False Positive Rate",  createdataset(),
				PlotOrientation.VERTICAL,true,true,false);
		
		
		
		ChartPanel chartPanel = new ChartPanel(lineChart);
		chartPanel.setPreferredSize(new java.awt.Dimension(560,367));
		setContentPane(chartPanel);
	}
	
	private CategoryDataset createdataset() {
		// TODO Auto-generated method stub
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		  dataset.addValue( 0.25 , "2(8)" , "10" );
	      dataset.addValue( 0.3 , "2(8)" , "50" );
	      dataset.addValue( 0.1 , "2(8)" ,  "100" );
		  dataset.addValue( 0.5 , "2(8)" , "500" );
	      dataset.addValue( 0.2 ,"2(8)" , "1000" );
	      dataset.addValue( 0.9 , "2(8)" , "5000" );
	      
	      dataset.addValue( 0.1 , "2(10)" , "10" );
	      dataset.addValue( 0.2 , "2(10)" , "50" );
	      dataset.addValue( 0.3 , "2(10)" ,  "100" );
		  dataset.addValue( 0.4 , "2(10)" , "500" );
	      dataset.addValue( 0.5 ,"2(10)" , "1000" );
	      dataset.addValue( 0.8 , "2(10)" , "5000" );
	      
	      dataset.addValue( 0.0 , "2(12)" , "10" );
	      dataset.addValue( 0.1 , "2(12)" , "50" );
	      dataset.addValue( 0.35 , "2(12)" ,  "100" );
		  dataset.addValue( 0.4 , "2(12)" , "500" );
	      dataset.addValue( 0.56 ,"2(12)" , "1000" );
	      dataset.addValue( 0.9 , "2(12)" , "5000" );
	      
	      dataset.addValue( 0.0 , "2(14)" , "10" );
	      dataset.addValue( 0.1 , "2(14)" , "50" );
	      dataset.addValue( 0.25 , "2(14)" ,  "100" );
		  dataset.addValue( 0.45 , "2(14)" , "500" );
	      dataset.addValue( 0.6 ,"2(14)" , "1000" );
	      dataset.addValue( 0.85 , "2(14)" , "5000" );
	      
	      dataset.addValue( 0.0 , "2(16)" , "10" );
	      dataset.addValue( 0.7 , "2(16)" , "50" );
	      dataset.addValue( 0.15 , "2(16)" ,  "100" );
		  dataset.addValue( 0.35 , "2(16)" , "500" );
	      dataset.addValue( 0.7 ,"2(16)" , "1000" );
	      dataset.addValue( 1.0 , "2(16)" , "5000" );
	      
	      
		return dataset;
	}

}
