import java.util.Scanner;

public class Metric2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputMetricNumber = Double.parseDouble(scanner.nextLine());
        String inputMetric = scanner.nextLine();
        String outputMetric = scanner.nextLine();

        double convertedToMeter = 1;
        double convertedToOutputMeter = 0;

        if("m".equalsIgnoreCase(inputMetric)){
            convertedToMeter = inputMetricNumber;
        }else if("mm".equalsIgnoreCase(inputMetric)){
            convertedToMeter = inputMetricNumber / 1000;
        }else if("cm".equalsIgnoreCase(inputMetric)){
            convertedToMeter = inputMetricNumber / 100;
        }else if("mi".equalsIgnoreCase(inputMetric)){
            convertedToMeter = inputMetricNumber / 0.000621371192;
        }else if("in".equalsIgnoreCase(inputMetric)){
            convertedToMeter = inputMetricNumber / 39.3700787;
        }else if("km".equalsIgnoreCase(inputMetric)){
            convertedToMeter = inputMetricNumber / 0.001;
        }else if("ft".equalsIgnoreCase(inputMetric)){
            convertedToMeter = inputMetricNumber / 3.2808399;
        }else if ("yd".equalsIgnoreCase(inputMetric)){
            convertedToMeter = inputMetricNumber / 1.0936133;
        }
        if("m".equalsIgnoreCase(outputMetric)){
            convertedToOutputMeter = convertedToMeter;
        }else if("mm".equalsIgnoreCase(outputMetric)){
            convertedToOutputMeter = convertedToMeter * 1000;
        }else if("cm".equalsIgnoreCase(outputMetric)){
            convertedToOutputMeter = convertedToMeter * 100;
        }else if("mi".equalsIgnoreCase(outputMetric)){
            convertedToOutputMeter = convertedToMeter * 0.000621371192;
        }else if("in".equalsIgnoreCase(outputMetric)){
            convertedToOutputMeter = convertedToMeter * 39.3700787;
        }else if("km".equalsIgnoreCase(outputMetric)){
            convertedToOutputMeter = convertedToMeter * 0.001;
        }else if("ft".equalsIgnoreCase(outputMetric)){
            convertedToOutputMeter = convertedToMeter * 3.2808399;
        }else if ("yd".equalsIgnoreCase(outputMetric)){
            convertedToOutputMeter = convertedToMeter * 1.0936133;
        }
        System.out.printf("%.8f", convertedToOutputMeter);
    }
}
