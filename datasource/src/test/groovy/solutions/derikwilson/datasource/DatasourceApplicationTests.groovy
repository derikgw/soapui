package solutions.derikwilson.datasource

import org.junit.jupiter.api.Test
import solutions.derikwilson.datasource.excel.DataSource

class DatasourceApplicationTests {

	@Test
	void contextLoads() {

		List<String> propertyNames = new LinkedList<>()
		propertyNames.add("zipCode")

		List<Map<String, String>> properties = new DataSource().setPropertiesFromExcel(
				propertyNames,
				"D:\\development\\repos\\gh\\soapui\\testData\\testData.xlsx",
				"Sheet1",
				0,0
		)

		// Assuming 'properties' is your List<Map<String, String>> from the setPropertiesFromExcel method
		properties.each { propertyMap ->
			// propertyMap is now a Map<String, String> for each row of your Excel data
			propertyMap.each { propertyName, propertyValue ->
				// Inside this closure, you can access the property name and value
				println("Property Name: $propertyName - Property Value: $propertyValue")
			}
			// Add a separator or additional logic if needed
			println("----- End of Row -----")
		}

	}

}
