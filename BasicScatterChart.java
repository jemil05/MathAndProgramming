import javafx.application.Application;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;

public class BasicScatterChart extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		NumberAxis abscissa = new NumberAxis();
		abscissa.setLabel("x-axis(abscissa)");
		NumberAxis ordinate = new NumberAxis();
		ordinate.setLabel("y-axis(ordinate)");
		Series series = new Series();
		//Plot the following points
		series.getData().add(new Data(0, 0));
		series.getData().add(new Data(1, 1.5));
		series.getData().add(new Data(2, 2.8));
		series.getData().add(new Data(3.2, 4));
		series.getData().add(new Data(6, 7.9));
		ScatterChart<Number,Number> scatterChart =
		new ScatterChart<>(abscissa, ordinate);
		scatterChart.getData().add(series);
		Scene scene = new Scene(scatterChart, 800, 600);
		stage.setScene(scene);
		stage.show();
	}
}
