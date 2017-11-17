package ro.sci.domain;

public class SearchCauciucRequest {
    public String type;
    public float size;

    public SearchCauciucRequest(String type, float size) {
        this.type = type;
        this.size = size;
    }
}
