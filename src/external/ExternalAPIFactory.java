package external;

public class ExternalAPIFactory {
	private static final String DEFAULT_PIPELINE = "yelp";

	// Start different APIs based on pipeline
	public static ExternalAPI getExternalAPI(String pipeline) {
		switch (pipeline) {
		case "yelp":
			return new YelpAPI();
		default:
			throw new IllegalArgumentException("Invalid pipeline " + pipeline);
		}
	}

	public static ExternalAPI getExternalAPI() {
		return getExternalAPI(DEFAULT_PIPELINE);
	}
}
