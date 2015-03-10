package examples.api;

import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import org.apache.http.client.HttpClient;

import examples.util.ExampleUtils;

/**A list of examples demonstrating the use of <i>bitcoind</i>'s 'Utility API' commands 
 * currently supported by btcd-cli4j (as of 0.2.8). Calling any of the methods below will cause a
 * short overview (<i>i.e.</i> of the results of the operation) to be written to {@code stdout}.*/
public class UtilityApi {

	public static void main(String[] args) throws IOException {
		HttpClient httpProvider = ExampleUtils.getHttpProvider();
		Properties nodeConfig = ExampleUtils.getNodeConfig();
		ApiCalls supportedCalls = new ApiCalls(httpProvider, nodeConfig);
		
		supportedCalls.createMultiSig(2, Arrays.asList(new String[]{"mmfPHrvaoqqQLGkStcYgrbgiBFTvsjFzgx",
				"mhgPHX4kmzV8NgfoUtfhUwWEMZHQEZeMbH", "mxPop5NWu8ok5wbGv46wsASPKyC7yKYix3"}));
//		supportedCalls.validateAddress("2MyVxxgNBk5zHRPRY2iVjGRJHYZEp1pMCSq");
//		supportedCalls.verifyMessage("mixnciYh9dar2CwywYYZTHZqS4kyZWkvoV", "INXVUmzGIh+VnkiFAVgNiw1" 
//				+ "t35oSxxvwc6e53hrjMtBdVm/GoTyDY+TelMV64pVrdMY0s9fW5M1bWZl+kcnCQ0g=", "I love liquorice.");
	}
}