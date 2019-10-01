package googleSearchTest;


import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)

public class GoogleJSON {
 @JsonProperty ("totalResults")
 public String totalResults;
 @JsonProperty ("request")
 public String request;

}

