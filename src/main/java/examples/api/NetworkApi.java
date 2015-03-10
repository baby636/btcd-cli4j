package examples.api;

import java.io.IOException;
import java.util.Properties;

import org.apache.http.client.HttpClient;

import examples.util.ExampleUtils;

/**A list of examples demonstrating the use of <i>bitcoind</i>'s 'Network API' commands 
 * currently supported by btcd-cli4j (as of 0.2.8). Calling any of the methods below will cause a
 * short overview (<i>i.e.</i> of the results of the operation) to be written to {@code stdout}.*/
public class NetworkApi {

	public static void main(String[] args) throws IOException {
		HttpClient httpProvider = ExampleUtils.getHttpProvider();
		Properties nodeConfig = ExampleUtils.getNodeConfig();
		ApiCalls supportedCalls = new ApiCalls(httpProvider, nodeConfig);
		
//		supportedCalls.getPeerInfo();
//		supportedCalls.ping();
	}
}