package ro.sci.service;

import ro.sci.domain.SearchCauciucRequest;
import ro.sci.domain.Cauciuc;


public class SearchService {
    private CauciucService cauciucService = new CauciucService();

    public Cauciuc search(SearchCauciucRequest searchCauciucRequest) {
        Cauciuc validCauciuc = null;

        if (searchCauciucRequest != null) {
            Cauciuc cauciuc = this.cauciucService.findCauciuc(searchCauciucRequest.type);

            if (cauciuc != null) {
                validCauciuc = cauciuc;
            }
        }
        return validCauciuc;
    }
}
