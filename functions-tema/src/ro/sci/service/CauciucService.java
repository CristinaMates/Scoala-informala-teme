package ro.sci.service;

import ro.sci.domain.Cauciuc;


public class CauciucService {
    Cauciuc[] cauciuce;

    public CauciucService() {
        initLocalCauciuce();
    }

    public Cauciuc findCauciuc(String type) {
        Cauciuc foundCauciuc = null;
        for (Cauciuc cauciuc : cauciuce) {
            if (type != null && type.equals(cauciuc.type)) {
                foundCauciuc = cauciuc;
                break;
            }
        }
        return foundCauciuc;
    }

    private void initLocalCauciuce() {
        Cauciuc c1 = new Cauciuc("de vara");
        c1.size = 22f;

        Cauciuc c2 = new Cauciuc("de iarna");
        c2.size = 30f;

        cauciuce = new Cauciuc[]{c1, c2};
    }
}
