package org.api.counter.bo;

public class APICount {

	/* this field represent the number of calls 
	 * made to counter service*/
    private final long calls;
    
    private final String timestamp;

    public APICount(long calls, String timestamp) {
        this.calls = calls;
        this.timestamp = timestamp;
    }

    public long getCalls() {
        return calls;
    }

    public String getTimestamp() {
        return timestamp;
    }
}