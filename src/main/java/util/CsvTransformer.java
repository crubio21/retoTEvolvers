package util;


import net.thucydides.core.steps.stepdata.CSVTestDataSource;
import net.thucydides.core.steps.stepdata.TestDataSource;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CsvTransformer {
    private CsvTransformer() {
        throw new IllegalStateException("CsvTransformer class");
    }

    public static List<Map<String, String>> getRowsCsv(String nameCSV, String filter) throws IOException {
        TestDataSource testData = new CSVTestDataSource("./src/test/resources/datadriven/data_" + nameCSV + ".csv", ';');
        return convertDataCsvList(testData, filter);
    }

    public static List<Map<String, String>> convertDataCsvList(TestDataSource testData, String filter) {
        List<Map<String, String>> dataLoaded = testData.getData();
        if ("".equals(filter)) {
            return dataLoaded;
        }
        String[] arrayDataToFilter = filter.split(",");
        return filterDataCSV(arrayDataToFilter, dataLoaded);
    }

    public static List<Map<String, String>> filterDataCSV(String[] array, List<Map<String, String>> dataLoaded) {
        return dataLoaded
                .stream()
                .filter(row -> inArray(array, row.get("filter")))
                .collect(Collectors.toList());
    }

    public static boolean inArray(String[] arr, String item) {
        if (arr.length > 0) {
            for (String n : arr) {
                if (item.equals(n)) {
                    return true;
                }
            }
        }
        return false;
    }
}
